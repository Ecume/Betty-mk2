package frc.robot;

import frc.robot.Constants.OperatorConstants;
import frc.robot.commands.DriveControlCommand;
import frc.robot.subsystems.DriveControlSubsystem;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;

public class RobotContainer {
  private final DriveControlSubsystem mecanumDrivetrain = new DriveControlSubsystem();

  private static XboxController XboxController  = new XboxController(1);

  
  public RobotContainer() {
  
    mecanumDrivetrain.setDefaultCommand(new DriveControlCommand(mecanumDrivetrain, XboxController));
    configureBindings();
  }

  private void configureBindings() {
    
    
  }

 

}
