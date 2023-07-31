///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// write a program which accept number from user and display bellow pattern. 
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Assignment51E
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        int No = sobj.nextInt();

        pattern obj  = new pattern();

        obj.Pattern(No);

        sobj.close();
    }
}

class pattern
{
    public void Pattern(int iNo)
    {
        int itemp = iNo;
        int iCount = 0;
        while(itemp != 0)
        {
            itemp = itemp/10;
            iCount++;
        }

        for(int i = 0,iDigit = 0; i < iCount;i++)
        {
            int temp = iNo;
            for(int j = 0; j < iCount; j++)
            {
                iDigit = temp % 10;
                if(i > j || i == j)
                {
                    System.out.print(iDigit + " ");
                }
                else
                {
                    System.out.print(" " + " ");
                }
                temp = temp / 10;
            }   
            System.out.println();
        }
    }
}