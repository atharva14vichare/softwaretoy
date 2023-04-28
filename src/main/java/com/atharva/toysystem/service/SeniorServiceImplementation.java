package com.atharva.toysystem.service;
import com.atharva.toysystem.model.Senior;
import com.atharva.toysystem.repositery.SeniorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class SeniorServiceImplementation implements SeniorService{
    @Autowired
    private SeniorRepo seniorrepo;




    @Override
    public Senior saveSenior(Senior senior){
        return seniorrepo.save(senior);

    }

    @Override
    public List<Senior>getAllSeniors(){
        return seniorrepo.findAll();

    }
}
