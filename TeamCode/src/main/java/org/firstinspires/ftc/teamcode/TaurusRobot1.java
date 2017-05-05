package org.firstinspires.ftc.teamcode;

import android.graphics.Color;

import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.OpticalDistanceSensor;
import com.qualcomm.robotcore.hardware.Servo;


/**
 * This class defines all hardware used for the robot!
 * Created by Preston Robbins
 * */

public class TaurusRobot1
{
    //declare hardware variables

    //motors
    public DcMotor rightMotor;
    public DcMotor leftMotor;

    //motors for belt
    public DcMotor sweeperMotor; //Motor that sweeps the ball
    public DcMotor beltMotor;   //Motor that  controls which direction the belt goes in
    public DcMotor shootingMotor; //Motor that controls the power of the shooter
    public DcMotor solidLights;
    public DcMotor flashingLights;

    //servos

    //public Servo buttonServo; //servo that changes position based on user input and autonomous programs

    //Sensors
    //public OpticalDistanceSensor lineSensor; // senses the white line next to the beacons

   // public ColorSensor colorSensor1;

    //declare hardware mapping
    public HardwareMap hwmap;

    //default constructor
    public TaurusRobot1()
    {

    }

    //method that initilazes the hardware at the start of the round
    public void init(HardwareMap ahwMap)
    {
        //reference hwmap for hardware
        hwmap = ahwMap;

        //map the hardware

        //map the motors                //give the motors names
        rightMotor = ahwMap.dcMotor.get("right motor");
        leftMotor = ahwMap.dcMotor.get("left motor");
        solidLights = ahwMap.dcMotor.get("solid light");
        flashingLights = ahwMap.dcMotor.get("flashing light");

        //shooting motors
        sweeperMotor = ahwMap.dcMotor.get("sweep motor");
        beltMotor = ahwMap.dcMotor.get("belt motor");
        shootingMotor = ahwMap.dcMotor.get("shooting motor");


        //map the Servos               //give the servos names

        //buttonServo = ahwMap.servo.get("button servo");



        //map the optical distance sensor     //give the sensor a name
        //lineSensor= ahwMap.opticalDistanceSensor.get("line sensor");
        //colorSensor1 = ahwMap.colorSensor.get("color sensor");

        //revearse the right motor for tank drive
        rightMotor.setDirection(DcMotor.Direction.REVERSE);
        //reverase the left servo



        //set the power of the motors at zero at startup
        rightMotor.setPower(0);
        leftMotor.setPower(0);

        //set the motors for belt at zero
        sweeperMotor.setPower(0);
        beltMotor.setPower(0);
        shootingMotor.setPower(0);
        flashingLights.setPower(1);
        solidLights.setPower(1);


        //set the positions of the servos at startup

    }

}
