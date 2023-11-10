import java.util.Scanner;

public class constructor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter 4 num");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        A obj = new A();
        System.out.println(obj.getClass());
        scan.close();
    }
}

 class A {
    int a;
    String B;
    int c;
    String d;
A(){}
    A(int a, String B) {
        // Initialize class members using constructor arguments
        a = a;
        B = B;
        System.out.println(a + " parameterized constructor " + B);
    }

    A(A refObj) {
        // Initialize class members using refObj's members
        c = refObj.a;
        d = refObj.B;
        System.out.println(c + " copy constructor " + d);
    }
}
 class B{
    B(){
        System.out.print("theres no number ");
    }
    B(int a,int b){
        System.out.print("there is two numbers "+b+" and"+" "+a +"so sum will be " + a+b);
    }
    B(int a,int b, int c){
        System.out.print("three numbers are there so the sum of them would be  "+ (a+b)+c );
    }
    B(int a, int b,int c,int d){
        System.out.print("the sum of 4 will be :-"+a+b+c+d);
    }
}