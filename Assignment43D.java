///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// write a java program which accept two arrays from user and copy the contents of that array into another array and return new array.
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Assignment43D
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

        for(int i = 0; i < Brr.length;i++)
        {
            Brr[i] = sobj.nextInt();
        }

        int Crr[] = new int[Size1 + Size2];

        for(int i = 0;i < Arr.length;i++)
        {
            Crr[i] = Arr[i];
        }

        for(int i = Arr.length,j = 0; i < Crr.length && j < Brr.length;i++,j++)
        {
            Crr[i] = Brr[j];
        }

        MyArray obj = new MyArray();

        int[] Drr = obj.CopyArray(Crr);

        System.out.println("Elements in Copied array are : ");
        
        for(int i = 0;i < Drr.length ; i++)
        {
            System.out.println(Drr[i]);
        }
        
        sobj.close();
    }
}

class MyArray
{
    public int[] CopyArray(int Crr[])
    {
        int Drr[] = new int[Crr.length];

        for(int i = 0; i < Crr.length ; i++)
        {
            Drr[i] = Crr[i];
        }

        return Drr;
    }
}