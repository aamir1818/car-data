package com.kamraan.service;
import com.kamraan.dto.CarDTO;
import com.kamraan.entity.Car;
import com.kamraan.entity.EngineDetails;
import com.kamraan.entity.TransmissionTypes;
import com.kamraan.repository.CarRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import java.util.stream.Collectors;

    @Service
    public class CarManagementService {

        @Autowired
        private CarRepository carRepository;

        @Autowired
        private ModelMapper modelMapper;

        @Transactional
        public Car saveCar(CarDTO carDTO) {
            Car car = modelMapper.map(carDTO, Car.class);

            List<EngineDetails> engineDetailsList = carDTO.getEngineDetails().stream()
                    .map(engineDetailsDTO -> modelMapper.map(engineDetailsDTO, EngineDetails.class))
                    .peek(engineDetails -> engineDetails.setCar(car))
                    .collect(Collectors.toList());
            car.setEngineDetails(engineDetailsList);

            List<TransmissionTypes> transmissionTypesList = carDTO.getTransmissionTypes().stream()
                    .map(transmissionTypesDTO -> modelMapper.map(transmissionTypesDTO, TransmissionTypes.class))
                    .peek(transmissionTypes -> transmissionTypes.setCar(car))
                    .collect(Collectors.toList());
            car.setTransmissionTypes(transmissionTypesList);

            return carRepository.save(car);
        }
    }