package com.spriadka.demos;

import com.spriadka.demos.smart.testing.api.StringCombiner;
import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

public class StringCombinerTestCase {

    @Test
    public void should_combine_strings() {
        StringCombiner stringCombiner = new StringCombiner(Arrays.asList(String::toUpperCase, String::trim), "   hello   ");
        Assert.assertEquals(stringCombiner.apply(), "HELLO");
    }
}
