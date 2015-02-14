package org.usfirst.frc.team1245.robot;

import org.usfirst.frc.team1245.robot.commands.ToggleGrip;
import org.usfirst.frc.team1245.robot.commands.ToggleLift;
import org.usfirst.frc.team1245.robot.commands.ToggleLifterPressure;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
	public static Joystick driverJoystick;
	public static Joystick secondaryJoystick;
	
	Button toggleGripButton;
	Button toggleLiftButton;
	Button togglePressureButton;
	
	public static double deadZone(double val, double deadZone) {
		if(Math.abs(val) > deadZone) {
			if(val > 0) {
				return (val - deadZone) / (1 - deadZone);
			} else {
				return -(-val - deadZone) / (1 - deadZone);
			}
		}
		return 0;
	}
	
	public OI() {
		driverJoystick = new Joystick(0);
		secondaryJoystick = new Joystick(1);
		
		toggleGripButton = new JoystickButton(secondaryJoystick, RobotMap.buttonToggleGrip);
		toggleGripButton.whenReleased(new ToggleGrip());
		
		toggleLiftButton = new JoystickButton(secondaryJoystick, RobotMap.buttonToggleLift);
		toggleLiftButton.whenReleased(new ToggleLift());
		
		togglePressureButton = new JoystickButton(secondaryJoystick, RobotMap.buttonTogglePressure);
		togglePressureButton.whenReleased(new ToggleLifterPressure());
	}
}

