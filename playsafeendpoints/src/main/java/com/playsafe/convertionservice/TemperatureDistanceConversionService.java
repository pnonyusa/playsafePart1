package com.playsafe.convertionservice;

import com.playsafe.requestmodel.MyValueModel;

public interface TemperatureDistanceConversionService {
     
	String convertKelvinToCelcious(MyValueModel input);
	
	
	String convertCelciousToKelvin(MyValueModel input);
	
	
	String convertMilesToKilometre(MyValueModel input);
	
	
	
	String convertKilometreToMile(MyValueModel input);
	
	
	
}
