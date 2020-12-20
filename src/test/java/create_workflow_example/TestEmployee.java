package create_workflow_example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TestEmployee {
    public static void main(String[] args) {

        List<Employee> employees= new ArrayList<>();

        employees.add(Employee.builder().employeeId(1).employeeName("name1").build());
        employees.add(Employee.builder().employeeId(2).employeeName("name2").build());
        //System.out.println(employees);
        employees.add(Employee.builder().employeeName("noname").build());
        // System.out.println(employees);
        employees.add(new Employee("name4",4));
        employees.add(new Employee("name5",5));
        employees.add(Employee.builder().build());
        System.out.println(employees);
       // employees.stream().filter(employee -> Objects.nonNull(employee)).forEach(System.out::println);
    }
}
