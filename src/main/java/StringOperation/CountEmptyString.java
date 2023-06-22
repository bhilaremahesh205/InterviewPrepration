package StringOperation;

import java.util.Arrays;
import java.util.List;

public class CountEmptyString {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("as","","asa","","asassaas","","","");
        long count = stringList.stream().filter(x->x.isEmpty()).count();
        long count2 = stringList.stream().filter(x->x.isBlank()).count();
        long count3 = stringList.stream().count();

        System.out.println(count + "empty count");
        System.out.println(count2 + "blank count");
        System.out.println(count3 + "count");



        int x = 4,y = 2;
        x -= y/= x*y; //-4
        System.out.println("x is" + x + " " + "y is" + y);


        int a =3;
        System.out.println(++a * 8);
    }
}
