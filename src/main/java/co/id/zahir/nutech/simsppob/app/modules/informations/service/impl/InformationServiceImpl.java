package co.id.zahir.nutech.simsppob.app.modules.informations.service.impl;

import co.id.zahir.nutech.simsppob.app.modules.informations.model.data.BannerInfData;
import co.id.zahir.nutech.simsppob.app.modules.informations.model.data.ServiceInfData;
import co.id.zahir.nutech.simsppob.app.modules.informations.service.InformationService;
import co.id.zahir.nutech.simsppob.core.model.BaseResponseData;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InformationServiceImpl implements InformationService {
    @Override
    public BaseResponseData<List<BannerInfData>> banner() {
        return null;
    }

    @Override
    public BaseResponseData<List<ServiceInfData>> service() {
        return null;
    }
}
