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

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	
    }
    
    public Lifter(int forwardLifterChannel, int reverseLifterChannel){
    	lifterSolenoid = new DoubleSolenoid(forwardLifterChannel, reverseLifterChannel);
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
}

