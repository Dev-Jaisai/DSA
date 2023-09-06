import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeTest2{

    public static void main(String[] args) {


        StringImmutable s= new StringImmutable("jaisai",new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));

        Employee employee = s.getEmployee();





    }


}




