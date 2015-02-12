package org.usfirst.frc.team1245.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class Wait extends Command {
	
	//private static Timer time;
    private Timer time;
	
	private double duration;

    public Wait(double _duration) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        time = new Timer();
        duration = _duration;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        time.start();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        SmartDashboard.putNumber("Timer", time.get());
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
