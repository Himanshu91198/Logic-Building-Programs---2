///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Write a java program which accept string from user and check whether it contains vowels in it or not.
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Assignment33D
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string : ");
        String str = sobj.nextLine();

        StringDemo obj = new StringDemo();
        
        boolean bRet = obj.ChkVowel(str);
        
        if(bRet == true)
        {
        System.out.println("String contains Vowels");
        }
        else
        {
        System.out.println("String doesnt contains Vowels");
        }
    }
}

class StringDemo
{
    public boolean ChkVowel(String str)
    {
        char Arr[] = str.toCharArray();

        int iCount = 0;

        for(int iCnt = 0;iCnt < Arr.length;iCnt++)
        {
            if((Arr[iCnt] == 'A') || (Arr[iCnt] == 'E') || (Arr[iCnt] == 'I') || (Arr[iCnt] == 'O') || (Arr[iCnt] == 'U') || (Arr[iCnt] == 'a') || (Arr[iCnt] == 'e') || (Arr[iCnt] == 'i') || (Arr[iCnt] == 'o') || (Arr[iCnt] == 'u'))
            {
                iCount++;
            }
        }
        if(iCount > 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}