/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle;

/**
 *
 * @author Tam Nguyen
 */
public class Circle {

    double radius = 1.0;
    private final double pi=3.14;

    String color = "red";

    public Circle() {

    }

    public Circle(double r) {
       this.radius = r;

    }
    
    public  double getRadius()
    {
        return radius ;
    }
    public  double getArea(){
        return pi*radius*radius;
    }
    public String Dislay()
    {
        return "circle have { color"+ color+ "radius "+ radius+"}";
    }

}
