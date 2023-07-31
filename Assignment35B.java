///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Write a java program which accepts number from user and count of odd digits.
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Assignment35B
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int No = sobj.nextInt();
        
        Digit obj = new Digit();

        int iRet = obj.CountOdd(No);

        System.out.println("Count of odd digits is : "+iRet);
    }
}

class Digit
{
    public int CountOdd(int iNo)
    {
        int iDigit = 0;
        int iCount = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if(iDigit % 2 != 0)
            {
                iCount++;
            }
            iNo = iNo / 10;
        }
        return iCount;  
    } 
}
