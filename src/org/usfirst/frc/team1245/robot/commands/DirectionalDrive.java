package org.usfirst.frc.team1245.robot.commands;

import org.usfirst.frc.team1245.robot.Robot;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DirectionalDrive extends Command {
	
	private Timer timer;
	private double duration;
	
	private double x;
	private double y;
	
	public DirectionalDrive(double x, double y, double duration) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.drivetrain);
    	
    	timer = new Timer();
    	this.duration = duration;
    	
    	this.x = x;
    	this.y = y;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        timer.start();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.drivetrain.getDrivetrain().mecanumDrive_Cartesian(x, y, 0, 0);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return timer.get() >= duration;
    }

    // Called once after isFinished returns true
    protected void end() {
    	timer.stop();
    	timer.reset();
    	Robot.drivetrain.getDrivetrain().mecanumDrive_Cartesian(0, 0, 0, 0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
