// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc6964.FRCBearBots.subsystems;

import org.usfirst.frc6964.FRCBearBots.RobotMap;
import org.usfirst.frc6964.FRCBearBots.commands.*;
import edu.wpi.first.wpilibj.command.Subsystem;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Joystick;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
public class ArmMove extends Subsystem {

	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final Compressor compressor1 = RobotMap.armMoveCompressor1;
    private final DoubleSolenoid doubleSolenoid1 = RobotMap.armMoveDoubleSolenoid1;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

	@Override
	public void initDefaultCommand() {
		// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}

	@Override
	public void periodic() {
		compressor1.setClosedLoopControl(true);
		compressor1.setClosedLoopControl(false);
		boolean enabled=compressor1.enabled();
		boolean pressureSwitch=compressor1.getPressureSwitchValue();
		double current=compressor1.getCompressorCurrent();
		//doubleSolenoid1.set(DoubleSolenoid.Value.kOff);
		//doubleSolenoid1.set(DoubleSolenoid.Value.kForward);
		//doubleSolenoid1.set(DoubleSolenoid.Value.kReverse);
		// Put code here to be run every loop

	}

	public void moveArm(Joystick j) {
		if (j.getTrigger()) { //if trigger button pressed, go up
			doubleSolenoid1.set(DoubleSolenoid.Value.kForward);
		}
		else if (j.getTop()) { //if top button pressed, go down
			doubleSolenoid1.set(DoubleSolenoid.Value.kReverse);
		}
		else //if no button not pressed, do nothing
			doubleSolenoid1.set(DoubleSolenoid.Value.kOff);
	}
}

// Put methods for controlling this subsystem
// here. Call these from Commands.

