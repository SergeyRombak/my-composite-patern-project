package com.example;

// Leaf.java
public class Leaf extends Component {
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public String operation() {
        return name;
    }
}