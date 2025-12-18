Implement all subsystems by extending SubsystemBase
Simple subsystem code example below

package frc.subsystems;

import com.ctre.phoenix6.controls.VoltageOut;
import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap;

public class ShooterSubsystem extends SubsystemBase{
    private TalonFX UpperMotor = new TalonFX(RobotMap.UpperCanID);
    private TalonFX LowerMotor = new TalonFX(RobotMap.LowerCanID);
     public IntakeSubsystem() {
        UpperMotor = new TalonFX(RobotMap.IntakePort);
        LowerMotor = new TalonFX(RobotMap.IntakePort);
        
    }

    public void setSpeed(double intakeSpeed){
        ShooterSubsystem.setControl(new VoltageOut(intakeSpeed));
    }
    public void stop(){
        ShooterSubsystem.setControl(new VoltageOut(0));
    }
}