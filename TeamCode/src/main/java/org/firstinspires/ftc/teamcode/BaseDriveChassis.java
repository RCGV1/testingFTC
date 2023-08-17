package org.firstinspires.ftc.teamcode;

import com.arcrobotics.ftclib.command.CommandOpMode;
import com.arcrobotics.ftclib.command.button.GamepadButton;
import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.arcrobotics.ftclib.gamepad.GamepadKeys;
import com.arcrobotics.ftclib.hardware.motors.MotorEx;

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
        fL = new MotorEx(hardwareMap, "leftFront");
        fR = new MotorEx(hardwareMap, "rightFront");
        bL = new MotorEx(hardwareMap, "leftBack");
        bR = new MotorEx(hardwareMap, "rightBack");
        bR.setInverted(true);
        bL.setInverted(false);
        driveSystem= new DriveSystem(bL, fL, bR, fR);
        gamepadEx1 = new GamepadEx(gamepad1);
    }

    protected GamepadButton gmp1(GamepadKeys.Button button) {
        return gamepadEx1.getGamepadButton(button);
    }

}
