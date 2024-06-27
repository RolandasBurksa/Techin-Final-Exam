package lt.techin.exam.advertising_app.controller;

import lombok.AllArgsConstructor;
import lt.techin.exam.advertising_app.dto.AdvertDto;
import lt.techin.exam.advertising_app.service.AdvertService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("api/adverts")
@AllArgsConstructor
public class AdvertController {

        private AdvertService advertService;

        // Build Add Advert REST API
        @PostMapping
        public ResponseEntity<AdvertDto> addAdvert(@RequestBody AdvertDto advertDto){

            AdvertDto savedAdvert = advertService.addAdvert(advertDto);

            return new ResponseEntity<>(savedAdvert, HttpStatus.CREATED);
        }

        // Build Get Advert REST API
        @GetMapping("{id}")
        public ResponseEntity<AdvertDto> getAdvert(@PathVariable("id") Long advertId){
            AdvertDto advertDto = advertService.getAdvert(advertId);
            return new ResponseEntity<>(advertDto, HttpStatus.OK);
        }

        // Build Get All Adverts REST API
        @GetMapping
        public ResponseEntity<List<AdvertDto>> getAllAdverts(){
            List<AdvertDto> adverts = advertService.getAllAdverts();

            return ResponseEntity.ok(adverts);
        };

        // Build Update Advert REST API
        @PutMapping("{id}")
        public ResponseEntity<AdvertDto> updateAdvert(@RequestBody AdvertDto advertDto, @PathVariable("id") Long advertId){
            AdvertDto updatedAdvert = advertService.updateAdvert(advertDto, advertId);
            return ResponseEntity.ok(updatedAdvert);
        }

        // Build Delete Advert REST API
        @DeleteMapping("{id}")
        public ResponseEntity<String> deleteAdvert(@PathVariable("id") Long advertId){
            advertService.deleteAdvert(advertId);
            return ResponseEntity.ok("Advert deleted successfully!.");
        }


    }


















