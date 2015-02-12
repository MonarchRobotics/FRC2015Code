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
	
	DoubleSolenoid lifterSolenoid;	
	DoubleSolenoid airPressureSolenoid;

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	
    }
    
    public Lifter(int forwardLifterChannel, int reverseLifterChannel,
    			  int forwardLifterPressureChannel, int reverseLifterPressureChannel){
    	lifterSolenoid = new DoubleSolenoid(forwardLifterChannel, reverseLifterChannel);
    	lifterSolenoid.set(DoubleSolenoid.Value.kReverse);
    	airPressureSolenoid = new DoubleSolenoid(forwardLifterPressureChannel,
    											 reverseLifterPressureChannel);
    	airPressureSolenoid.set(DoubleSolenoid.Value.kForward);
    }
    
    public void setForward(){
    	lifterSolenoid.set(DoubleSolenoid.Value.kForward);
    	SmartDashboard.putBoolean("Lifted", true);
    }
    
    public void setReverse(){
    	lifterSolenoid.set(DoubleSolenoid.Value.kReverse);
    	SmartDashboard.putBoolean("Lifted", false);
    }
    
    public DoubleSolenoid.Value getValue(){
    	return lifterSolenoid.get();
    }
    
    public DoubleSolenoid.Value getPressure() {
    	return airPressureSolenoid.get();
    }
    
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

