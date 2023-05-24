package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.Subsystem;
import frc.robot.subsystems.DriveControlSubsytem;

public class DriveControlCommand extends CommandBase {
  private DriveControlSubsytem m_driveControlSubsystem;
  private XboxController m_controller;
  /** Creates a new Control. */
  public DriveControlCommand(DriveControlSubsytem subsystem, XboxController m_operator) {
    addRequirements(subsystem);

    m_driveControlSubsystem = subsystem;

    m_controller = m_operator;


    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if (m_controller.getPOV() == 0) {
      m_driveControlSubsystem.setSpeed1(0.1);
      m_driveControlSubsystem.setSpeed2(0.1);
      m_driveControlSubsystem.setSpeed3(0.1);
      m_driveControlSubsystem.setSpeed3(0.1);

    }

    if (m_controller.getPOV() == 180) {
      m_driveControlSubsystem.setSpeed1(-0.1);
      m_driveControlSubsystem.setSpeed2(-0.1);
      m_driveControlSubsystem.setSpeed3(-0.1);
      m_driveControlSubsystem.setSpeed3(-0.1);

    }


  }

  // Called once the command ends or is interrupted.
  
  public void hi() {
    
  }

  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
