package com.example.beans;

/*

    We should prefer using constructor autowiring over all the other autowiring
    as here can mentioned the field as final if we don't want the value to chang over time.
    If some bean is not there in the context and still want to autowire with it and don't want an exception to be raise we
    need to use the required = false in the autowire annotation.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name = "Lucy";

    /*

        The @autowire annotation marks on a field constructor, setter method
        is used to auto wire the beans that is injecting beans(Objects) at runtime by
        spring runtime dependency injection mechanism.
        With autowire on class fields we can't mark the field as final
     */

//    @Autowired(required=false) used if want the code to execute when when the bean of the vehicle is not there in the spring context.
    @Autowired
    private Vehicle vehicle;

    private Vehicle1 vehicle1;

    private Vehicle2 vehicle2;

    // With autowire on the constructor we can declare the field as final
    // final is declared when won't change the bean during the entire lifecycle of the bean
    @Autowired
    public Person(Vehicle2 vehicle2) {
        System.out.println("Person bean created by spring (constructor autowiring)");
        this.vehicle2 = vehicle2;
    }

    public Vehicle1 getVehicle1() {
        return vehicle1;
    }

    public Vehicle2 getVehicle2() {
        return vehicle2;
    }

    public void setVehicle2(Vehicle2 vehicle2) {
        this.vehicle2 = vehicle2;
    }
//    We still can't make the field as final even if we use autowire on the setter.

    @Autowired
    public void setVehicle1(Vehicle1 vehicle1) {
        this.vehicle1 = vehicle1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

}
