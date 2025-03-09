package com.example.main;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example8 {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person person = context.getBean(Person.class);
        Vehicle veh = context.getBean(Vehicle.class);
        System.out.println("The name of the person in spring context is : " + person.getName());
        System.out.println("The car of the person has in the spring context is : " +  person.getVehicle());
        System.out.println("The car of the person has in the spring context is : " +  person.getVehicle1());
        System.out.println("The car of the person has in the spring context is : " +  person.getVehicle2());
    }
}
