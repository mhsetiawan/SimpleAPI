package com.example.belajarapi.apicrud.Services;

import com.example.belajarapi.apicrud.entities.CarEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CarService {
    public CarEntity addCar(CarEntity param);

    List<CarEntity> getallCar();

    CarEntity getcarByID(int id);

    CarEntity updateCar(CarEntity param);

    String deletecarByID(int id);
}
