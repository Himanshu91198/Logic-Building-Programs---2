///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Write a java program which accepts N numbers from user and accept range, Display all elements from that range.
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Assignment36D
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the numerb of elements : ");
        int iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        System.out.println("Enter the elements : ");

        for(int iCnt = 0;iCnt < iSize;iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        System.out.println("Enter the first number: ");
        int iStart = sobj.nextInt();

        System.out.println("Enter the last number: ");
        int iEnd = sobj.nextInt();

        Number obj = new Number();

        obj.Display(Arr,iStart,iEnd);

    }
}

class Number
{
    public void Display(int Arr[],int iStart,int iEnd)
    {
        System.out.println("Elements in the range are : ");
        for(int iCnt = 0;iCnt < Arr.length;iCnt++)
        {
            if((Arr[iCnt] > iStart) && (Arr[iCnt] < iEnd))
            {
                System.out.println(Arr[iCnt]);
            }
        }
    }
}