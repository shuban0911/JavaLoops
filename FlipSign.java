
public class FlipSign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(flipSign(4));

	}
	
	static int flipSign(int a)
	{
	    int neg = 0;
	 
	    // If sign is + ve turn it -ve
	    // and vice-versa
	    int tmp = a < 0 ? 1 : -1;
	    while (a != 0)
	    {
	        neg += tmp;
	        a += tmp;
	    }
	    return neg;
	}
	 

}
