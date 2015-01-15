package org.usfirst.frc.team1245.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Gripper extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	public DoubleSolenoid solenoid;
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public Gripper(int forwardChannel, int reverseChannel) {
    	solenoid = new DoubleSolenoid(forwardChannel, reverseChannel);
    }
    
    public void forward() {
    	solenoid.set(DoubleSolenoid.Value.kForward);
    }
    
    public void reverse() {
    	solenoid.set(DoubleSolenoid.Value.kReverse);
    }
    
    public void off() {
    	solenoid.set(DoubleSolenoid.Value.kOff);
    }
}

