package co.id.zahir.nutech.simsppob.app.modules.informations.util;

import co.id.zahir.nutech.simsppob.app.modules.informations.model.data.BannerInfData;
import co.id.zahir.nutech.simsppob.app.modules.informations.model.data.ServiceInfData;
import co.id.zahir.nutech.simsppob.app.modules.informations.model.entity.BannerEntity;
import co.id.zahir.nutech.simsppob.app.modules.informations.model.entity.ServiceEntity;

import java.util.List;
import java.util.stream.Collectors;

public class InformationMapper {
    public static List<ServiceInfData> mapServices(List<ServiceEntity> data){
        return data.stream().map(s-> {
            ServiceInfData sid = new ServiceInfData();
            sid.setServiceCode(s.getServiceCode());
            sid.setServiceName(s.getServiceName());
            sid.setServiceIcon(s.getServiceIcon());
            sid.setServiceTariff(s.getServiceTariff());
            return sid;
        }).collect(Collectors.toList());
    }

    public static List<BannerInfData> mapBanners(List<BannerEntity> data){
        return data.stream().map(s-> {
            BannerInfData bid = new BannerInfData();
            bid.setBannerName(s.getBannerName());
            bid.setBannerImage(s.getBannerImage());
            bid.setDescription(s.getDescription());
            return bid;
        }).collect(Collectors.toList());
    }
}
