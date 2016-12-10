package org.firstinspires.ftc.teamcode.auto;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.cfg.cfg;

@Autonomous(name = "experimental", group = "exp")
public class experimental extends LinearOpMode {

    cfg dobot = new cfg();

    @Override
    public void runOpMode() throws InterruptedException {

        dobot.init(hardwareMap);

        run(1, -1, 10, "Doing a circle.");

    }

    public void run(float leftDrive, float rightDrive, int seconds, String desc) {

        // Code by D. Heinz //

        dobot.init(hardwareMap);
        ElapsedTime et = new ElapsedTime();
        telemetry.addData("Doing", desc);
        et.reset();
        while(seconds<=et.seconds()) {

            dobot.ld.setPower(leftDrive);
            dobot.rd.setPower(rightDrive);

        }

    }

}
