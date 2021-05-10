package create_workflow_example;

public class TestEmployeeDao {
    public static void main(String[] args) {
        EmployeeDao empdao = new EmployeeDao();
        Employee e5 = new Employee("wase", 5);
        empdao.employees.add(e5);
        System.out.println(empdao.getAll());
        empdao.delete(e5);
        empdao.employees.remove(1);
        empdao.employees.remove(0);
        empdao.employees.remove(0);
        Employee demoEmployee= empdao.get(0);
        System.out.println(demoEmployee);
        //  empdao.update(demoEmployee, String[] {
        //          "1","Hugo"});

        System.out.println("chking whetther any chnage triggers jenkins pipeline");
        System.out.println(empdao.getAll());
    }
}
