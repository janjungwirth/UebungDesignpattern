package org.jpr.Personen;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Address {
    private int plz;
    private String street;
    private String city;
    private Country country;

}
