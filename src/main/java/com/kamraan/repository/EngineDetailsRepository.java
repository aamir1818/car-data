package com.kamraan.repository;

import com.kamraan.entity.EngineDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EngineDetailsRepository extends JpaRepository<EngineDetails,Integer> {
    List<EngineDetails> findByEnginePowerGreaterThan(int enginePower);
}
