package Task3;

import java.util.Scanner;

public class Task10 {
	public static boolean is_Amstrong(int n) {
        int remainder, sum = 0, temp = 0;
        temp = n;
        while (n > 0) {
            remainder = n % 10;
            sum = sum + (remainder * remainder * remainder);
            n = n / 10;
        }
        return sum == temp;
    }  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Input an integer: ");
		String input = sc.nextLine();
		int number = Integer.parseInt(input); 
		System.out.println("Is Armstrong number? "+is_Amstrong(number));
	}

}
