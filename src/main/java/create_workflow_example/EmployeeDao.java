package create_workflow_example;

import java.util.ArrayList;
import java.util.List;

    public class EmployeeDao implements Dao<Employee> {
        public List<Employee> employees= new ArrayList<>();
        public List<Employee> getAll(){
            return employees;
        }
        public void save(Employee employee){
            employees.add(employee);
        }
        public Employee get(long id){
            return employees.get((int)id);
        }
        public void delete(Employee e){
            employees.remove(e);
        }
        public void update(Employee e, String[] params){
            if(params[0].length()!=0 || params[1].length()!=0 ){
                e.setEmployeeId(Integer.valueOf(params[0]));
                e.setEmployeeName(params[1]);
                employees.add(e);
            }
        }
        public EmployeeDao(){
            employees.add(new Employee("1stname",1));
            employees.add(new Employee("2ndname",2));
            employees.add(new Employee.EmployeeBuilder().employeeName("3rdname").employeeId(3).build());
        }
    }


