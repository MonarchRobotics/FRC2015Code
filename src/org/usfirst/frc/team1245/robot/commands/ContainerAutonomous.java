package org.usfirst.frc.team1245.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class ContainerAutonomous extends CommandGroup {
    
    public  ContainerAutonomous() {
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
        // Pick up the recycling container
        
        // Move forward into the container
        addSequential(new DirectionalDrive(0.0, -0.5, 1.0));
        addSequential(new Wait(1.0));
        
        addParallel(new DirectionalDrive(0.0, 0.5, 2.0));
        
        // Pick up the container
        addSequential(new ToggleGrip());
        addSequential(new Wait(0.8));
        addSequential(new ToggleLift());
        addSequential(new Wait(1.4));
        
        // Move into the Auto Zone
        addSequential(new DirectionalDrive(0.0, 0.5, 2.0));
        addSequential(new Wait(1.0));
        addSequential(new Rotate(0.5, 1.0));
    }
}
