///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// write a java program which accept two arrays from user and return difference between summation of arrays.
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Assignment43B
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

        obj.MinArray(Arr, Brr);
        
        sobj.close();
    }
}

class MyArray
{
    public void MinArray(int Arr[] , int Brr[])
    {
        int Amin = Arr[0];
        int Bmin = Brr[0];

        for(int i = 0; i < Arr.length ;i++)
        {
            if(Amin > Arr[i])
            {
                Amin = Arr[i];
            }
        }       

        for(int i = 0; i < Brr.length ;i++)
        {
            if(Bmin > Brr[i])
            {
                Bmin = Brr[i];
            }
        }       

        System.out.println("Minimum value of Arr and Brr Array are : "+Amin+" "+Bmin);
    }
}