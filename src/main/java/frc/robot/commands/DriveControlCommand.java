package frc.robot.commands;

import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class DriveControlCommand extends CommandBase {
  private final Drivetrain mecanumDrivetrain;
  private JoystickButton driverJoystick;


  public DriveControlCommand(DriveControlSubsytem mecanumDrivetrain, Joystick driverJoystick) {
    this.mecanumDrivetrain = mecanumDrivetrain;
    this.driverJoystick = driverJoystick;
    addRequirements(mecanumDrivetrain);
  }

  @Override
  public void initialize() {}

  @Override
  public void execute() {
    mecanumDrivetrain.drive(-driverJoystick.getY(), -driverJoystick.getX(), -driverJoystick.getZ());

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
