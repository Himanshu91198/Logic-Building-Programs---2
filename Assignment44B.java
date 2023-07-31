///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// write a java program which accept array of characters from user and return number of vowels present.
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

        int iRet = obj.ArrayCountVowels(Arr);

        System.out.println("NUmber of vowels are : "+iRet);

        sobj.close();
    }
}

class MyArray
{
    public int ArrayCountVowels(char Arr[])
    {
        int iCnt = 0;

        for(int i = 0;i < Arr.length;i++)
        {
            if((Arr[i] == 'A') || (Arr[i] == 'E') || (Arr[i] == 'I') || (Arr[i] == 'O') || (Arr[i] == 'U') || (Arr[i] == 'a') || (Arr[i] == 'e') || (Arr[i] == 'i') || (Arr[i] == 'o') || (Arr[i] == 'u'))
            {
                iCnt++;
            }
        }
        return iCnt;
    }
}