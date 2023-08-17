package org.firstinspires.ftc.teamcode;

import com.arcrobotics.ftclib.command.SubsystemBase;
import com.arcrobotics.ftclib.drivebase.MecanumDrive;
import com.arcrobotics.ftclib.hardware.motors.MotorEx;

public class DriveSystem extends SubsystemBase {
    private MecanumDrive mecanumDrive;

    private final double slowAmmount = 3.2;

    public MotorEx leftBack, leftFront, rightBack, rightFront;
    public DriveSystem(MotorEx leftBack, MotorEx leftfront, MotorEx rightBack, MotorEx rightFront){
        this.leftBack = leftBack;
        this.leftFront = leftfront;
        this.rightBack = rightBack;
        this.rightFront = rightFront;
        mecanumDrive = new MecanumDrive(leftFront, rightFront, leftBack, rightBack);
    }



    public void driveNormal(double strafe, double forward, double turn) {
        mecanumDrive.driveRobotCentric(strafe, forward, turn);
    }

    public void driveSlow(double strafe, double forward, double turn) {
        mecanumDrive.driveRobotCentric(strafe/slowAmmount, forward/slowAmmount, turn/slowAmmount);
    }

}
