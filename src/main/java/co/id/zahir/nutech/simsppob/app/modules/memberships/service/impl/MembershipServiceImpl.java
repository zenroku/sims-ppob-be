package co.id.zahir.nutech.simsppob.app.modules.memberships.service.impl;

import co.id.zahir.nutech.simsppob.app.modules.memberships.model.UserEntity;
import co.id.zahir.nutech.simsppob.app.modules.memberships.model.data.LoginData;
import co.id.zahir.nutech.simsppob.app.modules.memberships.model.data.ProfileData;
import co.id.zahir.nutech.simsppob.app.modules.memberships.model.dto.LoginDto;
import co.id.zahir.nutech.simsppob.app.modules.memberships.model.dto.ProfileUpdateDto;
import co.id.zahir.nutech.simsppob.app.modules.memberships.model.dto.RegistrationDto;
import co.id.zahir.nutech.simsppob.app.modules.memberships.repository.UserRepository;
import co.id.zahir.nutech.simsppob.app.modules.memberships.service.MembershipService;
import co.id.zahir.nutech.simsppob.core.model.BaseResponseData;
import co.id.zahir.nutech.simsppob.core.util.HashPassUtil;
import co.id.zahir.nutech.simsppob.core.util.JwtService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MembershipServiceImpl implements MembershipService {
    private final UserRepository userRepository;
    private final JwtService jwtService;

    @Override
    public BaseResponseData<Object> register(RegistrationDto body) {
        BaseResponseData<Object> resp = new BaseResponseData<>();

        UserEntity newUser = new UserEntity();
        newUser.setEmail(body.getEmail());
        newUser.setFirstName(body.getFirstName());
        newUser.setLastName(body.getLastName());
        newUser.setPassword(HashPassUtil.hash(body.getPassword()));
        userRepository.createUser(newUser);

        resp.setMessage("Registrasi berhasil silahkan login");
        return resp;
    }

    @Override
    public BaseResponseData<LoginData> login(LoginDto body) {
        BaseResponseData<LoginData> resp = new BaseResponseData<>();
        resp.setMessage("Login Sukses");
        UserEntity userByEmail = userRepository.getUserByEmail(body.getEmail());
        if (userByEmail != null) {
            boolean matched = HashPassUtil.isMatched(body.getPassword(), userByEmail.getPassword());
            if (matched) {
                String token = jwtService.generateToken(body.getEmail());
                LoginData data = new LoginData();
                data.setToken(token);
                resp.setData(data);
            }
        }
        return resp;
    }

    @Override
    public BaseResponseData<ProfileData> profile() {
        BaseResponseData<ProfileData> resp = new BaseResponseData<>();
        ProfileData profileData = new ProfileData();
        profileData.setEmail("zahir.frahman@gmail.com");
        profileData.setProfileImage("empty.jpg");
        profileData.setFirstName("Zahir");
        profileData.setLastName("Fathurrahman");
        resp.setData(profileData);
        return resp;
    }

    @Override
    public BaseResponseData<ProfileData> profileUpdate(ProfileUpdateDto body) {
        return null;
    }

    @Override
    public BaseResponseData<ProfileData> profileImage() {
        return null;
    }
}
