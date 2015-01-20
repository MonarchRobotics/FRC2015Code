package org.usfirst.frc.team1245.robot.subsystems;

import org.usfirst.frc.team1245.robot.commands.MecanumDrive;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drivetrain extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	private RobotDrive regularDrivetrain;
	
	private Talon tFrontLeft;
	private Talon tRearLeft;
	private Talon tFrontRight;
	private Talon tRearRight;

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new MecanumDrive());
    }
    
    // Return the RobotDrive object
    public RobotDrive getDrivetrain() {
    	return regularDrivetrain;
    }
    
    public Talon getFrontLeft() {
    	return tFrontLeft;
    }
    
    public Talon getRearLeft() {
    	return tRearLeft;
    }
    
    public Talon getFrontRight() {
    	return tFrontRight;
    }
    
    public Talon getRearRight() {
    	return tRearRight;
    }
    
    // Initialize the RobotDrive object with Talon SRX motor controllers
    public Drivetrain(int frontLeft, int rearLeft, int frontRight, int rearRight) {
    	tFrontLeft = new Talon(frontLeft);
    	tRearLeft = new Talon(rearLeft);
    	tFrontRight = new Talon(frontRight);
    	tRearRight = new Talon(rearRight);
    	
    	regularDrivetrain = new RobotDrive(tFrontLeft, tRearLeft, tFrontRight, tRearRight);
    	regularDrivetrain.setInvertedMotor(RobotDrive.MotorType.kFrontLeft, true);
    	regularDrivetrain.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);
    }
}

