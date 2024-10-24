package co.id.zahir.nutech.simsppob.core.configs;

import co.id.zahir.nutech.simsppob.app.modules.memberships.model.UserEntity;
import co.id.zahir.nutech.simsppob.app.modules.memberships.repository.UserRepository;
import co.id.zahir.nutech.simsppob.core.exceptions.UnauthorizedException;
import co.id.zahir.nutech.simsppob.core.model.UserContext;
import co.id.zahir.nutech.simsppob.core.model.WhitelistEndpoint;
import co.id.zahir.nutech.simsppob.core.util.CoreResourceParameter;
import co.id.zahir.nutech.simsppob.core.util.JwtService;
import io.jsonwebtoken.Claims;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Configuration
@Slf4j
@AllArgsConstructor
public class RequestFilter implements Filter {
    private final JwtService jwtService;
    private final UserRepository userRepository;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse resp = (HttpServletResponse) servletResponse;

        // METHOD
        String method = req.getMethod();
        log.info(method);
        // URL PATH
        String url = req.getRequestURI();
        log.info(url);

        List<WhitelistEndpoint> whitelistEndpoint = CoreResourceParameter.getWhitelistEndpoint();
        // QUERY PARAMS
        String queryParams = req.getQueryString();
        log.info(queryParams);

        boolean isWhitelisted = whitelistEndpoint.stream().anyMatch(s -> s.getUrl().equals(url) && s.getMethod().equals(method));
        log.info("whitelisted ? {}",isWhitelisted);

        if (!isWhitelisted) {
            String authorization = req.getHeader("Authorization");

            String errMsg = "Token tidak tidak valid atau kadaluwarsa";

            if (authorization != null && authorization.contains("Bearer ")) {
                String token = authorization.split(" ")[1];
                Claims claims = jwtService.extractAllClaims(token);
                String email = claims.getSubject();

                UserEntity userByEmail = userRepository.getUserByEmail(email);
                if (userByEmail != null) {
                    UserContext.setCurrentUser(userByEmail.getEmail());
                }
            }

            if (UserContext.getCurrentUser() == null) {
                throw new UnauthorizedException(108,errMsg);
            }

        }

        try {
            filterChain.doFilter(req,resp);
        } finally {
            log.info("delete {}",UserContext.getCurrentUser());
            UserContext.clear();
        }
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
