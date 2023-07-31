///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// write a java program which accpet which accept two arrays from user and form new array which is combination of contents of first and second array.
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Assignment42D
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

        int[] Crr= obj.ArrayConcate(Arr,Size1,Brr,Size2);

        System.out.print("Elements of concated array are: ");

        for(int i = 0; i < Crr.length; i++)
        {
            System.out.print(Crr[i] + " ");
        }

        sobj.close();
    }
}

class MyArray
{
    public int[] ArrayConcate(int Arr[], int iSize1,int Brr[],int iSize2)
    {
        int Crr[] = new int[iSize1 + iSize2];

        for(int i = 0; i < iSize1;i++)
        {
            Crr[i] = Arr[i];
        }
        for(int i = iSize1, j = 0; i < (iSize1+iSize2) && j < iSize2;i++,j++)
        {
            Crr[i] = Brr[j];
        }

        return Crr;
    }
}