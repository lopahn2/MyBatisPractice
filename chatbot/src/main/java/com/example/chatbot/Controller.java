package com.example.chatbot;

import com.example.chatbot.model.Place;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/places")
@RequiredArgsConstructor
public class Controller {
    private final PlaceService placeService;

    @GetMapping("/{id}")
    public Place getPlaceById(@PathVariable Long id) {
        return placeService.getPlaceById(id);
    }

    @GetMapping
    public List<Place> getAllPlaces() {
        return placeService.getAllPlaces();
    }

    @PostMapping
    public void insertPlace(@RequestBody Place place) {
        placeService.insertPlace(place);
    }

    @PutMapping("/{id}")
    public void updatePlace(@PathVariable Long id, @RequestBody Place place) {
        place.setId(id);
        placeService.updatePlace(place);
    }

    @DeleteMapping("/{id}")
    public void deletePlace(@PathVariable int id) {
        placeService.deletePlace(id);
    }
}
