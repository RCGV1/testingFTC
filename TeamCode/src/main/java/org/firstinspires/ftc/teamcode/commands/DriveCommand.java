package org.firstinspires.ftc.teamcode.commands;

import com.arcrobotics.ftclib.command.CommandBase;
import org.firstinspires.ftc.teamcode.DriveSystem;

import java.util.function.DoubleSupplier;

public class DriveCommand extends CommandBase {
    private final DriveSystem mecanDrive;

    private final DoubleSupplier strafeSpeed, forwardSpeed, turnSpeed;


    public DriveCommand(DriveSystem mecanDrive, DoubleSupplier strafeSpeed, DoubleSupplier forwardSpeed, DoubleSupplier turnSpeed) {
        this.mecanDrive = mecanDrive;
        this.forwardSpeed = forwardSpeed;
        this.strafeSpeed = strafeSpeed;
        this.turnSpeed = turnSpeed;

        addRequirements(mecanDrive);
    }
    @Override
    public void execute() {
        mecanDrive.driveNormal(strafeSpeed.getAsDouble(), forwardSpeed.getAsDouble(), turnSpeed.getAsDouble());
    }

}
