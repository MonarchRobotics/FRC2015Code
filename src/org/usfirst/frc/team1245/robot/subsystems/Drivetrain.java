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
	
	protected RobotDrive robotDrive;
	
	protected SpeedController tFrontLeft;
	protected SpeedController tRearLeft;
	protected SpeedController tFrontRight;
	protected SpeedController tRearRight;
	
	public static final double rpm = 5000;
	public static final double rotationsPer10MS = 0.833;

    public abstract void initDefaultCommand();
    
    // Return the RobotDrive object
    public RobotDrive getDrivetrain() {
    	return robotDrive;
    }
    
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

