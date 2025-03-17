package com.example;

// CompositeTest.java
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CompositeTest {
    private Composite composite;
    private Leaf leaf1;
    private Leaf leaf2;

    @Before
    public void setUp() {
        composite = new Composite();
        leaf1 = new Leaf("Leaf 1");
        leaf2 = new Leaf("Leaf 2");
        composite.add(leaf1);
        composite.add(leaf2);
    }

    @Test
    public void testOperation() {
        assertEquals("Leaf 1 Leaf 2", composite.operation());
    }

    @Test
    public void testRemove() {
        composite.remove(leaf1);
        assertEquals("Leaf 2", composite.operation());
    }

    @Test
    public void testEmptyComposite() {
        Composite emptyComposite = new Composite();
        assertEquals("", emptyComposite.operation());
    }

    // Негативные тесты
    @Test(expected = NullPointerException.class)
    public void testRemoveNull() {
        composite.remove(null);
    }
}
