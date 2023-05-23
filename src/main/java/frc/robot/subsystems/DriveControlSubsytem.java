package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveControlSubsytem extends SubsystemBase {

  private TalonSRX talonSRX1;
  private TalonSRX talonSRX2;
  private TalonSRX talonSRX3;
  private TalonSRX talonSRX4;

  public DriveControlSubsytem() {
      talonSRX1 = new TalonSRX(1);
      talonSRX2 = new TalonSRX(2);
      talonSRX3 = new TalonSRX(3);
      talonSRX4 = new TalonSRX(4);
  }

  @Override
  public void periodic() {
    talonSRX1.set(ControlMode.PercentOutput, 0.1);
  }
}
