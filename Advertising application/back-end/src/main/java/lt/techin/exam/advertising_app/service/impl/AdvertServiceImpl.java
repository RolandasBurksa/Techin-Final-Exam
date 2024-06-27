package lt.techin.exam.advertising_app.service.impl;

import lombok.AllArgsConstructor;
import lt.techin.exam.advertising_app.dto.AdvertDto;
import lt.techin.exam.advertising_app.exception.ResourceNotFoundException;
import lt.techin.exam.advertising_app.mapper.AdvertMapper;
import lt.techin.exam.advertising_app.model.Advert;
import lt.techin.exam.advertising_app.model.Category;
import lt.techin.exam.advertising_app.repository.AdvertRepository;
import lt.techin.exam.advertising_app.repository.CategoryRepository;
import lt.techin.exam.advertising_app.service.AdvertService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class AdvertServiceImpl implements AdvertService {

    private AdvertRepository advertRepository;

    private CategoryRepository categoryRepository;

    @Override
    public AdvertDto addAdvert(AdvertDto advertDto) {

        Advert advert = AdvertMapper.mapToAdvert(advertDto);

        Category category = categoryRepository.findById(advertDto.getCategoryId())
                .orElseThrow(()->
                        new ResourceNotFoundException("Category does not exist with id: " + advertDto.getCategoryId()));

        advert.setCategory(category);

        Advert addedAdvert = advertRepository.save(advert);
        return AdvertMapper.mapToAdvertDto(addedAdvert);
    }

    @Override
    public AdvertDto getAdvert(Long id) {

        Advert advert = advertRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Advert not found with given id: " + id));

        return AdvertMapper.mapToAdvertDto(advert);

    }

    @Override
    public List<AdvertDto> getAllAdverts() {

        List<Advert> adverts =advertRepository.findAll();

        return adverts.stream()
                .map(AdvertMapper::mapToAdvertDto)
                .collect(Collectors.toList());

    }

    @Override
    public AdvertDto updateAdvert(AdvertDto advertDto, Long id) {

        Advert advert = advertRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Advert not found with given id: " + id));
                advert.setTitle(advertDto.getTitle());
                advert.setDescription(advertDto.getDescription());
                advert.setComment(advertDto.getComment());

        Category category = categoryRepository.findById(advertDto.getCategoryId())
                .orElseThrow(()->
                        new ResourceNotFoundException("Category does not exist with id: " + advertDto.getCategoryId()));

        advert.setCategory(category);

                Advert updatedAdvert = advertRepository.save(advert);

        return AdvertMapper.mapToAdvertDto(updatedAdvert);
    }

    @Override
    public void deleteAdvert(Long id) {

        Advert advert = advertRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Advert not found with given id: " + id));

        advertRepository.deleteById(id);

    }
}
