package frc.robot.commands;


import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveControlSubsystem;

public class DriveControlCommand extends CommandBase {
  private final DriveControlSubsystem mecanumDrivetrain;
  private XboxController xboxController;


  public DriveControlCommand(DriveControlSubsystem mecanumDrivetrain, XboxController xboxController) {
    this.mecanumDrivetrain = mecanumDrivetrain;
    this.xboxController = xboxController;
    addRequirements(mecanumDrivetrain);
  }

  @Override
  public void initialize() {}

  @Override
  public void execute() {
    mecanumDrivetrain.drive(-xboxController.getLeftY(), -xboxController.getLeftX(), -xboxController.getRightX());

  }

    
  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    mecanumDrivetrain.drive(0,0,0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
