package com.atharva.toysystem.service;
import com.atharva.toysystem.model.Child;
import com.atharva.toysystem.repositery.ChildRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class ChildServiceImplementation implements ChildService{
   @Autowired
   private ChildRepo childrepo;




    @Override
    public Child saveChild(Child child){
        return childrepo.save(child);

    }

    @Override
    public List<Child>getAllChildren(){
        return childrepo.findAll();

    }
}
