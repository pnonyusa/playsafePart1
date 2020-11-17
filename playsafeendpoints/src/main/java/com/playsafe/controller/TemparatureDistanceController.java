package com.playsafe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.playsafe.convertionservice.TemperatureDistanceConversionService;
import com.playsafe.requestmodel.MyValueModel;

@RestController
@RequestMapping("conversions")
public class TemparatureDistanceController {
	     
     @Autowired
     private TemperatureDistanceConversionService tempDistanceConversionService;
     
     
     @PostMapping(path = "/ktoc")
     String convertKelvinToCelcious(@RequestBody MyValueModel input) {
    	 return tempDistanceConversionService.convertKelvinToCelcious(input) ;
     }
 	
     @PostMapping(path = "/ctok")
 	String convertCelciousToKelvin(@RequestBody MyValueModel input) {
 		return tempDistanceConversionService.convertCelciousToKelvin(input) ;
 	}
 	
     @PostMapping(path = "/mtok",consumes = { MediaType.ALL_VALUE }, produces = { MediaType.ALL_VALUE })
 	String convertMilesToKilometre(@RequestBody MyValueModel input) {
 		return tempDistanceConversionService.convertMilesToKilometre(input) ;
 	}
 	
 	
     @PostMapping(path = "/ktom",consumes = { MediaType.ALL_VALUE }, produces = { MediaType.ALL_VALUE })
 	String convertKilometreToMile(@RequestBody MyValueModel input) {
 		return tempDistanceConversionService.convertKilometreToMile(input) ;
 	}
     
     
     
}
