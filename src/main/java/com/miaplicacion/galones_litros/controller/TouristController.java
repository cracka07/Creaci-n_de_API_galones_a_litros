
package com.miaplicacion.galones_litros.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TouristController {
    
     @GetMapping("/")
     public String quantityLiters(@RequestParam double gallons){
         String cantLitros="";
         double litros=3.78541;
         double enLitros;
         
         enLitros=gallons * litros;
         cantLitros="La cantidad de galones: " + gallons + " equivale a: " + enLitros + " litros";
         
         return  cantLitros;
     }
    
}
