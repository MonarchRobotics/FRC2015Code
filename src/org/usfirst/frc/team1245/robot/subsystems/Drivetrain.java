package org.usfirst.frc.team1245.robot.subsystems;

import org.usfirst.frc.team1245.robot.commands.MecanumDrive;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drivetrain extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	@SuppressWarnings("unused")
	private RobotDrive robotDrivetrain;

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new MecanumDrive());
    }
    
    public Drivetrain(int frontLeft, int rearLeft, int frontRight, int rearRight) {
    	Talon tFrontLeft = new Talon(frontLeft);
    	Talon tRearLeft = new Talon(rearLeft);
    	Talon tFrontRight = new Talon(frontRight);
    	Talon tRearRight = new Talon(rearRight);
    	
    	robotDrivetrain = new RobotDrive(tFrontLeft, tRearLeft, tFrontRight, tRearRight);
    }
}

