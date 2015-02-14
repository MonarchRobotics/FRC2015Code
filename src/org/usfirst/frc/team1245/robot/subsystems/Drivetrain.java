// Base Drivetrain class

package org.usfirst.frc.team1245.robot.subsystems;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public abstract class Drivetrain extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
    // RobotDrive object for access to FIRST's mecanum drive method
	protected RobotDrive robotDrive;
	
	// Mecanum drive will be used, so four speed controllers are necessary
	protected SpeedController tFrontLeft;
	protected SpeedController tRearLeft;
	protected SpeedController tFrontRight;
	protected SpeedController tRearRight;

	// Method to be implemented in base classes
    public abstract void initDefaultCommand();
    
    // Return the RobotDrive object
    public RobotDrive getDrivetrain() {
    	return robotDrive;
    }
    
    // Return a specific speed motor in the following four methods
    public SpeedController getFrontLeft() {
    	return tFrontLeft;
    }
    
    public SpeedController getRearLeft() {
    	return tRearLeft;
    }
    
    public SpeedController getFrontRight() {
    	return tFrontRight;
    }
    
    public SpeedController getRearRight() {
    	return tRearRight;
    }
}

