///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Write a java program which accepts N numbers from user and accept one another number as NO, return index of last occurence of that No.
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Assignment36C
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

        System.out.println("Enter the number: ");
        int No = sobj.nextInt();

        Number obj = new Number();

        int iRet = obj.LastOcc(Arr,No);

        System.out.println("Index of last occurence of number is "+iRet);
    }
}

class Number
{
    public int LastOcc(int Arr[],int iNo)
    {
        int LastOcc = -1;

        for(int iCnt = 0;iCnt < Arr.length;iCnt++)
        {
            if(Arr[iCnt] == iNo)
            {
                LastOcc = iCnt;
            }
        }
        return LastOcc;
    }
}