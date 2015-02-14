// Compressor subsystem

package org.usfirst.frc.team1245.robot.subsystems;

import org.usfirst.frc.team1245.robot.commands.Compress;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class CompressorSubsystem extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
    // Compressor object
	private Compressor compressor;
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        
    	// Continuously compress air by default
        setDefaultCommand(new Compress());
    }
    
    // Method to start compressor closed-loop control
    public void start() {
        compressor.start();
    }
    
    // Method to stop compressor closed-loop control
    public void stop() {
    	compressor.stop();
    }
    
    public CompressorSubsystem() {
        // Initialize the compressor object
    	compressor = new Compressor();
    }
}

