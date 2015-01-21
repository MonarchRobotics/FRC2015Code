package org.usfirst.frc.team1245.robot.subsystems;

import org.usfirst.frc.team1245.robot.commands.MecanumDrive;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drivetrain extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	protected RobotDrive regularDrivetrain;
	
	protected SpeedController tFrontLeft;
	protected SpeedController tRearLeft;
	protected SpeedController tFrontRight;
	protected SpeedController tRearRight;

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    // Return the RobotDrive object
    public RobotDrive getDrivetrain() {
    	return regularDrivetrain;
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

