// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc6964.FRCBearBots;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController driveSystemSpeedController1;
    public static SpeedController driveSystemSpeedController2;
    public static SpeedControllerGroup driveSystemSpeedControllerGroup1;
    public static SpeedController driveSystemSpeedController3;
    public static SpeedController driveSystemSpeedController4;
    public static SpeedControllerGroup driveSystemSpeedControllerGroup2;
    public static DifferentialDrive driveSystemDifferentialDrive1;
    public static Compressor armMoveCompressor1;
    public static DoubleSolenoid armMoveDoubleSolenoid1;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveSystemSpeedController1 = new Spark(0);
        LiveWindow.addActuator("DriveSystem", "Speed Controller 1", (Spark) driveSystemSpeedController1);
        driveSystemSpeedController1.setInverted(false);
        driveSystemSpeedController2 = new Spark(1);
        LiveWindow.addActuator("DriveSystem", "Speed Controller 2", (Spark) driveSystemSpeedController2);
        driveSystemSpeedController2.setInverted(false);
        driveSystemSpeedControllerGroup1 = new SpeedControllerGroup(driveSystemSpeedController1, driveSystemSpeedController2  );
        LiveWindow.addActuator("DriveSystem", "Speed Controller Group 1", driveSystemSpeedControllerGroup1);
        
        driveSystemSpeedController3 = new Spark(2);
        LiveWindow.addActuator("DriveSystem", "Speed Controller 3", (Spark) driveSystemSpeedController3);
        driveSystemSpeedController3.setInverted(false);
        driveSystemSpeedController4 = new Spark(3);
        LiveWindow.addActuator("DriveSystem", "Speed Controller 4", (Spark) driveSystemSpeedController4);
        driveSystemSpeedController4.setInverted(false);
        driveSystemSpeedControllerGroup2 = new SpeedControllerGroup(driveSystemSpeedController3, driveSystemSpeedController4  );
        LiveWindow.addActuator("DriveSystem", "Speed Controller Group 2", driveSystemSpeedControllerGroup2);
        
        driveSystemDifferentialDrive1 = new DifferentialDrive(driveSystemSpeedControllerGroup1, driveSystemSpeedControllerGroup2);
        LiveWindow.addActuator("DriveSystem", "Differential Drive 1", driveSystemDifferentialDrive1);
        driveSystemDifferentialDrive1.setSafetyEnabled(true);
        driveSystemDifferentialDrive1.setExpiration(0.1);
        driveSystemDifferentialDrive1.setMaxOutput(1.0);

        armMoveCompressor1 = new Compressor(0);
        LiveWindow.addActuator("ArmMove", "Compressor 1", armMoveCompressor1);
        
        armMoveDoubleSolenoid1 = new DoubleSolenoid(0, 0, 1);
        LiveWindow.addActuator("ArmMove", "Double Solenoid 1", armMoveDoubleSolenoid1);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
