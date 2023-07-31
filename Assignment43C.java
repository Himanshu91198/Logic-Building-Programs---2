///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// write a java program which accept two arrays from user and copy the contents of that array into another array in reverse order and return new array.
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Assignment43C
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

        MyArray obj = new MyArray();

        int[] Crr = obj.CopyArrayRev(Arr);

        System.out.println("Elements in Copied array are : ");
        
        for(int i = 0;i < Crr.length ; i++)
        {
            System.out.println(Crr[i]);
        }
        
        sobj.close();
    }
}

class MyArray
{
    public int[] CopyArrayRev(int Arr[])
    {
        int Crr[] = new int[Arr.length];

        for(int i = 0; i < Arr.length ; i++)
        {
            Crr[i] = Arr[Arr.length - i - 1];
        }

        return Crr;
    }
}