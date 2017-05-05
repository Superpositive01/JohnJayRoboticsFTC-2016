package org.firstinspires.ftc.teamcode;

import android.app.Activity;
import android.graphics.Color;
import android.view.View;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

/**
 * Created by root on 12/17/16.
 */

@TeleOp(name =  "IronKingsDRIVE", group = "IKTELE")
@Disabled
public class IronKingsTeleOp extends LinearOpMode
{

   IronKingsRobot1 robot = new IronKingsRobot1();

    @Override
    public void runOpMode() throws InterruptedException
    {

        robot.init(hardwareMap);



        waitForStart();

        while (opModeIsActive())
        {
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





        }


    }
}
