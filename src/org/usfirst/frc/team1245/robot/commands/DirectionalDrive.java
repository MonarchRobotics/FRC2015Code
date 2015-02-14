/* Command that mecanum drives with the specified 
 * movement vector for the specified duration */

package org.usfirst.frc.team1245.robot.commands;

import org.usfirst.frc.team1245.robot.Robot;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DirectionalDrive extends Command {
	
    // Timer to keep track of how long the command has been running
	private Timer timer;
	// Duration of the drive
	private double duration;
	
	// Movement vector components
	private double x;
	private double y;
	
	public DirectionalDrive(double _x, double _y, double _duration) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
	    // This command requires the drivetrain
    	requires(Robot.drivetrain);
    	
    	// Create the timer and store the duratino
    	timer = new Timer();
    	duration = _duration;
    	
    	// Store the movement vector
    	x = _x;
    	y = _y;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        // Start the timer
        timer.start();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        // Drive the robot
    	Robot.drivetrain.getDrivetrain().mecanumDrive_Cartesian(x, y, 0, 0);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        // Check the timer to see if the duration has passed
        return timer.get() >= duration;
    }

    // Called once after isFinished returns true
    protected void end() {
        // Stop and reset the timer
    	timer.stop();
    	timer.reset();
    	
    	// Stop the drivetrain
    	Robot.drivetrain.getDrivetrain().mecanumDrive_Cartesian(0, 0, 0, 0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
