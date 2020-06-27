import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int i,k,m,t,p;
        t=sc.nextInt();
        for(p=1;p<=t;p++)
        {   
            int arr[]=new int[5];
            for(i=0;i<5;i++)
            arr[i]=sc.nextInt();
            k=sc.nextInt();m=0;
            for(i=0;i<5;i++)
            {
                m=m+arr[i];
                
            }
            if(m*k<=120)
            System.out.println("No");
            else 
            System.out.println("Yes");
        }
        }
    }
    