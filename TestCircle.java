/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle;

import java.util.Scanner;

/**
 *
 * @author Tam Nguyen
 */
public class TestCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        double radius ;
        System.out.println("enter radius :");
        radius = sc.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println("Hình chữ nhật có "+circle.Dislay());
        System.out.println("Hình chữ nhật có "+circle.getRadius());
        System.out.println("Hình chữ nhật có "+circle.getArea());
    }
    
}
