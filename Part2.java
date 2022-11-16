import java.util.Scanner;

public class Part2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
                int a,b,c;
        System.out.println("Enter First number");
        a=sc.nextInt();
        System.out.println("Enter second number");
        b=sc.nextInt();
        System.out.println("Enter Third number");
       c=sc.nextInt();
       addnum(a,b);


    }
    static void addnum(int a,int b)
    {
        int c=a+b;
        System.out.println("sum"+c);
    }
}
