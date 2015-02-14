// Command to toggle the gripper (grip or release)

package org.usfirst.frc.team1245.robot.commands;

import org.usfirst.frc.team1245.robot.Robot;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ToggleGrip extends Command {

    // Indicates whether the command is finished
	private boolean finished;
	
    public ToggleGrip() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        // This command requires the gripper subsystem
    	requires(Robot.gripper);
    	// This command is not yet finished
    	finished = false;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        // Toggle between forward and reverse
    	if(Robot.gripper.getValue() == DoubleSolenoid.Value.kForward) {
    		Robot.gripper.reverse();
    	} else {
    		Robot.gripper.forward();
    	}
    	
    	// The command should only execute once, it is finished now
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
    	cancel();
    }
}
