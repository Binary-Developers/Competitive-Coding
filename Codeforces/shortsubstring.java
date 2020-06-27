import java.util.*;
public class shortsubstring {
 public static void main(String[] args)
 {
	 Scanner sc=new Scanner(System.in);
	 int i,p;
	int t=sc.nextInt();
	 String strA,strB;
	 sc.nextLine();
	 for(p=1;p<=t;p++)
	 {
		 strA=sc.nextLine();strB="";
		  for(i=1;i<strA.length()-1;i=i+2)
		 {
			 strB=strB+strA.charAt(i);
		 }
		  strB=strA.charAt(0)+strB+strA.charAt(strA.length()-1);
		  System.out.println(strB);
		  sc.hasNextLine();
	 }
 }
}
