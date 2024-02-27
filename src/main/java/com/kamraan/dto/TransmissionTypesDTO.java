package com.kamraan.dto;

import lombok.Data;

@Data
public class TransmissionTypesDTO {
    private String at; // Automatic
    private String mt; // Manual
    private String am; // Automated Manual
    private String cvt;
}
