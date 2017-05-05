package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

/**
 * A updated version of the Tor program that has more functionality.
 * This ultilizes encoders to make driving faster and more reliable.
 * Fixes previous issues in programming logic.
 * Create a method for driving in the hardware class!
 *
 */

@TeleOp(name = "TaurusTeleOp", group = "TaurTele")
public class TaurusTeleOp extends LinearOpMode
{
    TaurusRobot1 robot = new TaurusRobot1();
    boolean wasPressed = false;
    int toggle = 1;
    int decide;
    int counter = 0;
    int speed  = 0;

    @Override
    public void runOpMode() throws InterruptedException
    {
        robot.init(hardwareMap);


        waitForStart();
        //robot.buttonServo.setPosition(0);

        //robot.buttonServo.setPosition(0.0);



        while (opModeIsActive())
        {
            telemetry.addData("State Press",toggle);
            telemetry.addData("Boolean State of Press",wasPressed);
            telemetry.addData("Value of Counter",counter);
            telemetry.addData("Value of Decide",decide);
            telemetry.addData("Value of Speed",speed);
            telemetry.update();

            float leftY = -gamepad1.left_stick_y;
            float rightY = -gamepad1.right_stick_y;

            if(Math.abs(leftY) > .15f)
            {
                robot.leftMotor.setPower(leftY);
            }

            else
            {
                robot.leftMotor.setPower(0);

            }

            if(Math.abs(rightY) > .15f)
            {
                robot.rightMotor.setPower(rightY);
            }

            else
            {
                robot.rightMotor.setPower(0);
            }




            robot.leftMotor.setPower(leftY);
            robot.rightMotor.setPower(rightY);





            if(gamepad2.x)
            {
                robot.beltMotor.setPower(1);
                robot.sweeperMotor.setPower(-1);
            }

            else if(gamepad2.right_trigger > 0)
            {
                robot.beltMotor.setPower(-1);
                robot.sweeperMotor.setPower(1);
            }
            else if (gamepad2.left_trigger > 0)
            {
                robot.sweeperMotor.setPower(1);
            }
            else if(gamepad2.right_bumper)
            {
                robot.shootingMotor.setPower(-1);
            }
            /*else if(gamepad1.left_bumper)
            {
                robot.buttonServo.setPosition(.9);
            }
            */
            else
            {
                robot.beltMotor.setPower(0);
                robot.sweeperMotor.setPower(0);
                robot.shootingMotor.setPower(0);
            }

            if(gamepad1.a)
            {

                decide = (int)Math.random() * 2;
                toggle+=1;
                wasPressed = !wasPressed;

            }


            if( (toggle % 2 == 0) && (wasPressed == true) )
            {


                if(decide == 0)
                {
                    speed = 8;
                    counter+=2;

                    telemetry.addData("You are at speed 1","set");
                    telemetry.addData("State Press",toggle);
                    telemetry.addData("Boolean State of Press",wasPressed);
                    telemetry.addData("Value of Counter",counter);
                    telemetry.addData("Value of Decide",decide);
                    telemetry.addData("Value of Speed",speed);
                    telemetry.update();


                    if(counter == speed)
                    {
                        robot.flashingLights.setPower(0);
                        robot.solidLights.setPower(0);
                        counter = 0;

                        if(gamepad1.a)
                        {
                            decide = 4;
                        }
                    }
                }

                if(decide == 1)
                {
                    speed = 10;
                    counter+=5;

                    telemetry.addData("You are at speed 2","set");
                    telemetry.addData("State Press",toggle);
                    telemetry.addData("Boolean State of Press",wasPressed);
                    telemetry.addData("Value of Counter",counter);
                    telemetry.addData("Value of Decide",decide);
                    telemetry.addData("Value of Speed",speed);
                    telemetry.update();


                    if(counter == speed)
                    {
                        robot.flashingLights.setPower(0);
                        robot.solidLights.setPower(0);
                        counter = 0;

                        if(gamepad1.a)
                        {
                            decide = 4;
                        }
                    }
                }

                if(decide == 2)
                {
                    speed = 20;
                    counter+=2;

                    telemetry.addData("You are at speed 3","set");
                    telemetry.addData("State Press",toggle);
                    telemetry.addData("Boolean State of Press",wasPressed);
                    telemetry.addData("Value of Counter",counter);
                    telemetry.addData("Value of Decide",decide);
                    telemetry.addData("Value of Speed",speed);
                    telemetry.update();

                    if(counter == speed)
                    {
                        robot.flashingLights.setPower(0);
                        robot.solidLights.setPower(0);

                        counter = 0;

                        if(gamepad1.a)
                        {
                            decide = 4;
                        }
                    }
                }


            }

            if((toggle % 2 != 0) && (wasPressed == false))
            {
                robot.flashingLights.setPower(1);
                robot.solidLights.setPower(1);
            }

            robot.flashingLights.setPower(1);
            robot.solidLights.setPower(1);

        }


    }

}



