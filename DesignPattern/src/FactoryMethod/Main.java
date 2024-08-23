package FactoryMethod;
import  java.util.*;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapefactory;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the shape you want to draw");
        String s= sc.nextLine();
        if(s.equalsIgnoreCase("circle")){
            shapefactory=new CircleFactory();
        }else if(s.equalsIgnoreCase("square")){
            shapefactory = new SquareFactory();
        }
        else{
            throw new NullPointerException("Invalid shape");
        }
        shapefactory.drawshape();

    }
}
