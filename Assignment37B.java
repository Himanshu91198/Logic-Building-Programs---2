///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Write a java program which accepts two strings from user and check whether contents of two string are equal or not.
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Assignment37B
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter First String : ");
        String First = sobj.nextLine();

        System.out.println("Enter Second String : ");
        String Second = sobj.nextLine();

        StringDemo obj = new StringDemo();

        boolean bRet = obj.StrCmpX(First, Second);

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
    public boolean StrCmpX(String src,String dest)
    {
        char Arr[] =  src.toCharArray();
        char Brr[]  = dest.toCharArray();

        int iCount = 0;

        for(int iCnt = 0; iCnt < Arr.length;iCnt++)
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
        if(iCount == Arr.length && iCount == Brr.length)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}