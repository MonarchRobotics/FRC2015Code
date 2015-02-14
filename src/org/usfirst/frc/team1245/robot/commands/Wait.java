// Command that blocks a sequence of commands for the specified duration

package org.usfirst.frc.team1245.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class Wait extends Command {
	
	// Timer that keeps track of the duration
    private Timer time;
	
    // The duration of the pause
	private double duration;

    public Wait(double _duration) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        // Initialize the command
        time = new Timer();
        duration = _duration;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        // Start the timer
        time.start();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        // Nothing to do continuously
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        // Check whether the command has finished yet
        return time.get() >= duration;
    }

    // Called once after isFinished returns true
    protected void end() {
        // Stop and reset the timer
        time.stop();
        time.reset();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
