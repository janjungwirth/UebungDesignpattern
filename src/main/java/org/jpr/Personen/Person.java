package org.jpr.Personen;

import java.util.LinkedList;
import java.util.List;

public class Person {

    private String firstName;
    private String lastName;
    private List<Address> addresses;


    //NO Argument Constructor
    public Person() {
    }


    //Any Argument Constructor (all arguments)
    public Person(String firstName, String lastName, List<Address> addresses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.addresses = addresses;
    }

    // any Argument Constructor
    public Person(String firstName, String lastName) {
        this(firstName,lastName,new LinkedList<>());
    }

}
