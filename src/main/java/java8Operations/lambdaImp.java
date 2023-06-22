package java8Operations;

interface Demo{
     void m1(int a,int b);
}
public class lambdaImp {
    public static void main(String[] args) {
        Demo d = (a, b)-> System.out.println("addition" + (a+b));
        d.m1(100,200);
        d.m1(50,60);
    }
}
