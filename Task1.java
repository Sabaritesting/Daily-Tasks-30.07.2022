package Task3;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,a=1,b=0,c;
	    System.out.println("First 20 Pell numbers: ");
	    for(n=1; n<=20; n++)
	     {
	      c= a + 2*b;
	      System.out.print(c+" ");
	      a = b;
	      b = c;
	     }
	}

}
