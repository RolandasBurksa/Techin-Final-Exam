package lt.techin.exam.advertising_app.mapper;

import lt.techin.exam.advertising_app.dto.AdvertDto;
import lt.techin.exam.advertising_app.model.Advert;

public class AdvertMapper {

    public static AdvertDto mapToAdvertDto(Advert advert){
        return new AdvertDto(advert.getId(), advert.getTitle(), advert.getDescription(), advert.getComment(), advert.getCategory().getId());
    }

    public static Advert mapToAdvert(AdvertDto advertDto){
        Advert advert = new Advert();
        advert.setId(advertDto.getId());
        advert.setTitle(advertDto.getTitle());
        advert.setDescription(advertDto.getDescription());
        advert.setComment(advert.getComment());
        return advert;
    }
}
