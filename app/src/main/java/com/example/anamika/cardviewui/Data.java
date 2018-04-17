package com.example.anamika.cardviewui;

public class Data {

    private final String label;
    private final String display;
    private final int imageResource;

    public Data(String label, String display, int imageResource)
    {
        this.label = label;
        this.display = display;
        this.imageResource = imageResource;
    }

    public String getLabel() {
        return label;
    }

    public String getDisplay() {
        return display;
    }

    public int getImageResource() {
        return imageResource;
    }
}
