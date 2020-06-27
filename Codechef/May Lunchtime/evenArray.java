import java.util.*;
public class evenArray {
 public static void main(String[] args)
 {
	 Scanner sc=new Scanner(System.in);
	 int i,j,k,l,m,n,t,p;
	 t=sc.nextInt();
	 for(p=1;p<=t;p++)
	 {
		 n=sc.nextInt();
		 int arr[]=new int[n];
		 k=0;l=0;
		 for(i=0;i<n;i++)
			 arr[i]=sc.nextInt();
		 for(i=0;i<n;i++)
		 {
			 if(i%2==0 && arr[i]%2!=0)
				 k++;
			 if(i%2!=0 && arr[i]%2==0)
				 l++;
		}
				 
		 if(k==l)
			 System.out.println(k);
		 else
			 System.out.println("-1");
	 }
 }
}
