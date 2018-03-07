package com.spriadka.demos;

import org.junit.Assert;
import org.junit.Test;

public class NonPersonTestCase {

    @Test
    public void should_fail() {
        Assert.fail("This test should not be executed on this SCM branch");
    }

}
