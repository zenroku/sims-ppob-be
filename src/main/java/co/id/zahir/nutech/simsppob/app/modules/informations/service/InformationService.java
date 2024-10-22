package co.id.zahir.nutech.simsppob.app.modules.informations.service;

import co.id.zahir.nutech.simsppob.app.modules.informations.model.data.BannerInfData;
import co.id.zahir.nutech.simsppob.app.modules.informations.model.data.ServiceInfData;
import co.id.zahir.nutech.simsppob.core.model.BaseResponseData;

import java.util.List;

public interface InformationService {
    BaseResponseData<List<BannerInfData>> banner();
    BaseResponseData<List<ServiceInfData>> service();
}
