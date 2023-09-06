package Strings;

import java.util.ArrayList;

public final class ListImmutable {

    private final  String name;

    private final ArrayList<String> employee;


    public ListImmutable(String name, ArrayList<String> employee) {
        this.name = name;
        this.employee = employee;
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getEmployee() {
        return employee;
    }
}
