import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{ int n;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	while(n<=1000)
	{
		if(n%10==0)
		{
			System.out.print(n);
			break;
		}
		n++;
	}
	
		}
	}
	
