///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// write a program which accept number from user and display bellow pattern. 
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Assignment51B
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

        for(int i = 0,iDigit = 0; i < iCount;i++)
        {
            int temp = No2;
            while(temp != 0)
            {
                iDigit = temp % 10;
                System.out.print(iDigit + " ");
                temp = temp / 10; 
            }
            System.out.println();
        }
    }
}