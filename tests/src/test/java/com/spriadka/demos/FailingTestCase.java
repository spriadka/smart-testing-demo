package com.spriadka.demos;

import org.junit.Assert;
import org.junit.Test;

public class FailingTestCase {

    @Test
    public void should_pass() {
        Assert.assertTrue(true);
    }

    @Test
    public void should_fail_for_no_reason() {
        Assert.fail("No reason");
    }

}
