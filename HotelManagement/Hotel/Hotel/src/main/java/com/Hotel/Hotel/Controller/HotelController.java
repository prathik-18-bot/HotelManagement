package com.Hotel.Hotel.Controller;

import com.Hotel.Hotel.Model.HotelInfo;
import com.Hotel.Hotel.Repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
/*import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;*/

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/dapi")

public class HotelController {
    @Autowired
    private HotelRepository hotelRepository;
    @PostMapping("/create")
    public ResponseEntity<HotelInfo> createProduct(@RequestBody HotelInfo hotelInfo)
    {
        HotelInfo hotelInfo1=hotelRepository.save(hotelInfo);
        return ResponseEntity.ok().body(hotelInfo1);

    }
    @GetMapping("/getp")
    public ResponseEntity<List<HotelInfo>>getAllProduct()
    {
        List<HotelInfo> productData=hotelRepository.findAll();
        return ResponseEntity.ok().body(productData);
    }
    @PostMapping("/id/{id}")
    public ResponseEntity<Optional<HotelInfo>> getById(@PathVariable Long id) {
        Optional<HotelInfo> hotelInfo = hotelRepository.findById(id);
        if (hotelInfo.isPresent()) {
            return ResponseEntity.ok().body(hotelInfo);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @PostMapping("/delete/{id}")
    public ResponseEntity deleteById(@PathVariable Long id) {
        hotelRepository.deleteById(id);
        return ResponseEntity.ok().body("Deleted");

    }
}
