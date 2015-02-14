/* Command that rotates the robot at the specified power
 * for the specified duration; used primarily in autonomous */

package org.usfirst.frc.team1245.robot.commands;

import org.usfirst.frc.team1245.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Rotate extends Command {
    
    // Power to rotate
    private double rotate;
    // Duration to rotate
    private double duration;
    // Timer to keep track of the duration of the command
    private Timer time;

    public Rotate(double _rotate, double _duration) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        // Initialize the command's specifications
        rotate = _rotate;
        duration = _duration;
        time = new Timer();
        // This command requires the drivetrain
        requires(Robot.drivetrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        // Start the timer
        time.start();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        // Rotate the robot
        Robot.drivetrain.getDrivetrain().mecanumDrive_Cartesian(0.0, 0.0, rotate, 0.0);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        // Check whether the command has run passed the duration
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
