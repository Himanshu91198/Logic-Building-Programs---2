///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// write a program which accept number from user and disply below pattern. 
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Assignment49F
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
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            for(int i = iDigit;i >= 0; i--)
            {   
                if(i == iDigit)
                {
                    System.out.print(i + " ");
                }   
                else
                {
                    System.out.print("#" + " ");
                }
            }
            iNo = iNo / 10;
            System.out.println();
        }  
    }
}