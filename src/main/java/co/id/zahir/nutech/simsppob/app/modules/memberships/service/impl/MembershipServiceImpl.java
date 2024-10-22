package co.id.zahir.nutech.simsppob.app.modules.memberships.service.impl;

import co.id.zahir.nutech.simsppob.app.modules.memberships.model.data.LoginData;
import co.id.zahir.nutech.simsppob.app.modules.memberships.model.data.ProfileData;
import co.id.zahir.nutech.simsppob.app.modules.memberships.model.dto.LoginDto;
import co.id.zahir.nutech.simsppob.app.modules.memberships.model.dto.ProfileUpdateDto;
import co.id.zahir.nutech.simsppob.app.modules.memberships.model.dto.RegistrationDto;
import co.id.zahir.nutech.simsppob.app.modules.memberships.service.MembershipService;
import co.id.zahir.nutech.simsppob.core.model.BaseResponseData;
import org.springframework.stereotype.Service;

@Service
public class MembershipServiceImpl implements MembershipService {

    @Override
    public BaseResponseData<Object> register(RegistrationDto body) {
        return null;
    }

    @Override
    public BaseResponseData<LoginData> login(LoginDto body) {
        return null;
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
