package org.jpr.Imutable;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;


import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ImmutableDogTest {

    @DisplayName("Owner Tests")
    @Nested
    class OwnerTest {
        /**
         * Expected Green, List equals
         */
        @DisplayName("Happy Path getName")
        @Test
        void getOwners() {
            List<String> expected = new LinkedList<>(List.of("Jan"));
            List<String> actual = createTestdata().getOwners();
            assertEquals(expected, actual);
        }

        /**
         * Expected Green, Sascha not in Owner List
         */
        @DisplayName("Owners not added Sascha")
        @Test
        void changeOwners2() {
            LinkedList<String> expected = new LinkedList<>(List.of("Jan"));
            ImmutableDog hamlet = new ImmutableDog.ImmutableDogBuilder().age(1).name("Hamlet").owners(expected).build();
            LinkedList<String> actual = (LinkedList<String>) hamlet.getOwners();
            actual.add("Sascha");
            assertEquals(expected, hamlet.getOwners());

        }

        /**
         * Expected Green, Sascha not in Owner List
         */
        @DisplayName("Owners not added Sascha with .add")
        @Test
        void changeOwners3() {
            LinkedList<String> expected = new LinkedList<>(List.of("Jan"));
            ImmutableDog hamlet = new ImmutableDog.ImmutableDogBuilder().age(1).name("Hamlet").owners(expected).build();
            hamlet.getOwners().add("Sascha");
            assertEquals(expected, hamlet.getOwners());

        }
    }


    @DisplayName("Name Test")
    @Nested
    class NameTest {
        /**
         * Expected Green, Name = Speedy
         */
        @DisplayName("Happy Path getName")
        @Test
        void getName() {
            String expected = "Speedy";
            ImmutableDog actual = createTestdata();
            assertEquals(expected, actual.getName());
        }


        /**
         * Expected Green, Name should not be changeable
         */
        @DisplayName("Changing initial String to different name")
        @Test
        void changeOwners() {
            String name = "Speedy";
            ImmutableDog speedy = new ImmutableDog.ImmutableDogBuilder().age(1).name(name).owners(List.of("Jan")).build();
            name = "Lukas";
            assertEquals("Speedy", speedy.getName());
        }
    }

    @DisplayName("Age Test")
    @Nested
    class getAge {

        @Test
        @DisplayName("Age Test")
        public void ageTest() {
            int expected = 10;
            ImmutableDog actual = createTestdata();
            int age = actual.getAge();
            age = 120;
            assertEquals(expected, actual.getAge());
        }

    }

    public ImmutableDog createTestdata() {
        return new ImmutableDog.ImmutableDogBuilder().age(10).name("Speedy").owners(List.of("Jan")).build();
    }

}