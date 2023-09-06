public final class StringImmutable {
    private final String name;
    private final Employee employee;

    public StringImmutable(String name, Employee employee) {
        this.name = name;
        this.employee = new Employee(employee); // Create a copy
    }

    public String getName() {
        return name;
    }

    public Employee getEmployee() {
        return new Employee(employee); // Return a copy
    }
}
