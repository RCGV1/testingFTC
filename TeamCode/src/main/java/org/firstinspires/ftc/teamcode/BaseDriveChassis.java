package org.firstinspires.ftc.teamcode;

import com.arcrobotics.ftclib.command.CommandOpMode;
import com.arcrobotics.ftclib.command.button.GamepadButton;
import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.arcrobotics.ftclib.gamepad.GamepadKeys;
import com.arcrobotics.ftclib.hardware.motors.MotorEx;

import java.util.concurrent.TimeUnit;

public class BaseDriveChassis extends CommandOpMode {
    protected MotorEx fL, fR, bL, bR;
    protected DriveSystem driveSystem;
    protected GamepadEx gamepadEx1;

    /**
     * This code initializes the hardware inside the opmode
     * you also initialize your controllers and your subsystems here
     */

    @Override
    public void initialize() {
        fL = new MotorEx(hardwareMap, "frontLeft");
        fR = new MotorEx(hardwareMap, "frontRight");
        bL = new MotorEx(hardwareMap, "backLeft");
        bR = new MotorEx(hardwareMap, "backRight");

        /*
        MotorEx leftBack, MotorEx leftfront, MotorEx rightBack, MotorEx rightFront
         */
        driveSystem= new DriveSystem(bL, fL, bR, fR);
        gamepadEx1 = new GamepadEx(gamepad1);
    }

    long start1 = 0;
    long end1 = 0;
    @Override
    public void run() {
        telemetry.addData("Loop Time", TimeUnit.MILLISECONDS.convert(end1 - start1, TimeUnit.NANOSECONDS));
        start1 = System.nanoTime();
        super.run();
        telemetry.addData("Left Front", fL.get());
        telemetry.addData("Right Front", fR.get());
        telemetry.addData("Left Back", bL.get());
        telemetry.addData("Right Back", bR.get());
        telemetry.addData("Slow Mode", driveSystem.getIsSlow());

        telemetry.update();
        end1 = System.nanoTime();

    }

    protected GamepadButton gmp1(GamepadKeys.Button button) {
        return gamepadEx1.getGamepadButton(button);
    }

}
