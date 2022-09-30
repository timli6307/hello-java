import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your integer");
        int num1 = input.nextInt();
        //System.out.println("超讚");
        if(num1>=60)
            if(num1>=70)
                System.out.println("及格");
        else
            System.out.println("不及格");
        
    }
}
