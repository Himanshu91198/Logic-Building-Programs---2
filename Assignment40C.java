///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// write a java program which accpet which accept string from user and display below pattern.
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Assignment40C
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String str = sobj.nextLine();

        pattern obj = new pattern();

        obj.Pattern(str);

    }
}

class pattern
{
    public void Pattern(String str)
    {  
        char Arr[] = str.toCharArray();
        int length = Arr.length;

        for(int i = 1;i <= length;i++)
        {
            for(int j = 0;j < i ;j++)
            {
                System.out.print(Arr[j] + " ");
            }
            System.out.println();
        }
    }
}