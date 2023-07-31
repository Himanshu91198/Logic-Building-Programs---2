///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Write a java program which accept string from user and return differernce between frequency of small characters and frequency of capital characters
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Assignment33C
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string : ");
        String str = sobj.nextLine();

        StringDemo obj = new StringDemo();
        
        int iRet = obj.CountDiff(str);

        System.out.println("Frequency difference between small and capital characters is : "+iRet);
    }
}

class StringDemo
{
    public int CountDiff(String str)
    {
        char Arr[] = str.toCharArray();

        int iCountS = 0;
        int iCountC = 0;

        for(int iCnt = 0;iCnt < Arr.length;iCnt++)
        {
            if((Arr[iCnt] >= 'a') && (Arr[iCnt] <= 'z'))
            {
                iCountS++;
            }
            if((Arr[iCnt] >= 'A') && (Arr[iCnt] <= 'Z'))
            {
                iCountC++;
            }
        }
        return iCountS-iCountC;
    }
}