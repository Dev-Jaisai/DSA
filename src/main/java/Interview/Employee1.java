package Interview;

public class Employee1 {
    public   String name;

    public   int age;

    public  int salary;

    public State state;

    public String getName(String jaisai) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Employee1(String name, int age, int salary, State state) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.state = state;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", state=" + state +
                '}';
    }
}
