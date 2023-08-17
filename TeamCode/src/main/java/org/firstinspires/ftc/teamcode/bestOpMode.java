package org.firstinspires.ftc.teamcode;

import com.arcrobotics.ftclib.drivebase.MecanumDrive;
import com.arcrobotics.ftclib.gamepad.ButtonReader;
import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.arcrobotics.ftclib.gamepad.GamepadKeys;
import com.arcrobotics.ftclib.gamepad.ToggleButtonReader;
import com.arcrobotics.ftclib.hardware.motors.Motor;
import com.arcrobotics.ftclib.hardware.motors.MotorEx;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import org.firstinspires.ftc.teamcode.commands.DriveCommand;
import org.firstinspires.ftc.teamcode.commands.DriveSlowCommand;

@TeleOp(name = "Best OpMode")
public class bestOpMode extends BaseDriveChassis {
    private DriveCommand driveCommand;
    private DriveSlowCommand driveSlowCommand;

    @Override
    public void initialize() {
        super.initialize();
        driveCommand = new DriveCommand(driveSystem, gamepadEx1::getLeftX, gamepadEx1::getLeftY, gamepadEx1::getRightX);
        driveSlowCommand = new DriveSlowCommand(driveSystem, gamepadEx1::getLeftX, gamepadEx1::getLeftY, gamepadEx1::getRightX);
        gmp1(GamepadKeys.Button.X).toggleWhenPressed(driveSlowCommand);
        register(driveSystem);
        driveSystem.setDefaultCommand(driveCommand);

    }


}
