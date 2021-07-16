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
public class Airplane {
    private boolean joystick;
    private String typeHeadset;
    private String system;
    private String switchPanel;
    
    Airplane(){
      
    }

    public boolean isJoystick() {
        return joystick;
    }

    public void setJoystick(boolean joystick) {
        this.joystick = joystick;
        joystick = true;
    }

    public String getTypeHeadset() {
        return typeHeadset;
    }

    public void setTypeHeadset(String typeHeadset) {
        this.typeHeadset = typeHeadset;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public String getSwitchPanel() {
        return switchPanel;
    }

    public void setSwitchPanel(String switchPanel) {
        this.switchPanel = switchPanel;
    }
    
    public static void main(String[] args) {
        
        Airplane simulator = new Airplane();
        
        simulator.setJoystick(true);
        simulator.setSystem("Yoke System");
        simulator.setTypeHeadset("Flight Headset");
        
        System.out.println("Does flight simuator require joystick? " + simulator.isJoystick() + 
                " \n\nWhat type of system is used? " + simulator.getSystem() +
                        " \n\nWhat type of headset is used? " + simulator.getTypeHeadset());

        
    }
    
    
    
    
    
}
