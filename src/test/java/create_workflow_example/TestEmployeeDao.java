package create_workflow_example;

public class TestEmployeeDao {
    public static void main(String[] args) {
        EmployeeDao empdao = new EmployeeDao();
        Employee e4 = new Employee("wase", 4);
        empdao.employees.add(e4);
        System.out.println(empdao.getAll());
        empdao.delete(e4);
        empdao.employees.remove(1);
        empdao.employees.remove(0);
        Employee demoEmployee= empdao.get(0);
        System.out.println(demoEmployee);
        //  empdao.update(demoEmployee, String[] {
        //          "1","Hugo"});
        System.out.println(empdao.getAll());
    }
}
