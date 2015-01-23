package org.usfirst.frc.team1245.robot.commands;

import org.usfirst.frc.team1245.robot.Robot;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ToggleGrip extends Command {

	private boolean finished;
	
    public ToggleGrip() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.gripper);
    	finished = false;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if(Robot.gripper.solenoid.get() == DoubleSolenoid.Value.kReverse ||
    	   Robot.gripper.solenoid.get() == DoubleSolenoid.Value.kOff) {
    		Robot.gripper.forward();
    	} else if (Robot.gripper.solenoid.get() == DoubleSolenoid.Value.kForward) {
    		Robot.gripper.reverse();
    	}
    	
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
