package com.example.springBootDTO.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class UserLocationDTO {

    private long userId;

    private String email;

    private String place;

    private double longitude;

    private double latitude;
}
