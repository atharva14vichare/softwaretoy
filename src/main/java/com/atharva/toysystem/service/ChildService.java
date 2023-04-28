package com.atharva.toysystem.service;
import com.atharva.toysystem.model.Child;
import org.springframework.context.annotation.Bean;

import java.util.List;


public interface ChildService {

    public Child saveChild(Child child);

    public List<Child> getAllChildren();


}
