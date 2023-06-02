package frc.robot;

import frc.robot.commands.DriveControlCommand;
import frc.robot.subsystems.DriveControlSubsytem;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import edu.wpi.first.wpilibj2.command.button.Trigger;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and trigger mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final XboxController m_xboxController = new XboxController(0);
  private final JoystickButton m_joyA = new JoystickButton(m_xboxController, 1);
  private final DriveControlSubsytem m_driveSubsystem = new DriveControlSubsytem();
  //private final DriveControlCommand m_driveCommand = new DriveControlCommand(m_driveSubsystem, m_xboxController);

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
  
    // Configure the trigger bindings
    m_driveSubsystem.setDefaultCommand(new DriveControlCommand(m_driveSubsystem, m_xboxController));
    configureBindings();
  }

  /**
   * Use this method to define your trigger->command mappings. Triggers can be created via the
   * {@link Trigger#Trigger(java.util.function.BooleanSupplier)} constructor with an arbitrary
   * predicate, or via the named factories in {@link
   * edu.wpi.first.wpilibj2.command.button.CommandGenericHID}'s subclasses for {@link
   * CommandXboxController Xbox}/{@link edu.wpi.first.wpilibj2.command.button.CommandPS4Controller
   * PS4} controllers or {@link edu.wpi.first.wpilibj2.command.button.CommandJoystick Flight
   * joysticks}.
   */
  private void configureBindings() {
    //m_joyA.onTrue(m_driveCommand);
    //if (m_xboxController.getRawButtonPressed(1)){
      //m_driveSubsystem.setSpeed1(0.3);
    //}
    // Schedule `ExampleCommand` when `exampleCondition` changes to `true`
   

    // Schedule `exampleMethodCommand` when the Xbox controller's B button is pressed,
    // cancelling on release.
  }

 // public Command getAutonomousCommand() {
    // An example command will be run in autonomous
    //return Autos.exampleAuto(m_exampleSubsystem);
  //}
}
