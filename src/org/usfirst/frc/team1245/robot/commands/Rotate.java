package org.usfirst.frc.team1245.robot.commands;

import org.usfirst.frc.team1245.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Rotate extends Command {
    
    private double rotate;
    private double duration;
    private Timer time;

    public Rotate(double _rotate, double _duration) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        rotate = _rotate;
        duration = _duration;
        time = new Timer();
        requires(Robot.drivetrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        time.start();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        Robot.drivetrain.getDrivetrain().mecanumDrive_Cartesian(0.0, 0.0, rotate, 0.0);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return time.get() >= duration;
    }

    // Called once after isFinished returns true
    protected void end() {
        time.stop();
        time.reset();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
