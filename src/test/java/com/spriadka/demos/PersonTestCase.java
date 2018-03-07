package com.spriadka.demos;

import org.junit.Assert;
import org.junit.Test;

public class PersonTestCase {

    @Test
    public void should_initialize_correctly() {
        Person person = new Person("Dumbledore", 255);
        Assert.assertEquals(person.getName(), "Dumbledore");
        Assert.assertEquals(person.getAge(), 255);
    }

    @Test
    public void should_have_toString_right() {
        Person person = new Person("Gandalf White", 3000);
        Assert.assertEquals(person.toString(), "Hello, I am Gandalf White and I'm 3000 years old");
    }

}
