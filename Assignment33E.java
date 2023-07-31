///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Write a java program which accept string from user and display it in reverse order.
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Assignment33E
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string : ");
        String str = sobj.nextLine();

        StringDemo obj = new StringDemo();

        obj.Reverse(str);
    }
}

class StringDemo
{
    public void Reverse(String str)
    {
        char Arr[] = str.toCharArray();

        int iStart = 0;
        int iEnd = Arr.length - 1;
        char cTemp = ' ';

        while(iStart < iEnd)
        {
            cTemp = Arr[iStart];
            Arr[iStart] = Arr[iEnd];
            Arr[iEnd] = cTemp;

            iStart++;
            iEnd--;
        }

        String newstr = new String(Arr);
        System.out.println("Reverse string is "+newstr);
    }
}