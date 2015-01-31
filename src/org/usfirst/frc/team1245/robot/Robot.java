
package org.usfirst.frc.team1245.robot;

import org.usfirst.frc.team1245.robot.subsystems.CompressorSubsystem;
import org.usfirst.frc.team1245.robot.subsystems.Drivetrain;
import org.usfirst.frc.team1245.robot.subsystems.Gripper;
import org.usfirst.frc.team1245.robot.subsystems.Lifter;
import org.usfirst.frc.team1245.robot.subsystems.SRXDrivetrain;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {

	public static OI oi;
	
	public static final Drivetrain drivetrain = new SRXDrivetrain(RobotMap.frontLeft, RobotMap.rearLeft, RobotMap.frontRight, RobotMap.rearRight);
	public static final Gripper gripper = new Gripper(RobotMap.forwardGripperChannel, RobotMap.reverseGripperChannel); 
	public static final Lifter lifter = new Lifter(RobotMap.forwardLifterChannel, RobotMap.reverseLifterChannel,
												   RobotMap.forwardLifterPressureChannel, RobotMap.reverseLifterPressureChannel);
	public static final CompressorSubsystem compressorSubsystem = new CompressorSubsystem();
	
    Command autonomousCommand;

    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
		oi = new OI();
        // instantiate the command used for the autonomous period
    }
	
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

    public void autonomousInit() {
        // schedule the autonomous command (example)
        if (autonomousCommand != null) autonomousCommand.start();
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
		// This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to 
        // continue until interrupted by another command, remove
        // this line or comment it out.
        if (autonomousCommand != null) autonomousCommand.cancel();
    }

    /**
     * This function is called when the disabled button is hit.
     * You can use it to reset subsystems before shutting down.
     */
    public void disabledInit(){

    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
    }
}
