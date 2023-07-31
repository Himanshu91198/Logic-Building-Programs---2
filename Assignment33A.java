//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Write a java program which accept string from user and count number of capital characters 
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Assignment33A
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter String : ");
        String str = sobj.nextLine();

        StringDemo obj = new StringDemo();
        
        int iRet = obj.CountCapital(str);
        System.out.println("Number of capital characters are : "+iRet);

    }
}

class StringDemo
{
    public int CountCapital(String str)
    {
        char Arr[] = str.toCharArray();
        int iCount = 0;

        for(int iCnt = 0;iCnt<Arr.length;iCnt++)
        {
            if((Arr[iCnt] >= 'A') && (Arr[iCnt] <= 'Z'))
            {
                iCount++;
            }
        }
        return iCount;
    }
}