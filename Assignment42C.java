///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// write a java program which accpet which accept two arrays from user and display odd contents of each array.
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Assignment42C
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

        obj.DisplayOdd(Arr,Brr);

        sobj.close();
    }
}

class MyArray
{
    public void DisplayOdd(int Arr[], int Brr[])
    {
        System.out.print("Elements of array are : ");
        
        for(int i = 0; i < Arr.length ; i++)
        {
            if(Arr[i] % 2 != 0)
            {
                System.out.print(Arr[i] + " ");
            }
        }

        System.out.println();

        System.out.print("Elements of array are : ");
        
        for(int i = 0; i < Brr.length ; i++)
        {
            if(Brr[i] % 2 != 0)
            {
                System.out.print(Brr[i] + " ");
            }
        }
    }
}