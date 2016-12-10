package org.firstinspires.ftc.teamcode.auto;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.cfg.cfg;

@Autonomous(name = "autoAll", group = "All")
public class AutoAll extends LinearOpMode {

    String ins = "Make sure the robot has a preloaded ball in the catapult.";
    cfg dobot = new cfg();

    @Override
    public void runOpMode() throws InterruptedException {

        telemetry.addData("READ", ins);

        dobot.init(hardwareMap);

        run(0.5, 0.5, 1, "go forth");
        run(0.5, -0.5, 1, "turn right");
        run(1, 1, 3, "go forth");

        

    }

    public void run(double leftDrive, double rightDrive, int seconds, String desc) {
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
