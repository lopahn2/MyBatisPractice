package com.example.chatbot.model;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Place {
    private Long id;
    private String name;
    private String type;
    private String location;
    private Long rating;

}
