package org.usfirst.frc.team4546.robot.commands;

import org.usfirst.frc.team4546.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class FireCannon extends Command {
	
	protected void end() {
		Robot.cannon.setFeedBall(0.0);

	}

	
	protected void execute() {
		Robot.cannon.setFireLeft(1);
		Robot.cannon.setFireRight(1);
	
	}

	
	protected void initialize() {
		Robot.cannon.setFeedBall(75);		

	}

	
	protected void interrupted() {
		

	}

	
	protected boolean isFinished() {
		
		return false;
	}

}
