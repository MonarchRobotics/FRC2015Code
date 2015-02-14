// Command that toggles the lifter's pressure mode

package org.usfirst.frc.team1245.robot.commands;

import org.usfirst.frc.team1245.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ToggleLifterPressure extends Command {

    // Indicates whether the command is finished yet
	boolean finished;
	
    public ToggleLifterPressure() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        // This command requires the lifter
    	requires(Robot.lifter);
    	// This command has not finished yet
    	finished = false;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        // Toggle the lifter's pressure
    	Robot.lifter.switchPressure();
    	
    	// Indicate that the command has finished
    	finished = true;
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return finished;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
