///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Write a java program which accepts N numbers from user and return difference between summation of even elements and summation of odd elements.
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Assignment34A
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements : ");
        int iSize = sobj.nextInt();

        int Arr[] = new int[iSize];
        
        System.out.println("Enter the elements : ");
        for(int iCnt = 0;iCnt<iSize;iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        System.out.println("Elements of array are : ");
        for(int iCnt = 0;iCnt<iSize;iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }

        ArrayDemo obj = new ArrayDemo();

        int iRet = obj.Difference(Arr);

        System.out.println("Difference between Even and Odd numbers is : "+iRet);
    }
}

class ArrayDemo
{
    public int Difference(int Arr[])
    {
        int SumEven = 0;
        int SumOdd = 0;

        for(int iCnt = 0;iCnt < Arr.length;iCnt++)
        {
            if((Arr[iCnt] % 2) == 0)
            {
                SumEven += Arr[iCnt];
            }
            else
            {
                SumOdd += Arr[iCnt];
            }
        }
        return SumEven - SumOdd;
    }
}