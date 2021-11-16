package org.usfirst.frc.team7327.robot;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Scheduler;

import com.kauailabs.navx.frc.AHRS;
import org.usfirst.frc.team7327.robot.subsystems.DriveTrain;

import edu.wpi.first.cameraserver.CameraServer;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.I2C;

public class Robot extends TimedRobot {
  public static final DriveTrain kDrivetrain = new DriveTrain();
  public static final OI oi = new OI();
  public static AHRS nav; 
  Compressor c0 = new Compressor(0);
  @Override public void robotInit() { 
    nav = new AHRS(I2C.Port.kMXP); 
    //CameraServer.getInstance().startAutomaticCapture();
    //c0.setClosedLoopControl(true); 
  }
  @Override public void robotPeriodic() { kDrivetrain.updateDashboard(); }
  @Override public void teleopInit() { }
  @Override public void autonomousInit() { nav.reset(); }
  @Override public void autonomousPeriodic() { Scheduler.getInstance().run(); }
  @Override public void teleopPeriodic() { Scheduler.getInstance().run(); }
  @Override public void testPeriodic() {}
  public static double NavAngle() {return NavAngle(0);}
  public static double NavAngle(double add){double angle = Robot.nav.getAngle()+add;
    while(angle>360)angle-=360;while(angle<0)angle+=360;return angle; 
	}
}