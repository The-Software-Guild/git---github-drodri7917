/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExerciseModeling;

/**
 *
 * @author Owner
 */
public class CarModeling {
    
    private String model;
    private int year;
    private String type;
    private double miles;
    private String color;
    private int speed;
    
    //constructor
    CarModeling(){
    }
    
    
    //default-constructor
   
    
    //getter/setters
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }
    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type = type;
    }
    public double getMiles(){
        return miles;
    }
    public void setMiles(double miles){
        this.miles = miles;
    }
    
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public int getSpeed(){
        return speed;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    
    
    public static void main(String[] D){
        CarModeling focus = new CarModeling();
        focus.setModel("ford focus");
        focus.setColor("red");
        
        System.out.println("the model of the car is " + focus.getModel());
        System.out.println("the color of the car is " + focus.getColor());

        
        
        
        
    }
    
    
    
}
