package com.reusingclasses;

class one {
    public void Name()
    {
        System.out.println("Mayank");
    }
}
 class two extends one {
    public void Surname()
    {
        System.out.println("Mudgal");
    }
}
 
public class Test {
    public static void main(String[] args)
    {
        two i=new two();
        i.Name();
    	i.Surname();
    }
}