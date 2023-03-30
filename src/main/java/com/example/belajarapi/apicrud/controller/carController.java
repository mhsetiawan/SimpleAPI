package com.example.belajarapi.apicrud.controller;

import com.example.belajarapi.apicrud.Services.CarService;
import com.example.belajarapi.apicrud.entities.CarEntity;
import com.example.belajarapi.apicrud.response.CommonResponse;
import com.example.belajarapi.apicrud.response.CommonResponseGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/car")
public class carController {

    @Autowired
    CarService carService;


    @Autowired
    CommonResponseGenerator commonResponseGenerator;

    @GetMapping(value = "checkAPI")
    public CommonResponse checkAPi(){
        return commonResponseGenerator.successResponse("Hello", "Success Check API!!");
    }

    @PostMapping(value = "addNewCar")
    public CommonResponse<CarEntity> addNewCar(@RequestBody CarEntity param){
        carService.addCar(param);
        return commonResponseGenerator.successResponse(param, "Berhasil addNewCar");
    }

    @GetMapping(value = "getAllCar")
    public List<CarEntity> getAllCar(){
        List<CarEntity> carList = carService.getallCar();
        return carList;
    }

    @GetMapping(value = "getCarById")
    public CarEntity getCarById(@RequestParam int id){
        CarEntity carById = carService.getcarByID(id);
        return carById;
    }

    @PutMapping(value = "updateCar")
    public CarEntity updateCar(@RequestBody CarEntity param){
        CarEntity car = carService.updateCar(param);
        return car;
    }

    @GetMapping(value = "deleteById")
    public String deleteById(@RequestParam int id){
        String delete = carService.deletecarByID(id);
        return delete;
    }

}
