import java.util.Scanner;
public class PtBacNhat {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0");
        Scanner sc = new Scanner(System.in);
        System.out.print("a :" );
        double a = sc.nextDouble();

        System.out.print("b :");
        double b = sc.nextDouble();
        System.out.print("c :");
        double c = sc.nextDouble();

        if( a != 0){
            double answer = (c - b) / a;
            System.out.println("Equation pass with x = " +  answer);
        }else {
            if( b == c ){
                System.out.print("The solution is all x!");
            }else{
                System.out.print("No solution!");
            }
        }


    }
}
