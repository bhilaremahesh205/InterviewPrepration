package StringOperation;

public class OutPut3 {
    public static void main(String[] args) {
        String str= null;
        System.out.println(str.valueOf(10));// 10 output



        int i=10;
        i++;
        System.out.println("i is "+ i);    //10
        ++i;
        System.out.println("i is"+i);     //12
            i = i++;
        System.out.println("i is"+i);     //10
            i = ++i;
        System.out.println("i is"+ i);     //11
    }
}
