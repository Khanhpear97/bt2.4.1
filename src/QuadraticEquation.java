public class QuadraticEquation {
    double a, b, c;
    double delta, root1, root2;

    public QuadraticEquation() {}
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDiscriminant() {
        this.delta = b * 2 - 4 * a * c;
        return this.delta;
    }
    public double getRoot1() {
        if (this.delta == 0) {
            return -b / (2 * a);
        }
        return (-b + Math.pow(Math.pow(b,2) - 4 * a * c,0.5)) / (2 * a);
    }
    public double getRoot2() {
        if (this.delta == 0) {
            return -b / (2 * a);
        }
        return (-b - Math.pow(Math.pow(b,2) - 4 * a * c,0.5)) / (2 * a);
    }
    public String quadraticEquation() {
        this.root1 = this.getRoot1();
        this.root2 = this.getRoot2();
        if (this.delta > 0) {
            return "The equation has two roots: " + this.root1 + " and " + this.root2;
        } else if (this.delta == 0) {
            return  "The equation has one roots: " + this.root1;
        } else {
            return  "The equation has no real roots";
        }
    }
}
