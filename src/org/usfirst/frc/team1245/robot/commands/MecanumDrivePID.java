package org.usfirst.frc.team1245.robot.commands;

import org.usfirst.frc.team1245.robot.Robot;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class MecanumDrivePID extends Command {

    public MecanumDrivePID() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.drivetrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	// Have the PID check for the speed of the wheel
    	Robot.drivetrain.getFrontLeft().changeControlMode(CANTalon.ControlMode.Speed);
    	Robot.drivetrain.getRearLeft().changeControlMode(CANTalon.ControlMode.Speed);
    	Robot.drivetrain.getFrontRight().changeControlMode(CANTalon.ControlMode.Speed);
    	Robot.drivetrain.getRearRight().changeControlMode(CANTalon.ControlMode.Speed);
    	
    	// Have the PID read the output from the Quadrature Encoders
    	Robot.drivetrain.getFrontLeft().setFeedbackDevice(CANTalon.FeedbackDevice.QuadEncoder);
    	Robot.drivetrain.getRearLeft().setFeedbackDevice(CANTalon.FeedbackDevice.QuadEncoder);
    	Robot.drivetrain.getFrontRight().setFeedbackDevice(CANTalon.FeedbackDevice.QuadEncoder);
    	Robot.drivetrain.getRearRight().setFeedbackDevice(CANTalon.FeedbackDevice.QuadEncoder);
    	
    	// Set the p, i, and d parameters of the PID systems (all should be the same)
    	Robot.drivetrain.getFrontLeft().setPID(1, 0, 0);
    	Robot.drivetrain.getRearLeft().setPID(1, 0, 0);
    	Robot.drivetrain.getFrontRight().setPID(1, 0, 0);
    	Robot.drivetrain.getRearRight().setPID(1, 0, 0);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
