package com.kamraan.controller;

import com.kamraan.dto.CarDTO;
import com.kamraan.entity.Car;
import com.kamraan.service.CarManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController     @RequestMapping("/cars")
public class CarManagementController {
    @Autowired
        private CarManagementService carManagementService;

        @PostMapping("/add")
        public ResponseEntity<?> saveCar(@RequestBody CarDTO carDTO) {
            try {
                Car savedCar = carManagementService.saveCar(carDTO);
                return ResponseEntity.status(HttpStatus.CREATED).body(savedCar);
            } catch (Exception e) {
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error saving car data: " + e.getMessage());
            }
        }


     //   @GetMapping("/all")
//        public ResponseEntity<List<Car>> getAllCars() {
//            List<Car> cars = carManagementService.getAllCarData();
//            return ResponseEntity.ok(cars);
//        }
//
//        @GetMapping("/engine-details")
//        public ResponseEntity<List<EngineDetails>> getAllEngineDetails() {
//            List<EngineDetails> engineDetails = carManagementService.getAllCarEngineDetails();
//            return ResponseEntity.ok(engineDetails);
//        }
//
//        @DeleteMapping("/delete/{vehicleId}")
//        public ResponseEntity<String> deleteCar(@PathVariable int vehicleId) {
//            String message = carManagementService.deleteCarData(vehicleId);
//            return ResponseEntity.ok(message);
//        }
//        @PutMapping("/update/{vehicleId}")
//    public ResponseEntity<Car> updateCar(@PathVariable Integer vehicleId, @RequestBody Car carDetails) {
//        Car updatedCar = carManagementService.updateCar(vehicleId, carDetails);
//        if (updatedCar == null) {return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//        }
//        return ResponseEntity.ok(updatedCar);
//    }
}

