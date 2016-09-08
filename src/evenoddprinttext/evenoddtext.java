package evenoddprinttext;
import java.util.*;
public class evenoddtext {
	
	public static void main(String [] args)
			{
				int k;
				Scanner sc =new Scanner(System.in);
				int range = sc.nextInt();
				int m = sc.nextInt();
				int n = sc.nextInt();
				for(int i=1;i<=range;i++)
				{
					
					
				for(int j=1;j<=range;j++)
						{
						if(j==n)
						{
							break;
						}	 
							
					else if(i==m*j)
							{
							   System.out.println("hello");
							    i++;
								break;
							}
						}
					
				for(int j=1;j<=range;j++)
						{
						if(j==m)
							break;
						if(i==n*j)
							{
								System.out.println("bye");
								i++;
								break;
						
							}
					

						}
						
				for(int j=1;j<=range;j++)
				{		
					 if(i==m*n)
						{
						    System.out.println("hello bye");	
							i++;
						}
							else if(i==m*j)
							{
							   System.out.println("hello");
							    i++;
								
							}
						else	if(i==n*j)
							{
								System.out.println("bye");
								i++;
							}
					
					}
					
					System.out.println(i);


					}
					
						
				}
			}


			


