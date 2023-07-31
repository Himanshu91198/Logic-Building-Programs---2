///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// write a program which accept number from user and disply below pattern. 
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Assignment49A
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number: ");
        int No = sobj.nextInt();

        Pattern obj = new Pattern();

        obj.pattern(No);

        sobj.close();
    }
}

class Pattern
{
    public void pattern(int iNo)
    {
        int iDigit = 0;
        int itemp = 0;
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            itemp = (itemp * 10) + iDigit;
            iNo = iNo / 10;
        }

        int iDigit2 = 0;
        while(itemp != 0)
        {
            iDigit2 = itemp % 10;
            for(int i = 0;i < iDigit2; i++)
            {
                System.out.print("*" + " ");
            }
            itemp = itemp / 10;
            System.out.println();
        }
    }
}