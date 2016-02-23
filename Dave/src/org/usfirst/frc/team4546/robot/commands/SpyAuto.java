package org.usfirst.frc.team4546.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class SpyAuto extends CommandGroup {

	public SpyAuto()	{
		
		addSequential(new AutoDrive(1, 0));
		addSequential(new AutoYawCannon(-1, -90));
		addSequential(new AutoPitchCannon(1, 0));
		addSequential(new FireCannon());
		
	}
}
