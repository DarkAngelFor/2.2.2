package web.model;

import java.util.ArrayList;
import java.util.List;

public class Car {

    public String model;
    private double engine;
    private String color;

    public Car(String model, double engine, String color) {
        this.model = model;
        this.engine = engine;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public double getEngine() {
        return engine;
    }

    public String getColor() {
        return color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
