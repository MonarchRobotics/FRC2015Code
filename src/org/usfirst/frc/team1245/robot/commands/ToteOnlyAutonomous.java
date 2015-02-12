package org.usfirst.frc.team1245.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class ToteOnlyAutonomous extends CommandGroup {
    
    public  ToteOnlyAutonomous(int stagingZone) {
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
        addSequential(new DirectionalDrive(-0.5, 0.0, 0.39));
        addSequential(new Wait(1.0));
        
        addSequential(new LiftUp());
        addSequential(new Wait(1.4));
        
        // Staging zones are numbered from left to right, starting at 0
        switch(stagingZone) {
        case 1:
            addSequential(new DirectionalDrive(0.7, 0.0, 0.92));
            break;
        case 2:
            addSequential(new DirectionalDrive(0.7, 0.0, 1.84));
            break;
        }
        
        // Move into the Auto Zone (107 in)
        addSequential(new DirectionalDrive(0.7, 0.0, 1.20));
    }
}
