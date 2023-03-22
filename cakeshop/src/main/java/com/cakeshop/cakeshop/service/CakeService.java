package com.cakeshop.cakeshop.service;

import com.cakeshop.cakeshop.model.Cake;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Service
public class CakeService {
    public List<Cake> getCakes(){
        return List.of(
                new Cake(1, "tort cioco", "cioco", "cioco", 12.50)
        );
    }
}
