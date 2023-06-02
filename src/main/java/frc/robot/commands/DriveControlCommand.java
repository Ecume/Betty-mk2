package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveControlSubsytem;

public class DriveControlCommand extends CommandBase {
  private DriveControlSubsytem m_driveControlSubsystem;
  private XboxController m_controller;

  public DriveControlCommand(DriveControlSubsytem subsystem, XboxController m_operator) {
    addRequirements(subsystem);
    m_driveControlSubsystem = subsystem;
    m_controller = m_operator;
  }

  @Override
  public void initialize() {}

  @Override
  public void execute() {

    //m_driveControlSubsystem.setSpeed1(0.3);
    //m_driveControlSubsystem.setAllSpeed(m_controller.getLeftY()); //adjusting speed

    if (m_controller.getPOV() == 0) { //constant speed
      System.out.println("D-Pad Up Pressed");
      m_driveControlSubsystem.setSpeed1(1);
    } 
    else if (m_controller.getPOV() == 180) {
      m_driveControlSubsystem.setAllSpeed(-0.3);
    }
    //TODO MAKE AN ELSE IF STATEMENT FOR ALL DRIVE CONTROL 
/* 
    if (m_controller.getPOV() == 180) {
      m_driveControlSubsystem.setAllSpeed(-0.3);
    

    if (m_controller.getPOV() == 90){
      m_driveControlSubsystem.rightSwerve(0.3);
    }

    if (m_controller.getPOV() == 270){
      m_driveControlSubsystem.leftSwerve(0.3);
    }

    //betty moves up daiagonal left at a constant speed
    if (m_controller.getPOV() == 315) {
      m_driveControlSubsystem.upLeftDiagonal(0.3);
    }

    if (m_controller.getPOV() == 135) {
      m_driveControlSubsystem.upRightDiagonal(0.3);
    }

    /* */
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
