package com.kamraan.repository;

import com.kamraan.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarRepository extends JpaRepository<Car,Integer> {

    List<Car> findByEngineDetailsEnginePowerGreaterThanAndTransmissionTypes(int vehicleId);
}