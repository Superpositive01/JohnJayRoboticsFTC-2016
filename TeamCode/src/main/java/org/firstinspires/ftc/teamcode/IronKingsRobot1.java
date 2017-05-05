package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareDevice;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.OpticalDistanceSensor;
import com.qualcomm.robotcore.hardware.Servo;


/**
 * This class defines all hardware used for the robot!
 * Created by Preston Robbins
 * */

public class IronKingsRobot1
{
    //declare hardware variables

    //motors
    public DcMotor rightMotor;
    public DcMotor leftMotor;
    //public DcMotor lights;

    //servos
    //public Servo autoServo; //servo that switches in autom
    //public  Servo colorServo; //servo that swtiches in atuo
    //Sensors
    //public OpticalDistanceSensor lineSensor; // senses the white line next to the beacons

    //public ColorSensor colorSensor1;

    //declare hardware mapping
    public HardwareMap hwmap;

    //default constructor
    public IronKingsRobot1()
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
       // lights = ahwMap.dcMotor.get("lights motor");

        //map the Servos               //give the servos names
        //autoServo = ahwMap.servo.get("auto servo");
        //colorServo = ahwMap.servo.get("color servo");



        //map the optical distance sensor     //give the sensor a name
        //lineSensor= ahwMap.opticalDistanceSensor.get("line sensor");

        //map the color sensor
        //colorSensor1 = ahwMap.colorSensor.get("color sensor");

        //revearse the right motor for tank drive
        rightMotor.setDirection(DcMotor.Direction.REVERSE);
        //reverase the right servo


        //set the power of the motors at zero at startup
        rightMotor.setPower(0);
        leftMotor.setPower(0);
        //lights.setPower(1);


        //set the positions of the servos at startup
    }

}
