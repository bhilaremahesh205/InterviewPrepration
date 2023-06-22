package java8Operations;

interface A{
    void show(int x, int y);
}
class B implements A{
    @Override
    public void show(int x,int y) {
        System.out.println("show method" + x+y);
    }
}

public class lambdaExpression {
    public static void main(String[] args) {
       /* B b= new B();
        b.show();
        //o/p->show method*/

        /*A a =()-> System.out.println("show method");
        a.show();*/
        //o/p->show method*/

    A a =(x , y) -> System.out.println(x+y);
            a.show(10,20);

    }
}
