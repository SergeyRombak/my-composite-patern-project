package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParameterizedCompositeTest {
    private String input;
    private String expected;

    public ParameterizedCompositeTest(String input, String expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"Leaf 1", "Leaf 1"},
                {"Leaf 2", "Leaf 2"},
                {"Leaf 1 Leaf 2", "Leaf 1 Leaf 2"}
        });
    }

    @Test
    public void testParameterizedOperation() {
        Composite composite = new Composite();
        composite.add(new Leaf(input));
        assertEquals (expected, composite.operation());
    }
}
