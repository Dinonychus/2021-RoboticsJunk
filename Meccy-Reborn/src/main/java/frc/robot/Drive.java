package frc.robot.commands;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import 

public class Drive extends Command  {
    public Drive()  {   requires(robot.kDriveTrain); }
    @Override protected void initialize();
   public static XboxController P1 = oi.Controller0, P2 = oi.Controller1;
    moveStick = new P1;
    swooshDrive = new Drive (frontLeft, frontRight, backLeft, backRight);

}