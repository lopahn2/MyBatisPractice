package com.example.chatbot;

import com.example.chatbot.mapper.PlaceMapper;
import com.example.chatbot.model.Place;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlaceServiceImpl implements PlaceService {
    private final PlaceMapper placeMapper;

    public Place getPlaceById(Long id) {
        return placeMapper.getPlaceById(id).orElse(null);
    }

    public List<Place> getAllPlaces() {
        return placeMapper.getAllPlaces();
    }

    public void insertPlace(Place place) {
        placeMapper.insertPlace(place);
    }

    public void updatePlace(Place place) {
        placeMapper.updatePlace(place);
    }

    public void deletePlace(int id) {
        placeMapper.deletePlace(id);
    }
}
