///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Write a java program which accepts two strings from user and check whether first N  contents of two strings are equal or not.
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Assignment37C
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter First String : ");
        String First = sobj.nextLine();

        System.out.println("Enter Second String : ");
        String Second = sobj.nextLine();

        System.out.println("Enter number : ");
        int No = sobj.nextInt();

        StringDemo obj = new StringDemo();

        boolean bRet = obj.StrNCmpX(First, Second,No);

        if(bRet == true)
        {
            System.out.println("Strings are equal");
        }
        else
        {
            System.out.println("Strings are not equal");
        }

        sobj.close();
    }
}

class StringDemo
{
    public boolean StrNCmpX(String src,String dest,int iNo)
    {
        char Arr[] =  src.toCharArray();
        char Brr[]  = dest.toCharArray();

        int iCount = 0;

        for(int iCnt = 0; iCnt < iNo;iCnt++)
        {
            if(Arr[iCnt] == Brr[iCnt])
            {
                iCount++;
            }
            else
            {
                break;
            }
        }
        if(iCount == iNo)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}