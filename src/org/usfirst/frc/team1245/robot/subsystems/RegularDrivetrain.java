package org.usfirst.frc.team1245.robot.subsystems;

import org.usfirst.frc.team1245.robot.commands.MecanumDrive;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;


/**
 *
 */
public class RegularDrivetrain extends Drivetrain {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new MecanumDrive());
    }
    
    public RegularDrivetrain(int frontLeft, int rearLeft, int frontRight, int rearRight) {
    	tFrontLeft = new Talon(frontLeft);
    	tRearLeft = new Talon(rearLeft);
    	tFrontRight = new Talon(frontRight);
    	tRearRight = new Talon(rearRight);
    	
    	robotDrive = new RobotDrive(tFrontLeft, tRearLeft, tFrontRight, tRearRight);
    }
}

