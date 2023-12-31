package com.example.jo.meteo.Service.API;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.net.URISyntaxException;

public interface WeatherApiInterface {
    String getWeatherForCity(String city) throws URISyntaxException, JsonProcessingException;
}
