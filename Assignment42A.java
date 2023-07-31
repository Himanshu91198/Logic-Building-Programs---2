///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// write a java program which accpet which accept two arrays from user and display contents of each array.
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Assignment42A
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

        obj.Display(Arr,Brr);

        sobj.close();
    }
}

class MyArray
{
    public void Display(int Arr[], int Brr[])
    {
        System.out.print("Elements of array are : ");
        
        for(int i = 0; i < Arr.length ; i++)
        {
            System.out.print(Arr[i] + " ");
        }

        System.out.println();

        System.out.print("Elements of array are : ");
        
        for(int i = 0; i < Brr.length ; i++)
        {
            System.out.print(Brr[i] + " ");
        }
    }
}