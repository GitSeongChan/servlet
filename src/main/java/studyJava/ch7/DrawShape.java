package studyJava.ch7;

public class DrawShape {
    public static void main(String[] args) {
        Point[] point = {
                new Point(),
                new Point(100, 200),
                new Point(300, 400),
                new Point(140, 250)
        };
        Triangle t = new Triangle(point);
        Circle c = new Circle();

        t.draw();
        c.draw();
    }
}
class Shape {
    String color = "black";
    void draw() {
        System.out.println("color = " + color);
    }
}

class Point{
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    Point() {
        this(0, 0);
    }
    String getXY() {
        return "("+x+", "+y+")";
    }
}

class Circle extends Shape {
    Point center;
    int r;

    Circle() {
        this(new Point(0,0),100);
    }

    Circle(Point center, int r) {
        this.center = center;
        this.r = r;
    }

    @Override
    void draw() {
        System.out.printf("[center:(%d, %d), r=%d, color:%s]%n", center.x, center.y, r, color);
    }
}

class Triangle extends Shape {
    Point[] p;

    Triangle(Point[] p) {
        this.p = p;
    }

    @Override
    void draw() {
        System.out.printf("[p1=%s, p2=%s, p3=%s,p4=%s color=%s]%n",
                p[0].getXY(), p[1].getXY(),p[2].getXY(),p[3].getXY(), color);
    }
}