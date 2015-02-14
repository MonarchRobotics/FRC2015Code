/* Command that is continuously run to take joystick input and 
 * drive the robot using a mecanum drivetrain */

package org.usfirst.frc.team1245.robot.commands;

import org.usfirst.frc.team1245.robot.OI;
import org.usfirst.frc.team1245.robot.Robot;
import org.usfirst.frc.team1245.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class MecanumDrive extends Command {

    public MecanumDrive() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        // This command requires the drivetrain
    	requires(Robot.drivetrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        // Get joystick input and filter it through the dead zone function
    	double x = OI.deadZone(OI.driverJoystick.getX(), RobotMap.translationalDeadZone);
    	double y = OI.deadZone(OI.driverJoystick.getY(), RobotMap.translationalDeadZone);
    	double twist = OI.deadZone(OI.driverJoystick.getTwist(), RobotMap.rotationalDeadZone);
    	
    	// Drive the robot based on the user input
    	Robot.drivetrain.getDrivetrain().mecanumDrive_Cartesian(x, y, twist, 0);
    	
    	// Write the drive parameters to Smartdashboard
    	SmartDashboard.putNumber("Mecanum X", x);
    	SmartDashboard.putNumber("Mecanum Y", y);
    	SmartDashboard.putNumber("Mecanum Twist", twist);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        /* This command is run continuosuly and will 
         * never finish during teleop */
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
