package com.example.chatbot.mapper;

import com.example.chatbot.model.Place;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Optional;

@Mapper
public interface PlaceMapper {
//    @Select("SELECT * FROM Place WHERE id = #{id}")
    Optional<Place> getPlaceById(Long id);

//    @Select("SELECT * FROM Place")
    List<Place> getAllPlaces();

//    @Insert("INSERT INTO Place(name, type, location, rating) VALUES(#{name}, #{type}, #{location}, #{rating})")
//    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insertPlace(Place place);

//    @Update("UPDATE Place SET name=#{name}, type=#{type}, location=#{location}, rating=#{rating} WHERE id=#{id}")
    void updatePlace(Place place);

//    @Delete("DELETE FROM Place WHERE id = #{id}")
    void deletePlace(int id);
}