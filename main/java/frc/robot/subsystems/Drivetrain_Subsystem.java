// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
//import frc.robot.commands.Drivetrain_Command;
import frc.robot.Constants;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
  
public class Drivetrain_Subsystem extends SubsystemBase {
  Joystick joy1 = new Joystick(0);
Joystick joy2 = new Joystick(1);
  private final SpeedControllerGroup m_leftMotors = new SpeedControllerGroup(
      new CANSparkMax(Constants.kleftMotor1, MotorType.kBrushless),  
      new CANSparkMax(Constants.kleftMotor2, MotorType.kBrushless),
      new CANSparkMax(Constants.kleftMotor3, MotorType.kBrushless));

  private final SpeedControllerGroup m_rightMotors = new SpeedControllerGroup(
      new CANSparkMax(Constants.krightMotor1, MotorType.kBrushless),
                            new CANSparkMax(Constants.krightMotor2, MotorType.kBrushless),
                            new CANSparkMax(Constants.krightMotor3, MotorType.kBrushless)
                            );

   private final DifferentialDrive m_drive = new DifferentialDrive(m_leftMotors, m_rightMotors);                      



  /** Creates a new Drivetrain_Subsystem. */
  public Drivetrain_Subsystem() {

  }
  public void drive(double left, double right){
    m_drive.tankDrive(left, right);
  }

  
  public void setMaxOutput(double maxOutput){
    m_drive.setMaxOutput(maxOutput);
  }
  public void drive(Joystick joy1, Joystick joy2){
    drive(joy1.getX(),joy2.getX());
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    
  }
}
