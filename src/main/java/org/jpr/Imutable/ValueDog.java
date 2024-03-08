package org.jpr.Imutable;

import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.Value;

import java.util.List;


@Value
@Setter
@EqualsAndHashCode
public class ValueDog {
    String name;
    int age;
    List<String> owners;

    public ValueDog(String name, int age, List<String> owners) {
        this.name = name;
        this.age = age;
        this.owners = owners;
    }
}
