// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import java.util.function.DoubleSupplier;


import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.Subsystem;
import frc.robot.Constants;
import frc.robot.subsystems.Drivetrain_Subsystem;
import frc.robot.Robot;


public class Drivetrain_Command extends CommandBase {
  /**
   * Creates a new Drivetrain_Command.
   */
  private final Drivetrain_Subsystem m_drive;
  private final double m_left;
  private final double m_right;

  public  Drivetrain_Command(Drivetrain_Subsystem subsystem, Double right, Double left){
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(Robot.Drivetrain_Subsystem);
    m_drive = subsystem;
    m_left = Robot.robotContainer.stick.getRawAxis(Constants.leftJoystick);
    m_right = Robot.robotContainer.stick.getRawAxis(Constants.rightJoystick);

  }




  

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
   // m_drive.Tankieboi(m_left, m_right);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
