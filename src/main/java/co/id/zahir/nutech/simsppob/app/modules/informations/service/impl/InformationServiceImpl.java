package co.id.zahir.nutech.simsppob.app.modules.informations.service.impl;

import co.id.zahir.nutech.simsppob.app.modules.informations.model.data.BannerInfData;
import co.id.zahir.nutech.simsppob.app.modules.informations.model.data.ServiceInfData;
import co.id.zahir.nutech.simsppob.app.modules.informations.model.entity.BannerEntity;
import co.id.zahir.nutech.simsppob.app.modules.informations.model.entity.ServiceEntity;
import co.id.zahir.nutech.simsppob.app.modules.informations.repository.BannerRepository;
import co.id.zahir.nutech.simsppob.app.modules.informations.repository.ServicesRepository;
import co.id.zahir.nutech.simsppob.app.modules.informations.service.InformationService;
import co.id.zahir.nutech.simsppob.app.modules.informations.util.InformationMapper;
import co.id.zahir.nutech.simsppob.core.model.BaseResponseData;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class InformationServiceImpl implements InformationService {
    private final ServicesRepository servicesRepository;
    private final BannerRepository bannerRepository;
    @Override
    public BaseResponseData<List<BannerInfData>> banner() {
        BaseResponseData<List<BannerInfData>> retval = new BaseResponseData<>();
        List<BannerEntity> bannerEntities = bannerRepository.get();
        retval.setData(InformationMapper.mapBanners(bannerEntities));
        return retval;
    }

    @Override
    public BaseResponseData<List<ServiceInfData>> service() {
        BaseResponseData<List<ServiceInfData>> retval = new BaseResponseData<>();
        List<ServiceEntity> serviceEntities = servicesRepository.get();
        retval.setData(InformationMapper.mapServices(serviceEntities));
        return retval;
    }
}
