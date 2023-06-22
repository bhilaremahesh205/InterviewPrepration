package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmpInfo {
    public static void main(String[] args)  {
        List<Emp> empList = new ArrayList<>();
        empList.add(new Emp("Mahesh",50000));
        empList.add(new Emp("Ramesh",50000));
        empList.add(new Emp("Priyesh",50000));
        empList.add(new Emp("Rohit",50000));
        empList.add(new Emp("Srujan",50000));
         System.out.println(empList);

        //Collections.sort(empList,(e1,e2)->e1.);


    }
}
