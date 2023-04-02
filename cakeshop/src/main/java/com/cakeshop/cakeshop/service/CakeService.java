package com.cakeshop.cakeshop.service;

import com.cakeshop.cakeshop.model.Cake;
import com.cakeshop.cakeshop.model.CakeRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CakeService {
    private final CakeRepository cakeRepository;


    public CakeService(CakeRepository cakeRepository) {
        this.cakeRepository = cakeRepository;
    }

    public List<Cake> getCakes(){
//        return List.of(
//                new Cake(new ObjectId(), "tort cioco", "cioco", "cioco", 12.50)
//
        return cakeRepository.findAll();
    }
}
