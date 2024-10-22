package co.id.zahir.nutech.simsppob.app.modules.memberships.controller.impl;

import co.id.zahir.nutech.simsppob.app.modules.memberships.controller.MembershipController;
import co.id.zahir.nutech.simsppob.app.modules.memberships.model.data.LoginData;
import co.id.zahir.nutech.simsppob.app.modules.memberships.model.data.ProfileData;
import co.id.zahir.nutech.simsppob.app.modules.memberships.model.dto.LoginDto;
import co.id.zahir.nutech.simsppob.app.modules.memberships.model.dto.ProfileUpdateDto;
import co.id.zahir.nutech.simsppob.app.modules.memberships.model.dto.RegistrationDto;
import co.id.zahir.nutech.simsppob.app.modules.memberships.service.MembershipService;
import co.id.zahir.nutech.simsppob.core.model.BaseResponseData;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class MembershipControllerImpl implements MembershipController {
    private final MembershipService membershipService;
    @PostMapping("/registration")
    public BaseResponseData<Object> register(@RequestBody RegistrationDto body){
        return membershipService.register(body);
    }

    @PostMapping("/login")
    public BaseResponseData<LoginData> login(LoginDto body) {
        return membershipService.login(body);
    }

    @GetMapping("/profile")
    public BaseResponseData<ProfileData> profile() {
        return membershipService.profile();
    }

    @PutMapping("profile/update")
    public BaseResponseData<ProfileData> profileUpdate(ProfileUpdateDto body) {
        return membershipService.profileUpdate(body);
    }

    @PutMapping("profile/image")
    public BaseResponseData<ProfileData> profileImage() {
        return membershipService.profileImage();
    }
}
