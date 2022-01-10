package com.pracownia.spring.controllers;

import com.pracownia.spring.entities.*;
import com.pracownia.spring.services.ProductService;
import com.pracownia.spring.services.*;
import org.codehaus.plexus.util.dag.DAG;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.*;

/**
 * Homepage controller.
 */
@RestController
@RequestMapping("/")
public class IndexController {

    @Autowired
    private ProductService productService;

    @Autowired
    private VisitService visitService;

    @GetMapping(value = "")
    String index() {
        return "index";
    }


    @PostMapping(value = "generateModel", produces = MediaType.TEXT_PLAIN_VALUE)
    public String generateModel() {

        DateTime dateAndTime  = DateTime.now();

//        Product p0 = new Product(UUID.randomUUID().toString(),"Chleb", new BigDecimal(3.50), dateAndTime.plusDays(7));
//        Product p1 = new Product(UUID.randomUUID().toString(),"Jajko", new BigDecimal(2.50), dateAndTime.plusDays(7));
//        Product p2 = new Product(UUID.randomUUID().toString(),"Masło", new BigDecimal(3.50), dateAndTime.plusDays(7));
//        Product p3 = new Product(UUID.randomUUID().toString(),"Mąka", new BigDecimal(1.50), dateAndTime.plusDays(7));
//
//
//        Seller seller = new Seller("Biedra", "Poznan", Arrays.asList(p1.getProductId(), p2.getProductId(), p3.getProductId()));
//        Seller seller2 = new Seller("Lidl", "Krosno", Arrays.asList(p1.getProductId(), p2.getProductId()));
//
//        p1.getSellers().add(seller);
//        p2.getSellers().add(seller);
//        p3.getSellers().add(seller);
//        p1.getSellers().add(seller2);
//        p2.getSellers().add(seller2);
//
//        productService.saveProduct(p0);
//        productService.saveProduct(p1);
//        productService.saveProduct(p2);
//        productService.saveProduct(p3);

        Pet pet = new Pet("szarik","pies", dateAndTime, null);
        Doctor doctor = new Doctor("Jan", "Kowalski", "chirurg");
        DateTime dateTime = DateTime.now();
        Visit visit = new Visit(pet, doctor, dateTime);
        visitService.saveVisit(visit);



        return "Model Generated";
    }
}