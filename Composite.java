package com.example;

// Composite.java
import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
    private List<Component> children = new ArrayList<>();

    public void add(Component component) {
        children.add(component);
    }

    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public String operation() {
        StringBuilder result = new StringBuilder();
        for (Component child : children) {
            result.append(child.operation()).append(" ");
        }
        return result.toString().trim();
    }
}
