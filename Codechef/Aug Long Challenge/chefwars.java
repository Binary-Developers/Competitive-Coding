

	import java.util.*;
	public class chefwars {

	    public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);
	        int i,j,k,l,m,n,t,p;
	        t=sc.nextInt();
	        for(p=1;p<=t;p++)
	        {   k=-1;
	            m=sc.nextInt();
	            n=sc.nextInt();
	             while(m>=0 && n>=0){
	        if (m==0)
	        {
	            k=1;
	            break;
	        }
	        if(n==0)
	        {
	            k=0;
	            break;
	        }
	        if(n>m)
	         m=0;
	        else
	         m=m-n;
	        n=n/2;
	             }
	        System.out.println(k);
	        }    
	     
	         
	    }
	}

