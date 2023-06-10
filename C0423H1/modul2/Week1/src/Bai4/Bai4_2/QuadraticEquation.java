package Bai4_2;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return this.b * this.b - 4 * this.a * this.c;
    }

    public double root() {
        return (-this.b + Math.sqrt(this.getDiscriminant())) / (2 * this.a);
    }

    public double root2() {
        return (-this.b + Math.sqrt(this.getDiscriminant())) / (2 * this.a);
    }


}

