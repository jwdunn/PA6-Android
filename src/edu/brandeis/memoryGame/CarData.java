/**
 * Builds the lists of the cars 
 * PA6 android 
 * Jared Dunn
 * JBS2011
 * 
 * Methods
 * getCarList()
 * getMMList()
 * Compare(Sting a , String b)
 * 
 */



package edu.brandeis.memoryGame;

import java.util.LinkedList;

public class CarData {

	private LinkedList<String> CarMakesModels = new LinkedList<String>();
	private LinkedList<Car> Cars = new LinkedList<Car>();
	
	
	//creates arraylists of the data
	public CarData(){
		CarMakesModels.add("Ford");
		CarMakesModels.add("Mustang");
		CarMakesModels.add("Chevy");
		CarMakesModels.add("Camero");
		CarMakesModels.add("BMW");
		CarMakesModels.add("Z3");
		
		Cars.add(new Car(CarMakesModels.get(0), CarMakesModels.get(1)));
		Cars.add(new Car(CarMakesModels.get(1), CarMakesModels.get(0)));
		Cars.add(new Car(CarMakesModels.get(2), CarMakesModels.get(3)));
		Cars.add(new Car(CarMakesModels.get(3), CarMakesModels.get(2)));
		Cars.add(new Car(CarMakesModels.get(4), CarMakesModels.get(5)));
		Cars.add(new Car(CarMakesModels.get(5), CarMakesModels.get(4)));
		
	}
	
	
	public LinkedList<String> getMMList(){
      return this.CarMakesModels;
	}
	public LinkedList<Car> getCarList(){
	      return this.Cars;
	}
	
	//this method takes in two strings an checks to see if the two strings match any of the "cars"
	public boolean Compare(String make, String model){	
		Car mixed = new Car(make, model);
		System.out.println(mixed);
		boolean match = false;
		
		for(int i = 0; i< Cars.size(); i++){
			if (mixed.toString().equals(Cars.get(i).toString())){
				match = true;
				break;
			}
		}
		return match;
	}
}
