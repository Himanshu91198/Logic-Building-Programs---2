///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// write a java program which accept array of characters from user and accept one character. return difference between frequency of capital and frequency of small characters.
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Assignment44A {
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String str = sobj.nextLine();
        
        char Arr[] = str.toCharArray();

        MyArray obj = new MyArray();

        int iRet = obj.Difference(Arr);

        System.out.println("Difference of frequency in capital and small characters is : "+iRet);

        sobj.close();
    }
}

class MyArray
{
    public int Difference(char Arr[])
    {
        int iCntC = 0;
        int iCntS = 0;

        for(int i = 0;i < Arr.length;i++)
        {
            if((Arr[i] >= 'A') && (Arr[i] <= 'Z')) 
            {
                iCntC++;
            }
            else if((Arr[i] >= 'a') && (Arr[i] <= 'z'))
            {
                iCntS++;
            }
        }
        return iCntC - iCntS;
    }
}