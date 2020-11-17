package com.playsafe.convertionservice;

import org.springframework.stereotype.Service;

import com.playsafe.requestmodel.MyValueModel;

@Service
public class TemparatureDistanceImplementation implements TemperatureDistanceConversionService {

    private  final double MILE_TO_KILOMETRE=1.61;
    private final double CEL_TO_KELVIN=273.15;
	
	@Override
	public String convertKelvinToCelcious(MyValueModel input) {
		// TODO Auto-generated method stub
		
		double KelvinToDegree=(input.getInput()-CEL_TO_KELVIN);
		
		return Double.toString(KelvinToDegree);
	}

	@Override
	public String convertCelciousToKelvin(MyValueModel input) {
		// TODO Auto-generated method stub
		double DegreeToKelvin=(input.getInput()+CEL_TO_KELVIN);
		return Double.toString(DegreeToKelvin) ;
	}

	@Override
	public String convertMilesToKilometre(MyValueModel input) {
		// TODO Auto-generated method stub
		double MilesToKilo=(input.getInput()*MILE_TO_KILOMETRE);
		return Double.toString(MilesToKilo) ;
	}

	@Override
	public String convertKilometreToMile(MyValueModel input) {
		// TODO Auto-generated method stub
		double KiloToMile=(input.getInput()/MILE_TO_KILOMETRE);
		return Double.toString(KiloToMile);
	}

}
