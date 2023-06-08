package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.subsystems.DriveControlSubsytem;

public class DriveControlCommand extends CommandBase {
  private DriveControlSubsytem m_driveControlSubsystem;
  private XboxController m_controller;
  private JoystickButton m_joyA;


  public DriveControlCommand(DriveControlSubsytem subsystem, XboxController m_operator) {
    addRequirements(subsystem);
    m_driveControlSubsystem = subsystem;
    m_controller = m_operator;
  }

  @Override
  public void initialize() {
    m_joyA = new JoystickButton(m_controller, 1);
  }

  @Override
  public void execute() {

    //m_driveControlSubsystem.setAllSpeed(m_controller.getLeftY()); //adjusting speed

    if (m_controller.getPOV() == 0) { //constant speed
      System.out.println("D-Pad Up Pressed");
      m_driveControlSubsystem.setAllSpeed(0.2);
    } else if (m_controller.getPOV() == 180) {
      m_driveControlSubsystem.setAllSpeed(-0.2);
    }else if (m_controller.getPOV() == 90){
      m_driveControlSubsystem.rightSwerve(0.2);
    } else if (m_controller.getPOV() == 270){
      m_driveControlSubsystem.leftSwerve(0.2);
    }else if (m_controller.getLeftBumper()) {
      m_driveControlSubsystem.turnLeft(0.3);
    }else if (m_controller.getRightBumper()) {
      m_driveControlSubsystem.turnRight(0.3);
    }

    if (m_controller.getAButton()){
      m_driveControlSubsystem.setAllSpeed(-0.2);
    } 

    if (m_joyA.whileTrue(null)
    m_driveControlSubsystem.rightSwerve(0.2);
    }

    if ()


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
