/**
 * Car Object
 * this class makes up a car object Car(String a, String b)
 *pa6
 *jbs2011
 *Jared Dunn
 */

package edu.brandeis.memoryGame;

public class Car {
	private String make;
	private String model;
	private String car;
	
	public Car (String mke, String mdl){
		make = mke;
		model = mdl;
		car = make + " " + model;
	}
	public String getMake(){
		return make;
	}
	public String getModel(){
		return model;
	}
	public void newMake(String mke){
		make =mke;
	}
	public void newModel(String mdl){
		model = mdl;
	}
	public String toString(){
		return car;
	}
	
}
