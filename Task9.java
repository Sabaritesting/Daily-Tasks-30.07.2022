package Task3;

import java.util.LinkedList;

public class Task9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  for (int i = 1; i < 1000; i++) {
	            int n = i;
	            LinkedList<Integer> data = new LinkedList<>();
	            while (n > 0) {
	                data.push( n % 10 );
	                n = n / 10;
	            }
	            int n1 = 0;
	            for(Integer num : data) {
	                n1 += Math.pow(num, data.size());
	            }
	            if(i == n1) {
	                System.out.println(i);
	            }
	        }
	}

}