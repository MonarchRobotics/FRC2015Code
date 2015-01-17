package org.usfirst.frc.team1245.robot.subsystems;

import org.usfirst.frc.team1245.robot.commands.MecanumDrive;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drivetrain extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	private RobotDrive regularDrivetrain;
	
	private CANTalon tFrontLeft;
	private CANTalon tRearLeft;
	private CANTalon tFrontRight;
	private CANTalon tRearRight;

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new MecanumDrive());
    }
    
    // Return the RobotDrive object
    public RobotDrive getDrivetrain() {
    	return regularDrivetrain;
    }
    
    public CANTalon getFrontLeft() {
    	return tFrontLeft;
    }
    
    public CANTalon getRearLeft() {
    	return tRearLeft;
    }
    
    public CANTalon getFrontRight() {
    	return tFrontRight;
    }
    
    public CANTalon getRearRight() {
    	return tRearRight;
    }
    
    // Initialize the RobotDrive object with Talon SRX motor controllers
    public Drivetrain(int frontLeft, int rearLeft, int frontRight, int rearRight) {
    	tFrontLeft = new CANTalon(frontLeft);
    	tRearLeft = new CANTalon(rearLeft);
    	tFrontRight = new CANTalon(frontRight);
    	tRearRight = new CANTalon(rearRight);
    	
    	regularDrivetrain = new RobotDrive(tFrontLeft, tRearLeft, tFrontRight, tRearRight);
    }
}

