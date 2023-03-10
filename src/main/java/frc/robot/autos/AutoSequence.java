package frc.robot.autos;

import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.DrivetrainSubsystem;

public class AutoSequence extends SequentialCommandGroup {

    public AutoSequence(DrivetrainSubsystem dt) { 
        addCommands(new Drive(dt, 3.0, 3.0), 
                    new Rotate(dt, Rotation2d.fromDegrees(45))
                    );
    }
    
}
