/* Command that handles air compression */

package org.usfirst.frc.team1245.robot.commands;

import org.usfirst.frc.team1245.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Compress extends Command {

    public Compress() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.compressorSubsystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        // Start the compressor's closed loop control
    	Robot.compressorSubsystem.start();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        // Nothing to be done continuously
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        // Never finish since there is nothing to be done continuously
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
        // Forcefully stop compressor in closed-loop control
    	Robot.compressorSubsystem.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
