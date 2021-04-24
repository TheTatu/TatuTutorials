package com.javaLab;
import java.util.Scanner;

public class Welcome
{
    public static void main(String[] args)
    {
        
        int i=0,j=0,sum=0,num1,num2;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter The Number 1");
        num1=input.nextInt();
        System.out.println("Enter The Number 2");
        num2=input.nextInt();
		for(i=num1;i<=num2;i++)
		{
            int flag=0;
            for(j=i;j>=1;j--)
            {
                
                if(i%j==0)
                {
                    flag++;
                }
                
            }    
            if(flag==2)
            {
                sum=sum+i;
                
            }
        }

        System.out.println("Sum is : "+sum);
		
        
    }
}