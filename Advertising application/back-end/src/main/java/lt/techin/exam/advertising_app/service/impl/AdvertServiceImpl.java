package lt.techin.exam.advertising_app.service.impl;

import lombok.AllArgsConstructor;
import lt.techin.exam.advertising_app.dto.AdvertDto;
import lt.techin.exam.advertising_app.service.AdvertService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AdvertServiceImpl implements AdvertService {


    @Override
    public AdvertDto addAdvert(AdvertDto advertDto) {
        return null;
    }

    @Override
    public AdvertDto getAdvert(Long id) {
        return null;
    }

    @Override
    public List<AdvertDto> getAllAdverts() {
        return List.of();
    }

    @Override
    public AdvertDto updateAdvert(AdvertDto advertDto, Long id) {
        return null;
    }

    @Override
    public void deleteAdvert(Long id) {

    }
}
