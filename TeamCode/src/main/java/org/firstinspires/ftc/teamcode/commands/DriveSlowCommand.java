package org.firstinspires.ftc.teamcode.commands;

import com.arcrobotics.ftclib.command.CommandBase;
import com.arcrobotics.ftclib.gamepad.GamepadEx;
import org.firstinspires.ftc.teamcode.DriveSystem;


import java.util.function.DoubleSupplier;

public class DriveSlowCommand extends CommandBase {
    private final DriveSystem mecanDrive;
    private final GamepadEx gamepadEx1;

    private final DoubleSupplier strafeSpeed, forwardSpeed, turnSpeed;


    public DriveSlowCommand(DriveSystem mecanDrive, DoubleSupplier strafeSpeed, DoubleSupplier forwardSpeed, DoubleSupplier turnSpeed,GamepadEx gamepadEx1) {
        this.mecanDrive = mecanDrive;
        this.forwardSpeed = forwardSpeed;
        this.strafeSpeed = strafeSpeed;
        this.turnSpeed = turnSpeed;
        this.gamepadEx1 = gamepadEx1;

        addRequirements(mecanDrive);
    }

    @Override
    public void initialize() {
        gamepadEx1.gamepad.setLedColor(232,240,0,200);
    }

    @Override
    public void execute() {

        mecanDrive.driveSlow(strafeSpeed.getAsDouble(), forwardSpeed.getAsDouble(), turnSpeed.getAsDouble());
    }
}
