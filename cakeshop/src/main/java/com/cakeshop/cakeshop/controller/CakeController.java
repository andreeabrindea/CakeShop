package com.cakeshop.cakeshop.controller;

import com.cakeshop.cakeshop.model.Cake;
import com.cakeshop.cakeshop.service.CakeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CakeController {
    private final CakeService cakeService;

    public CakeController(CakeService cakeService) {
        this.cakeService = cakeService;
    }

    @RequestMapping("/cakes")
    public List<Cake> getCakes(){
        return cakeService.getCakes();
    }
}
