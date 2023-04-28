package com.atharva.toysystem.repositery;

import org.springframework.data.jpa.repository.JpaRepository;
import com.atharva.toysystem.model.Senior;
import org.springframework.stereotype.Repository;

@Repository
public interface SeniorRepo extends JpaRepository< Senior,Integer> {
}
