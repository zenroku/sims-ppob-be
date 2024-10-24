package co.id.zahir.nutech.simsppob.core.configs;

import co.id.zahir.nutech.simsppob.core.exceptions.BadRequestException;
import co.id.zahir.nutech.simsppob.core.exceptions.UnauthorizedException;
import co.id.zahir.nutech.simsppob.core.model.BaseResponseData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<BaseResponseData<Object>> badRequestException(BadRequestException ex) {
        BaseResponseData<Object> errResp = new BaseResponseData<>();
        errResp.setMessage(ex.getMessage());
        errResp.setStatus(ex.getCode());
        return new ResponseEntity<>(errResp, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(UnauthorizedException.class)
    public ResponseEntity<BaseResponseData<Object>> unauthorizedException(UnauthorizedException ex) {
        BaseResponseData<Object> errResp = new BaseResponseData<>();
        errResp.setMessage(ex.getMessage());
        errResp.setStatus(ex.getCode());
        return new ResponseEntity<>(errResp, HttpStatus.UNAUTHORIZED);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> internalServerError(Exception ex) {
        BaseResponseData<Object> errResp = new BaseResponseData<>();
        errResp.setMessage("Server Failure");
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errResp);
    }
}
