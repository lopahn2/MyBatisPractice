package com.example.chatbot;

import com.example.chatbot.model.Place;

import java.util.List;

public interface PlaceService {
    Place getPlaceById(Long id);

    List<Place> getAllPlaces();

    void insertPlace(Place place);

    void updatePlace(Place place);

    void deletePlace(int id);
}
