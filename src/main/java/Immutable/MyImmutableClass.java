package Immutable;

import java.util.ArrayList;
import java.util.List;

final class MyImmutableClass {

    private final String name;
    private final List<Object> petName;


    MyImmutableClass(String name, List<Object> petName) {
        this.name = name;
        this.petName = petName;
    }

    public String getName() {
        return name;
    }

    public List<Object> getPetName() {
        return new ArrayList<>(petName);
    }
}
