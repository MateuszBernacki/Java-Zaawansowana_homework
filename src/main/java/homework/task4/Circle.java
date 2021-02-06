package homework.task4;

public class Circle extends Shape {
    final int radious;


    protected Circle(Point p, int radious) {
        super(new Point[] {
                new Point(p.x, p.y)
        });
        this.radious = radious;
    }

    @Override
    double area() {
        return Math.PI*Math.pow(radious, 2);
    }
}
