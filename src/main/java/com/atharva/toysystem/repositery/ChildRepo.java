package com.atharva.toysystem.repositery;

import org.springframework.data.jpa.repository.JpaRepository;
import com.atharva.toysystem.model.Child;
import org.springframework.stereotype.Repository;

@Repository
public interface ChildRepo extends JpaRepository< Child,Integer> {
}
