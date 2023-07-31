///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// write a java program which accept array of characters from user and accept one character. return occurence of that character without considering case.
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

        int iRet = obj.Search(Arr);

        System.out.println("Frequency of Ocuurence is : "+iRet);

        sobj.close();
    }
}

class MyArray
{
    public int Search(char Arr[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the character : ");
        String letter = sobj.nextLine();

        char Brr[] = letter.toCharArray();

        int iCnt = 0;

        for(int i = 0,j = 0;i < Arr.length;i++)
        {
            if((Arr[i] == Brr[j]) || ((char)(Arr[i] + 32) == Brr[j])) 
            {
                iCnt++;
            }
        }
        sobj.close();
        return iCnt;       
    }
}