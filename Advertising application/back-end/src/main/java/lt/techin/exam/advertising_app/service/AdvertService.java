package lt.techin.exam.advertising_app.service;

import lt.techin.exam.advertising_app.dto.AdvertDto;

import java.util.List;

public interface AdvertService {

    AdvertDto addAdvert(AdvertDto advertDto);

    AdvertDto getAdvert(Long id);

    List<AdvertDto> getAllAdverts();

    AdvertDto updateAdvert(AdvertDto advertDto, Long id);

    void deleteAdvert(Long id);
}
