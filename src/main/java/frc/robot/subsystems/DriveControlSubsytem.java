package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveControlSubsytem extends SubsystemBase {

  private TalonSRX talonSRX1;
  private TalonSRX talonSRX2;
  private TalonSRX talonSRX3;
  private TalonSRX talonSRX4;

  public DriveControlSubsytem() {
      talonSRX1 = new TalonSRX(1);
      talonSRX2 = new TalonSRX(8);
      talonSRX3 = new TalonSRX(10);
      talonSRX4 = new TalonSRX(11);
      talonSRX1.setInverted(true);
      talonSRX4.setInverted(true);
  }

  @Override
  public void periodic() {
    System.out.println("Sensor Vel:" + talonSRX1.getSelectedSensorVelocity());
    System.out.println("Sensor Pos:" + talonSRX1.getSelectedSensorPosition());
    System.out.println("Out %" + talonSRX1.getMotorOutputPercent());
  }

  public void setSpeed1(double current1) {
    talonSRX1.set(ControlMode.PercentOutput, current1);
  } 

  public void setSpeed2(double current2) {
    talonSRX2.set(ControlMode.PercentOutput, current2);
  } 

  public void setSpeed3(double current3) {
    talonSRX3.set(ControlMode.PercentOutput, current3);
  } 

  public void setSpeed4(double current4) {
    talonSRX4.set(ControlMode.PercentOutput, current4);
  } 

  public void setAllSpeed(double speed){
    talonSRX1.set(ControlMode.PercentOutput, speed);
    talonSRX2.set(ControlMode.PercentOutput, speed);
    talonSRX3.set(ControlMode.PercentOutput, speed);
    talonSRX4.set(ControlMode.PercentOutput, speed);
  }

  public void rightSwerve(double speed){
    talonSRX1.set(ControlMode.PercentOutput, speed);
    talonSRX4.set(ControlMode.PercentOutput, -speed);
  }

  public void LeftSwerve(double speed){
    talonSRX2.set(ControlMode.PercentOutput, speed);
    talonSRX3.set(ControlMode.PercentOutput, -speed);
  }

  public void turnRight(double speed){
    talonSRX2.set(ControlMode.PercentOutput, speed);
    talonSRX3.set(ControlMode.PercentOutput, speed);
  }

  public void turnLeft(double speed){
    talonSRX1.set(ControlMode.PercentOutput, speed);
    talonSRX4.set(ControlMode.PercentOutput, speed);
  }
}
