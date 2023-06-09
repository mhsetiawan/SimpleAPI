package com.example.belajarapi.apicrud.Services;

import com.example.belajarapi.apicrud.entities.CarEntity;
import com.example.belajarapi.apicrud.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    CarRepository carRepository;

    @Override
    public CarEntity addCar(CarEntity param) {
        return carRepository.save(param);
    }

    @Override
    public List<CarEntity> getallCar() {
        return carRepository.findAll();
    }

    @Override
    public CarEntity getcarByID(int id) {
        return carRepository.findById(id).get();
    }

    @Override
    public CarEntity updateCar(CarEntity param) {
        return carRepository.save(param);
    }

    @Override
    public String deletecarByID(int id) {
        carRepository.deleteById(id);
        return ("Car id :"+id+" Deleted");
    }
}
