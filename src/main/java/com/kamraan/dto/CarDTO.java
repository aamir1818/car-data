package com.kamraan.dto;

import lombok.Data;

import java.util.List;

@Data

public class CarDTO {
    private String carName;
    private String carDescription;
    private List<EngineDetailsDTO> engineDetails;
    private List<TransmissionTypesDTO> transmissionTypes;

    // Getters and setters
}
