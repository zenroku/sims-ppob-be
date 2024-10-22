package co.id.zahir.nutech.simsppob.app.modules.informations.controller.impl;

import co.id.zahir.nutech.simsppob.app.modules.informations.controller.InformationController;
import co.id.zahir.nutech.simsppob.app.modules.informations.model.data.BannerInfData;
import co.id.zahir.nutech.simsppob.app.modules.informations.model.data.ServiceInfData;
import co.id.zahir.nutech.simsppob.app.modules.informations.service.InformationService;
import co.id.zahir.nutech.simsppob.core.model.BaseResponseData;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class InformationControllerImpl implements InformationController {
    private final InformationService informationService;
    @Override
    @GetMapping("/banner")
    public BaseResponseData<List<BannerInfData>> banner() {
        return informationService.banner();
    }

    @Override
    @GetMapping("/services")
    public BaseResponseData<List<ServiceInfData>> service() {
        return informationService.service();
    }
}
