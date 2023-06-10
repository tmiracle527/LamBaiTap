package BaiTap;

public class Circle {
    private final double pi = 3.14;
    private double radius;
    private int id;
    private static int variableIncrease=0;
    public static double maxRadius;
    public static double sumArena=0;
    public Circle(double radius){
        this.radius= radius;
        this.id=variableIncrease;
        variableIncrease++;
        if (radius > maxRadius) maxRadius=radius;
        sumArena += getArena();
    }
    public double getArena(){
        return this.radius*this.radius*pi;
    }

    public double getPerimeter(){
        return 2*this.radius*pi;
    }

    public int getId() {
        return id;
    }
}
