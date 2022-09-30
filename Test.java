import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your integer");
        int num1 = input.nextInt();
        
        System.out.println("Enter your next integer");
        int num2 = input.nextInt();
        
        num1=num1+num2;
        System.out.println("num1+num2 = "+num1);
	}
    public static void printStr(int str) {
		System.out.println(str);
	}
}
