package co.id.zahir.nutech.simsppob.app.modules.informations.controller;

import co.id.zahir.nutech.simsppob.app.modules.informations.model.data.BannerInfData;
import co.id.zahir.nutech.simsppob.app.modules.informations.model.data.ServiceInfData;
import co.id.zahir.nutech.simsppob.core.model.BaseResponseData;

import java.util.List;

public interface InformationController {
    BaseResponseData<List<BannerInfData>> banner();
    BaseResponseData<List<ServiceInfData>> service();
}
