package com.example.anamika.cardviewui;

public class ModelVibDuration {

    private String VibrationOnOFF;
    private String Duration;

    public ModelVibDuration(String vibrationOnOFF, String duration) {
        VibrationOnOFF = vibrationOnOFF;
        Duration = duration;
    }

    public ModelVibDuration() {
    }

    public String getVibrationOnOFF() {
        return VibrationOnOFF;
    }

    public void setVibrationOnOFF(String vibrationOnOFF) {
        VibrationOnOFF = vibrationOnOFF;
    }

    public String getDuration() {
        return Duration;
    }

    public void setDuration(String duration) {
        Duration = duration;
    }
}
