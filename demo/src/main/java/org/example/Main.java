package org.example;

import org.example.beans.Vehicle;
import org.example.config.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        Vehicle veh = new Vehicle();
        veh.setName("Mercedes-benz");
        System.out.println("non-context string vehicle = "+veh.getName());

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle veh1 = context.getBean(Vehicle.class);
        System.out.println("context string vehicle = " + veh1.getName());

        String str = context.getBean(String.class);
        System.out.println(str);

        System.out.println(context.getBean(Integer.class));



        var context1 = new AnnotationConfigApplicationContext(ProjectConfig1.class);
        System.out.println("Vehicle1 = " + context1.getBean("vehicle1", Vehicle.class).getName());
        System.out.println("Vehicle2 = " + context1.getBean("vehicle2", Vehicle.class).getName());


        var context2 = new AnnotationConfigApplicationContext(ProjectConfig2.class);
        System.out.println("Vehicle1 = " + context2.getBean("Audi", Vehicle.class).getName());
        System.out.println("Vehicle2 = " + context2.getBean("Ferrari", Vehicle.class).getName());
        System.out.println("Vehicle3 = " + context2.getBean("Honda", Vehicle.class).getName());

        var context3 = new AnnotationConfigApplicationContext(ProjectConfig3.class);
        System.out.println("primary vehicle = " + context3.getBean(Vehicle.class).getName());

        var context4 = new AnnotationConfigApplicationContext(ProjectConfig4.class);
        var veh2 = context4.getBean(Vehicle.class);
        System.out.println("Component = " + veh2.getName());
        veh2.printHello();
    }
}