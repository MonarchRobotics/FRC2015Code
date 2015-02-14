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

    // Double solenoid that controls the gripping actuation
	private DoubleSolenoid solenoid;
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        // No default command
    }
    
    public Gripper(int forwardChannel, int reverseChannel) {
    	// Initialize the double solenoid at the given channels
        solenoid = new DoubleSolenoid(forwardChannel, reverseChannel);
        // Put the gripper in an ungripped state initially
    	solenoid.set(DoubleSolenoid.Value.kReverse);
    }
    
    // Set the gripper solenoid to forward
    public void forward() {
    	solenoid.set(DoubleSolenoid.Value.kForward);
    	SmartDashboard.putBoolean("Gripped", true);
    }
    
    // Set the gripper solenoid to reverse
    public void reverse() {
    	solenoid.set(DoubleSolenoid.Value.kReverse);
    	SmartDashboard.putBoolean("Gripped", false);
    }
    
    // Return the position of the solenoid
    public DoubleSolenoid.Value getValue() {
    	return solenoid.get();
    }
}

