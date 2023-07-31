///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Write a java program which accepts N numbers from user and return product of all odd elements.
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Assignment36E
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements : ");
        int iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        System.out.println("Enter the elements : ");

        for(int iCnt = 0;iCnt < iSize;iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        Number obj = new Number();

        int iRet = obj.Product(Arr);

        System.out.println("Product of odd elements is :"+iRet);
    }
}

class Number
{
    public int Product(int Arr[])
    {
        int iMult = 1;
        int iCount = 0;

        for(int iCnt = 0;iCnt < Arr.length;iCnt++)
        {
            if(Arr[iCnt] % 2 != 0)
            {
                iMult *= Arr[iCnt];
                iCount++;
            }
        }
        if(iCount == 0)
        {
            return 0;
        }
        else
        {
            return iMult;    
        }
    }
}