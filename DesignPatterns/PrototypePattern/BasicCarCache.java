package PrototypePattern;

import java.util.Hashtable;

public class BasicCarCache {
    private static Hashtable<String,BasicCar> CarMap = new Hashtable<String,BasicCar>();	
	
    public static BasicCar getCar(String car) {
    	BasicCar cachedcar = CarMap.get(car);
    	return (BasicCar) cachedcar.clone();
    }
    public static void loadcache() {
    	Ford ford = new Ford();
    	ford.setModelname("Yellow Ford");
    	CarMap.put(ford.getModelname(), ford);
    	
    	Nano nano = new Nano();
    	nano.setModelname("Green Nano");
    	CarMap.put(nano.getModelname(), nano);
    }
}

