package Generics.exe_03;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<Shape> shapeList = new ArrayList<>();

        shapeList.add(new Circle(2.0));
        shapeList.add(new Rectangle(3.0,2.0));
        System.out.println("Total area: " + totalArea(shapeList));

        List<Circle> circleList = new ArrayList<>();

        circleList.add(new Circle(4.0));
        circleList.add(new Circle(6.0));
        System.out.println("Total area circle: " + totalArea(circleList));

        List<Rectangle> rectangleList = new ArrayList<>();

        rectangleList.add(new Rectangle(5.0,7.0));
        rectangleList.add(new Rectangle(6.0,8.0));
        System.out.println("Total area rectangle: " + totalArea(rectangleList));
    }

    public static double totalArea(List<? extends Shape> list){
        double sumArea = 0.0;
        for (Shape sh : list){
            sumArea += sh.area();
        }
        return sumArea;
    }
}
