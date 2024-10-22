package co.id.zahir.nutech.simsppob.app.modules.memberships.controller;

import co.id.zahir.nutech.simsppob.app.modules.memberships.model.data.LoginData;
import co.id.zahir.nutech.simsppob.app.modules.memberships.model.data.ProfileData;
import co.id.zahir.nutech.simsppob.app.modules.memberships.model.dto.LoginDto;
import co.id.zahir.nutech.simsppob.app.modules.memberships.model.dto.ProfileUpdateDto;
import co.id.zahir.nutech.simsppob.app.modules.memberships.model.dto.RegistrationDto;
import co.id.zahir.nutech.simsppob.core.model.BaseResponseData;

public interface MembershipController {
    BaseResponseData<Object> register(RegistrationDto body);
    BaseResponseData<LoginData> login(LoginDto body);
    BaseResponseData<ProfileData> profile();
    BaseResponseData<ProfileData> profileUpdate(ProfileUpdateDto body);
    BaseResponseData<ProfileData> profileImage();
}
