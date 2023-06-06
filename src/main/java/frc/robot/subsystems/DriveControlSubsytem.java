package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveControlSubsytem extends SubsystemBase {

  private TalonSRX talonSRX1;
  private TalonSRX talonSRX8;
  private TalonSRX talonSRX10;
  private TalonSRX talonSRX11;

  public DriveControlSubsytem() {
      talonSRX1 = new TalonSRX(1);
      talonSRX8 = new TalonSRX(8);
      talonSRX10 = new TalonSRX(10);
      talonSRX11 = new TalonSRX(11);
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
    talonSRX8.set(ControlMode.PercentOutput, current2);
  } 

  public void setSpeed3(double current3) {
    talonSRX10.set(ControlMode.PercentOutput, current3);
  } 

  public void setSpeed4(double current4) {
    talonSRX11.set(ControlMode.PercentOutput, current4);
  } 

  public void setAllSpeed(double speed){
    talonSRX1.set(ControlMode.PercentOutput, -speed);
    talonSRX8.set(ControlMode.PercentOutput, speed);
    talonSRX10.set(ControlMode.PercentOutput, -speed);
    talonSRX11.set(ControlMode.PercentOutput, speed);
  }

  public void rightSwerve(double speed){
    talonSRX1.set(ControlMode.PercentOutput, speed);
    talonSRX11.set(ControlMode.PercentOutput, speed);
  }

  public void leftSwerve(double speed){
    talonSRX1.set(ControlMode.PercentOutput, speed);
    //talonSRX8.set(ControlMode.PercentOutput, -speed);
    talonSRX10.set(ControlMode.PercentOutput, speed);
    //talonSRX11.set(ControlMode.PercentOutput, speed);
  }

  public void turnRight(double speed){
    talonSRX8.set(ControlMode.PercentOutput, speed);
    talonSRX10.set(ControlMode.PercentOutput, speed);
  } 

  public void turnLeft(double speed){
    talonSRX8.set(ControlMode.PercentOutput, speed);
    talonSRX10.set(ControlMode.PercentOutput, -speed);
  }
  

  public void upLeftDiagonal(double speed) {
    talonSRX8.set(ControlMode.PercentOutput, speed);
    talonSRX11.set(ControlMode.PercentOutput, speed);
  } 

  public void upRightDiagonal(double speed) {
    talonSRX10.set(ControlMode.PercentOutput, speed);
    talonSRX1.set(ControlMode.PercentOutput, speed);
  } 


}
