

	import java.util.*;
	public class linchess {
	    public static void main(String[] args)
	    {  Scanner sc=new Scanner(System.in);
	        int i,j,k,l,a,m,n,t,p;boolean f=false;
	        t=sc.nextInt();
	        for(p=1;p<=t;p++)
	        {
	          n=sc.nextInt();
	          k=sc.nextInt();l=k;a=-1;
	          int arr[]=new int[n];
	          for(i=0;i<n;i++)
	          arr[i]=sc.nextInt();
	          for(i=0;i<n;i++)
	          {
	              if(k%arr[i]==0)
	              {   j=k/arr[i];
	                  if(j<=l)
	                 {
	                     l=j;
	                     a=arr[i];
	                 }
	              }
	              if(arr[i]==1)
	               f=true;
	          }
	          if(l==k && !f)
	            a=-1;
	          System.out.println(a);
	        }
	    }
	}

