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
public class House {
    private int floors;
    private String color;
    private int bedrooms;

      House(){
        
    }
    public void setFloors(int floors) {
        this.floors = floors;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public void setAcres(int acres) {
        this.acres = acres;
    }
    private int acres;
    
  

    public int getFloors() {
        return floors;
    }

    public String getColor() {
        return color;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public int getAcres() {
        return acres;
    }
    
    public static void main(String[] D){
        House myHouse = new House();
        
        myHouse.setBedrooms(4);
        System.out.println("The number of bedrooms to be created is " + myHouse.getBedrooms());
        
    }
    
    
    
    
}
