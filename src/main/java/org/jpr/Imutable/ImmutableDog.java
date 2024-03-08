package org.jpr.Imutable;

import lombok.Builder;
import lombok.Value;

import java.util.List;

@Value
@Builder
public final class ImmutableDog {
    String name;
    int age;
    List<String> owners;

    public ImmutableDog(String name, int age, List<String> owners) {
        this.name = name;
        this.age = age;
        this.owners = owners;
    }

}
