///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// write a java program which accpet which accept two arrays from user and display summation of each array.
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Assignment42E
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of elements : ");
        int Size1 = sobj.nextInt();

        int Arr[] = new int[Size1];

        System.out.println("Enter the elements : ");

        for(int i = 0; i < Arr.length;i++)
        {
            Arr[i] = sobj.nextInt();
        }

        System.out.println("Enter number of elements : ");
        int Size2 = sobj.nextInt();

        int Brr[] = new int[Size2];

        System.out.println("Enter the elements : ");

        for(int i = 0; i < Brr.length; i++)
        {
            Brr[i] = sobj.nextInt();
        }

        MyArray obj = new MyArray();

        obj.SumArray(Arr, Brr);

        sobj.close();
    }
}

class MyArray
{
    public void SumArray(int Arr[] , int Brr[])
    {
        int Asum = 0;
        int Bsum = 0;

        for(int i = 0; i < Arr.length ;i++)
        {
            Asum += Arr[i];
        }       
        System.out.print("Summation of Array is : "+Asum);
        
        System.out.println();

        for(int i = 0; i < Brr.length ;i++)
        {
            Bsum += Brr[i];
        }       
        System.out.print("Summation of Array is : "+Bsum);
    }
}