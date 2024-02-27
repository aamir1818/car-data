package com.kamraan.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Entity @Data @AllArgsConstructor @NoArgsConstructor
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer vehicleId;

    private String carName;
    private String carDescription;

    // One-to-many relationship with EngineDetails
    @OneToMany(mappedBy = "car",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<EngineDetails> engineDetails;

    // One-to-many relationship with TransmissionType
    @OneToMany(mappedBy = "car", cascade = CascadeType.ALL,orphanRemoval = true)
    private List<TransmissionTypes> transmissionTypes;}
