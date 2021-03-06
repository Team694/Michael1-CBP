package org.usfirst.frc.team694.robot.subsystems;

import org.usfirst.frc.team694.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Servo;

/**
 *
 */
public class Paddle extends Subsystem {
    
    Servo servo;
    
    public Paddle() {
    	servo = new Servo(RobotMap.PADDLE_SERVO_CHANNEL);
    	
    	rotateBackward();
    }
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void rotateForward() {
    	servo.set(0.0);
    }
    
    public void rotateBackward() {
    	servo.set(1.0);
    }
}