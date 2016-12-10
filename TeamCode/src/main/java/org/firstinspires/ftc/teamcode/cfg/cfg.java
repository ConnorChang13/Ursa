package org.firstinspires.ftc.teamcode.cfg;

import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class cfg {

    // DcMotors //
     // Left Drive Motor //
    public DcMotor ld = null;
     // Right Drive Motor //
    public DcMotor rd = null;
     // Forklift Up/Down Straight //
    public DcMotor f1 = null;
     // Forklift Up/Down Diagonal //
    public DcMotor f2 = null;
     // Catapult //
    public DcMotor ca = null;
     // Door //
    public Servo dr = null;
     // Bumper Motor //
    public Servo bu = null;
     // Color Sensor //
    public ColorSensor cs = null;
     // Arm //
    public DcMotor ar = null;
     // Hand //
    public Servo ha = null;

     // Hardware Map //
    HardwareMap h = null;
    public cfg(){}

     // Initialize //
    public void init(HardwareMap h) {

        ld=h.dcMotor.get("leftDrive");ld.setPower(0);ld.setDirection(DcMotorSimple.Direction.FORWARD);
        rd=h.dcMotor.get("rightDrive");rd.setPower(0);rd.setDirection(DcMotorSimple.Direction.REVERSE);
        f1=h.dcMotor.get("forkOne");f1.setPower(0);f1.setDirection(DcMotorSimple.Direction.FORWARD);
        f2=h.dcMotor.get("forkTwo");f2.setPower(0);f2.setDirection(DcMotorSimple.Direction.FORWARD);
        ca=h.dcMotor.get("catapult");ca.setPower(0);ca.setDirection(DcMotorSimple.Direction.FORWARD);
        bu=h.servo.get("bumper");bu.setDirection(Servo.Direction.FORWARD);bu.setPosition(0);
        ar=h.dcMotor.get("arm");ar.setPower(0);ar.setDirection(DcMotorSimple.Direction.FORWARD);
        ha=h.servo.get("hand");ha.setDirection(Servo.Direction.FORWARD);ha.setPosition(0);
        cs=h.colorSensor.get("colorSensor");cs.enableLed(true);

    }

}
