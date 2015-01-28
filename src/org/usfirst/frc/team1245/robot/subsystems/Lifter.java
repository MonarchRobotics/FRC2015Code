package org.usfirst.frc.team1245.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Lifter extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	DoubleSolenoid lifterSolenoid;	
	DoubleSolenoid airPressureSolenoid;

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	
    }
    
    public Lifter(int forwardLifterChannel, int reverseLifterChannel,
    			  int forwardLifterPressureChannel, int reverseLifterPressureChannel){
    	lifterSolenoid = new DoubleSolenoid(forwardLifterChannel, reverseLifterChannel);
    	airPressureSolenoid = new DoubleSolenoid(forwardLifterPressureChannel,
    											 reverseLifterPressureChannel);
    }
    
    public void setForward(){
    	lifterSolenoid.set(DoubleSolenoid.Value.kForward);
    }
    
    public void setReverse(){
    	lifterSolenoid.set(DoubleSolenoid.Value.kReverse);
    }
    
    public Value getState(){
    	return lifterSolenoid.get();
    }
    
    public Value getPressure() {
    	return airPressureSolenoid.get();
    }
    
    public void switchPressure() {
    	if(airPressureSolenoid.get() == Value.kForward) {
    		airPressureSolenoid.set(Value.kReverse);
    	} else {
    		airPressureSolenoid.set(Value.kForward);
    	}
    }
}

