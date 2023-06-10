package Bai4_4;

public class Fan {
    public static final int Slow = 1, Medium = 2, Fast = 3;
    private int speed = Slow;
    private boolean on = false;
    private double radius = 5;
    private String color = "white";

    public Fan() {
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan(int speed, boolean on, double radius, String color) {
    }

    public String toString() {
        return this.on ?
                "Fan{" + "speed=" + this.speed + ", radius=" + this.radius + ", color='" + this.color + "', fan is on}\n" :
                "Fan{" + "speed=" + this.speed + ", radius=" + this.radius + ", color='" + this.color + "', fan is off}\n";
    }
}