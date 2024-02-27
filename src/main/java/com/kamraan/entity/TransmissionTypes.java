package com.kamraan.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransmissionTypes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer tId;
    private String at;
    private String mt;
    private String am;
    private String cvt;
     //Many-to-one relationship with Car
     @ManyToOne(fetch = FetchType.LAZY)
     @JoinColumn(name = "car_id")
     private Car car;
}
