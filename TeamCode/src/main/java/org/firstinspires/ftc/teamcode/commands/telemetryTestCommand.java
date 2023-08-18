package org.firstinspires.ftc.teamcode.commands;

import com.arcrobotics.ftclib.command.CommandBase;
import org.firstinspires.ftc.robotcore.external.Telemetry;

public class telemetryTestCommand extends CommandBase {
    private Telemetry telemetry;

    public telemetryTestCommand(Telemetry telemetry) {
        this.telemetry = telemetry;
    }

    @Override
    public void execute() {
        telemetry.addData("Ran", "Command");
        telemetry.update();
    }

    @Override
    public boolean isFinished() {
        return true;
    }

}
