package frc.robot.commands;

public class Drive extends Command  {
    public Drive()  {   requires(robot.kDriveTrain); }
    @Override protected void initialize() {  }
}   public static XboxController P1 = oi.Controller0, P2 = oi.Controller1;

    @Override protected void execute()  {

        robot.kDrivetrain.setDrive(LeftY(P1));
        
         
    }
