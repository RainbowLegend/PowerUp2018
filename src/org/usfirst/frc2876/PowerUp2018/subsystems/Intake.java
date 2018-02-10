// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc2876.PowerUp2018.subsystems;

import org.usfirst.frc2876.PowerUp2018.RobotMap;
import org.usfirst.frc2876.PowerUp2018.commands.*;

import edu.wpi.first.wpilibj.Ultrasonic;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import com.ctre.phoenix.motorcontrol.NeutralMode;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
public class Intake extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final WPI_TalonSRX intakeRightTalonSRX7 = RobotMap.intakeIntakeRightTalonSRX7;
    private final WPI_TalonSRX intakeLeftTalonSRX8 = RobotMap.intakeIntakeLeftTalonSRX8;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private Ultrasonic usSensor = RobotMap.usSensor;
    public Intake() {
    	intakeLeftTalonSRX8.setInverted(false);
    	
    	intakeRightTalonSRX7.setInverted(true);
    	intakeLeftTalonSRX8.setNeutralMode(NeutralMode.Coast);
    	intakeRightTalonSRX7.setNeutralMode(NeutralMode.Coast);
    }

    @Override
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        setDefaultCommand(new IntakeStop());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
       
    }

    public void spinInwards(double output){
    	intakeLeftTalonSRX8.set(output);
    	intakeRightTalonSRX7.set(output);
    }
    
    public void spinOutwards(double output){
    	intakeLeftTalonSRX8.set(output);
    	intakeRightTalonSRX7.set(output);
    }
    
    public void setBothMotors(double output){
    	intakeLeftTalonSRX8.set(output);
    	intakeRightTalonSRX7.set(output);
    }
    
    public void updateSmartDashboard() {
		SmartDashboard.putNumber("Ultrasonic  in mm ",usSensor.getRangeMM());

    	usSensor.ping();
    	SmartDashboard.putNumber("Ultrasonic distance in Inches ",usSensor.getRangeInches());
    	SmartDashboard.putBoolean("Ultrasonic Enabled", usSensor.isEnabled());
       	SmartDashboard.putBoolean("Ultrasonic isRangeValid", usSensor.isRangeValid());
   	
    }

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

}

