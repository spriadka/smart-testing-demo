package com.spriadka.demos;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(Included.class)
public class CategoriesTestCase {

    @Test
    public void should_be_passing() {
        Assert.assertTrue("thisIsIncluded".equalsIgnoreCase("thISISINCLUDED"));
    }

    @Test
    public void should_be_included_and_passing() {
        Assert.assertTrue("thisIsIncluded".equalsIgnoreCase("thISISINCLUDED"));
    }

    @Test
    @Category(Excluded.class)
    public void should_be_passing_too() {
        Assert.assertTrue("myExcludedTest".contains("Excluded"));
    }

}
