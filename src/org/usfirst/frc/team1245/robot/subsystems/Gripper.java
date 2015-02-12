package org.usfirst.frc.team1245.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class Gripper extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	private DoubleSolenoid solenoid;
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public Gripper(int forwardChannel, int reverseChannel) {
    	solenoid = new DoubleSolenoid(forwardChannel, reverseChannel);
    	solenoid.set(DoubleSolenoid.Value.kReverse);
    }
    
    public void forward() {
    	solenoid.set(DoubleSolenoid.Value.kForward);
    	SmartDashboard.putBoolean("Gripped", true);
    }
    
    public void reverse() {
    	solenoid.set(DoubleSolenoid.Value.kReverse);
    	SmartDashboard.putBoolean("Gripped", false);
    }
    
    public DoubleSolenoid.Value getValue() {
    	return solenoid.get();
    }
}

