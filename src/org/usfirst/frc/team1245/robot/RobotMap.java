package org.usfirst.frc.team1245.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
	public static final int frontLeft = 0;
	public static final int rearLeft = 1;
	public static final int frontRight = 2;
	public static final int rearRight = 3;
	
	public static final int forwardGripperChannel = 0;
	public static final int reverseGripperChannel = 1;
	
	public static final int forwardLifterChannel = 4;
	public static final int reverseLifterChannel = 5;
	public static final int forwardLifterPressureChannel = 2;
	public static final int reverseLifterPressureChannel = 3;
	
	public static final int buttonToggleGrip = 1;
	public static final int buttonToggleLift = 2;
	public static final int buttonTogglePressure = 3;
	public static final int buttonLiftUp = 4;
	public static final int buttonStack = 5;
	
	public static final double translationalDeadZone = 0.1;
	public static final double rotationalDeadZone = 0.1;
}
