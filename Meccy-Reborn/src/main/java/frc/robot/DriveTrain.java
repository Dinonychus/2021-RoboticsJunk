package frc.robot.commands;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

import edu.wpi.first.wpilibj.command.Subsystem;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;



/** An example command. You can replace me with your own command. */
public class DriveTrain extends Subsystem {
public static TurnModule turning;
public static Talon drive1;
public static Talon drive2;
public static Talon drive3;
public static Talon drive4;
public DriveTrain(){
drive1 = new Talon(1);
drive2 = new Talon(2);
drive3 = new Talon(3);
drive4 = new Talon(4);

}
@Override public void initDefaultCommand() { setDefaultCommand((new Drive()); }
public void setDrive(double speed){
  drive1.set(ControlMode.PercentOutput, -speed*0.6);
  drive2.set(ControlMode.PercentOutput, speed*0.6);
  drive3.set(ControlMode.PercentOutput, -speed*0.6);
  drive4.set(ControlMode.PercentOutput, speed*0.6);

}
public void setLeft(double speed){
  drive2.set(ControlMode.PercentOutput, speed*0.6);

 drive4.set(ControlMode.PercentOutput, speed*0.6);

}
public void setRight(double speed){
  drive1.set(ControlMode.PercentOutput, -speed*0.6);

  drive3.set(ControlMode.PercentOutput, -speed*0.6);
}
public void frontRight(double speed){
  drive1.set(ControlMode.PercentOutput, -speed*0.6);

}
public void backRight(double speed){
  drive3.set(ControlMode.PercentOutput, -speed*0.6);
 
}
public void frontLeft(double speed){
  drive2.set(ControlMode.PercentOutput, speed*0.6);

}
public void backLeft(double speed){
  drive4.set(ControlMode.PercentOutput, speed*0.6);

}
public void updateDashboard(){}

}



