package org.usfirst.frc694.robot.subsystems;

import org.usfirst.frc694.robot.Constants;
import org.usfirst.frc694.robot.commands.*;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Puncher extends Subsystem {

    private Compressor compressor = new Compressor(Constants.PDP_ID);
    private Solenoid puncher = new Solenoid(Constants.PCM_ID, Constants.PUNCHER_CHANNEL);

    public void initDefaultCommand() {
        setDefaultCommand(new PuncherIn());
    }

    public void compressorStart() {
        compressor.start();
    }

    public void compressorStop() {
        compressor.stop();
    }

    public double getCompressorCurrent() {
        return compressor.getCompressorCurrent();
    }

    public boolean enabled() {
        return compressor.enabled();
    }

    public boolean getPressureSwitchValue() {
        return getPressureSwitchValue();
    }

    public void extend() {
        puncher.set(true);
    }

    public void retract() {
        puncher.set(false);
    }

}