import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
        int grade = 0;
        String space = "";
        while(grade<10){
            System.out.printf(%s,space);
            System.out.printf(%d%n,grade);
            grade++;
            space = space + " ";
        }    
    }
}
