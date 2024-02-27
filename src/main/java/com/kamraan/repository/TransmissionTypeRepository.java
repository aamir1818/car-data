package com.kamraan.repository;

import com.kamraan.entity.EngineDetails;
import com.kamraan.entity.TransmissionTypes;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransmissionTypeRepository extends JpaRepository<TransmissionTypes,Integer> {
    List<TransmissionTypes> findByTransmissionType(String transmissionType);
}
