package org.usfirst.frc.team1245.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class Lifter extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
    // Double solenoid that controls lifter actuation
	DoubleSolenoid lifterSolenoid;	
	// Double solenoid that controls lifter pressure
	DoubleSolenoid airPressureSolenoid;

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        // Nothing to do by default
    }
    
    public Lifter(int forwardLifterChannel, int reverseLifterChannel,
    			  int forwardLifterPressureChannel, int reverseLifterPressureChannel){
    	// Initialize the actuation the double solenoid
        lifterSolenoid = new DoubleSolenoid(forwardLifterChannel, reverseLifterChannel);
        // The lifter will be in the down position initially
    	lifterSolenoid.set(DoubleSolenoid.Value.kReverse);
    	// Initialize the pressure control solenoid
    	airPressureSolenoid = new DoubleSolenoid(forwardLifterPressureChannel,
    											 reverseLifterPressureChannel);
    	// The pressure solenoid will be in low pressure mode initially
    	airPressureSolenoid.set(DoubleSolenoid.Value.kForward);
    }
    
    // Set the actuation solenoid in the forward position
    public void setForward(){
    	lifterSolenoid.set(DoubleSolenoid.Value.kForward);
    	SmartDashboard.putBoolean("Lifted", true);
    }
    
    // Set the actuation solenoid in the reverse position
    public void setReverse(){
    	lifterSolenoid.set(DoubleSolenoid.Value.kReverse);
    	SmartDashboard.putBoolean("Lifted", false);
    }
    
    // Return the lifter solenoid's state
    public DoubleSolenoid.Value getValue(){
    	return lifterSolenoid.get();
    }
    
    // Return the pressure solenoid's state
    public DoubleSolenoid.Value getPressure() {
    	return airPressureSolenoid.get();
    }
    
    // Switch the pressure
    public void switchPressure() {
    	if(airPressureSolenoid.get() == DoubleSolenoid.Value.kForward) {
    		airPressureSolenoid.set(DoubleSolenoid.Value.kReverse);
    		SmartDashboard.putString("Lifter Pressure", "High");
    	} else {
    		airPressureSolenoid.set(DoubleSolenoid.Value.kForward);
    		SmartDashboard.putString("Lifter Pressure", "Low");
    	}
    }
}

