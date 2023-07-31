///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Accept string from user and reverse the contents of that string by toggling the case.
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Assignment37E
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = sobj.nextLine();

        StringDemo obj = new StringDemo();

        boolean bRet = obj.StrPallindrome(str);

        if(bRet == true)
        {
            System.out.println("String is pallindrome");
        }
        else
        {
            System.out.println("String is not pallindrome");
        }

        sobj.close();
    }
}

class StringDemo
{
    public boolean StrPallindrome(String str)
    {
        char Arr[] = str.toCharArray();
        char Brr[] = str.toCharArray();

        int iStart = 0;
        int iEnd = Arr.length - 1;
        int iCount = 0;

        char cTemp = ' ';

        while(iStart < iEnd)
        {
            cTemp = Arr[iStart];
            Arr[iStart] = Arr[iEnd];
            Arr[iEnd] = cTemp;
            iStart++;
            iEnd--;
        }
        
        for(int iCnt = 0;iCnt < Arr.length ; iCnt++)
        {
            if((Arr[iCnt] == Brr[iCnt]) || (Arr[iCnt] == (char) Brr[iCnt] + 32) || (Brr[iCnt] == (char) Arr[iCnt] + 32) || (Brr[iCnt] == (char) Arr[iCnt] - 32) || (Arr[iCnt] == (char) Brr[iCnt] - 32))
            {
                iCount++;
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