import java.util.*;

public class crdgame3 {
	    static int digits(int n)
	    {
	        if(n>=1 && n<=9)
	         return 1;
	        if(n%9 != 0)
	         return (int)Math.floor(n/9) + 1;
	        return n/9;
	    }
	    public static void main(String[] args)
	    {
	        Scanner sc = new Scanner(System.in);
	        int i,j,k,l,m,n,t,p;
	        t=sc.nextInt();
	        for(p=1;p<=t;p++)
	        {
	            m=sc.nextInt();
	            n=sc.nextInt();
	            if(digits(m)<digits(n))
	            System.out.println("0"+" "+digits(m));
	            else
	            System.out.println("1"+" "+digits(n));
	        }      
	    }
	}