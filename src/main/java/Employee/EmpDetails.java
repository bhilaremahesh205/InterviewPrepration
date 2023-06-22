package Employee;

import java.util.*;
import java.util.stream.Collectors;

public class EmpDetails {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(new Employee("mahesh","IT",45000),
                new Employee("mahesh","IT",45000),
                new Employee("srujan","MECH",55000),
                new Employee("sunny","MECH",40000),
                new Employee("rohit","COMMERCE",40000),
                new Employee("manish","IT",15000),
                new Employee("mayur","IT",30000));
        //List<Employee> empList = employeeList.stream().collect(Collectors.toList());
        //Map<String, List<Employee>> byDepartment= employees.stream().collect(Collectors.groupingBy(e -> e.getSalary()));
       /* Map<String, List<Employee>> byDepartment = employees.stream().collect(Collectors.groupingBy(employee -> employee.getDepartment()));
        System.out.println(byDepartment); */

       Map<String, Employee> byDepartment = employees.stream()
               .collect(Collectors.groupingBy(employee -> employee.getDepartment(),Collectors.collectingAndThen(
                       Collectors.maxBy(Comparator.comparingInt(e -> e.getSalary())), Optional::get)));
        System.out.println(byDepartment);

        Map<String, List<Employee>> map = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        map.forEach((key,value)-> System.out.println("Department:" + key+ "Employee" + value));

//        long count = employees.stream()
//                .filter(x -> x.startsWith("a"))
//                .count();

        String str = "Mahesh";
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);



        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Sorted numbers: " + sortedNumbers);

        List<String> names = Arrays.asList("John", "Jane", "Jim", "Jill");
        List<String> upperCaseNames = names.stream()
                .map(name -> name.toUpperCase())
                .collect(Collectors.toList());
        System.out.println("Uppercase names: " + upperCaseNames);


        List<Integer> no = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        OptionalInt max = no.stream().mapToInt(n -> n).max();
        OptionalInt min = no.stream().mapToInt(n -> n).min();
        System.out.println("Max: " + max.getAsInt());
        System.out.println("Min: " + min.getAsInt());

        List<String> namess = Arrays.asList("John", "Jane", "Jim", "Jill");
        long count = namess.stream().count();
        System.out.println("Number of elements in the stream: " + count);


        Map<String, String> maps = new HashMap<>();
        System.out.println(maps.put("key", "value 1"));
        System.out.println(maps.put("key 2", "value 2"));
        System.out.println(maps.put("key 3", "value 3"));
        System.out.println(maps.put("key 3", "value 3.1"));
        System.out.println(maps.put("key 4", "value 4"));
        System.out.println(maps.put(null, "value 5"));

        Set<String> set = new HashSet<>();
        set.add("Welcome");
        set.add("To");
        set.add("Avizva");
        System.out.println(set.add("Avizva"));
        System.out.println("HashSet: " + set);






    }
}
