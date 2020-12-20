package create_workflow_example;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@Builder
@ToString

public class Employee {
        String employeeName;
        Integer employeeId;

        public Employee() {
        }

        public Employee(String employeeName, Integer employeeId) {
            this.employeeName = employeeName;
            this.employeeId = employeeId;
        }

    }

