//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Write a java program which accept string from user and count number of small characters 
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Assignment33B
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string : ");
        String str = sobj.nextLine();

        StringDemo obj = new StringDemo();
        
        int iRet = obj.CountSmall(str);

        System.out.println("Number of small characters are : "+iRet);
    }
}

class StringDemo
{
    public int CountSmall(String str)
    {
        char Arr[] = str.toCharArray();

        int iCount = 0;

        for(int iCnt = 0;iCnt < Arr.length;iCnt++)
        {
            if((Arr[iCnt] >= 'a') && (Arr[iCnt] <= 'z'))
            {
                iCount++;
            }
        }
        return iCount;
    }
}