// Drivetrain that uses Talon SR's

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
    	// Run an ordinary mecanum drive by default
        setDefaultCommand(new MecanumDrive());
    }
    
    public RegularDrivetrain(int frontLeft, int rearLeft, int frontRight, int rearRight) {
    	// Initialize the speed controllers as Talons
        tFrontLeft = new Talon(frontLeft);
    	tRearLeft = new Talon(rearLeft);
    	tFrontRight = new Talon(frontRight);
    	tRearRight = new Talon(rearRight);
    	
    	// Create the RobotDrive object and invert the left motors
    	robotDrive = new RobotDrive(tFrontLeft, tRearLeft, tFrontRight, tRearRight);
    	robotDrive.setInvertedMotor(RobotDrive.MotorType.kFrontLeft, true);
    	robotDrive.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);
    }
}

