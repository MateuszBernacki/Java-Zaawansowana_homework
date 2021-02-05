package homework.task4;

public class Triangle extends Shape {
    final Point p;
    final Point p1;
    final Point p2;

    protected Triangle(Point p, Point p1, Point p2) {
        super(new Point[] {
                new Point(p.x, p.y),  //C
                new Point(p1.x, p1.y),  //A
                new Point(p2.x, p2.y) //B
        });
        this.p = p;
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    double area() {
        return 0.5*((p2.getX()+ p1.getX())*(p.getY()+p1.getY())+(p2.getY()+p1.getY())*(p.getX()+ p1.getX()));
    }
}
