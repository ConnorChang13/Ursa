package org.firstinspires.ftc.teamcode.tele;

import android.content.Context;
import android.graphics.Color;

import com.qualcomm.robotcore.eventloop.opmode.*;
import com.qualcomm.robotcore.hardware.ColorSensor;
import org.firstinspires.ftc.teamcode.cfg.cfg;

@TeleOp(name = "teleAll", group = "all")
public class All extends OpMode {

    cfg dobot = new cfg();
    public boolean isUp = true;
    public boolean goingDown = false;
    enum ce {r,g,b,n};
    double mlt = 1;

    @Override
    public void init() { telemetry.addData("STAT", "init");

        dobot.init(hardwareMap);

    }

    @Override
    public void init_loop() {



    }

    @Override
    public void start() {



    }

    @Override
    public void loop() { telemetry.addData("STAT", "loop");

        // Controller 1 :: Drive //

        if(gamepad1.right_trigger==1) {

            dobot.ld.setPower(gamepad1.left_stick_y*.5);
            dobot.rd.setPower(gamepad1.right_stick_y*.5);

        }
        else {

            dobot.ld.setPower(gamepad1.left_stick_y);
            dobot.rd.setPower(gamepad1.right_stick_y);

        }

        // Controller 2 :: Other //

        // Color Sensor //

        int r = dobot.cs.red();
        int g = dobot.cs.green();
        int b = dobot.cs.blue();
        Color.RGBToHSV(r * 8, g * 8, b * 8, new float[]{0F, 0F, 0F});
        ce c = ce.n;

             if((r > b)&&(r > g)){c=ce.r;}
        else if((g > r)&&(g > b)){c=ce.g;}
        else if((b > g)&&(b > r)){c=ce.b;}

        // Forklift //

        dobot.f1.setPower(gamepad2.left_stick_y);
        dobot.f2.setPower(gamepad2.right_stick_y);

        // Catapult //

        if(gamepad2.left_trigger >= .5) {

            dobot.ca.setPower(1);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            dobot.ca.setPower(-1);
            try {
                Thread.sleep(180);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            dobot.ca.setPower(0);

        }

        // Bumper thing //

        dobot.bu.setPosition(gamepad2.right_trigger * 90); // works

    }

    @Override
    public void stop() { telemetry.addData("STAT", "dead");

    }

}
