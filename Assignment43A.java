///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// write a java program which accept two arrays from user and return difference between summation of arrays.
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Assignment43A
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

        int iRet = obj.DiffArray(Arr, Brr);

        System.out.println("Diiference between summation of array is : "+iRet);

        sobj.close();
    }
}

class MyArray
{
    public int DiffArray(int Arr[] , int Brr[])
    {
        int Asum = 0;
        int Bsum = 0;

        for(int i = 0; i < Arr.length ;i++)
        {
            Asum += Arr[i];
        }       

        for(int i = 0; i < Brr.length ;i++)
        {
            Bsum += Brr[i];
        }       

        return Asum - Bsum;
    }
}