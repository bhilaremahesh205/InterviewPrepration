package Company_Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class java8programs {
    public static void main(String[] args) {
        List<Employee> employeeList= new ArrayList<>();
        employeeList.add(new Employee(1,"Mahesh",101,"active",50000));
        employeeList.add(new Employee(2,"Manish",101,"active",50000));
        employeeList.add(new Employee(3,"Jayesh",101,"active",50000));
        employeeList.add(new Employee(4,"Ramesh",101,"active",50000));
        employeeList.add(new Employee(5,"Suyesh",101,"active",50000));
        employeeList.add(new Employee(6,"Priyesh",101,"active",50000));

        Map<Integer,List<Employee>> empList = employeeList.stream().collect(Collectors.groupingBy(Employee::getDeptId,Collectors.toList()));
        empList.entrySet().forEach(integerListEntry -> {
            System.out.println(integerListEntry.getKey()+"---"+integerListEntry.getValue());
        });
    }
}
