package Task3;

public class Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;        
        double result;
        
        while (n <= 10) {
            result= Math.pow (2, Math.pow(2, n)) + 1;
            n++;
            System.out.println (result);
        }
	}

}
