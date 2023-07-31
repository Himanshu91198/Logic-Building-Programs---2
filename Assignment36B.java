///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Write a java program which accepts N numbers from user and accept one another number as NO, return index of first occurence of that No.
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Assignment36B
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the numerbof elements : ");
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

        int iRet = obj.FirstOcc(Arr,No);

        System.out.println("Index of first occurence of number is "+iRet);
    }
}

class Number
{
    public int FirstOcc(int Arr[],int iNo)
    {
        int FirstOcc = -1;

        for(int iCnt = 0;iCnt < Arr.length;iCnt++)
        {
            if(Arr[iCnt] == iNo)
            {
                FirstOcc = iCnt;
                break;
            }
        }
        return FirstOcc;
    }
}