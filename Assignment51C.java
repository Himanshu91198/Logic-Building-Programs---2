///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// write a program which accept number from user and display bellow pattern. 
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Assignment51C
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

        int iDigit1 = 0;
        int No2 = 0;
        while(iNo != 0)
        {
            iDigit1 = iNo % 10;
            No2 = (No2 * 10)+iDigit1;
            iNo = iNo/10;
        }

        for(int i = iCount - 1,iDigit = 0; i >= 0;i--)
        {
            int temp = No2;
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