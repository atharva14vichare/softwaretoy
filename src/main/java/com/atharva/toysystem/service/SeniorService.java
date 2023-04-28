package com.atharva.toysystem.service;
import com.atharva.toysystem.model.Senior;
import org.springframework.context.annotation.Bean;

import java.util.List;


public interface SeniorService {

    public Senior saveSenior(Senior senior);

    public List<Senior> getAllSeniors();
}