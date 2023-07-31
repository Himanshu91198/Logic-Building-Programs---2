///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Write a java program which accepts numbers from user and return difference between summation of even digits and summation of odd digits.
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Assignment35E
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int No = sobj.nextInt();
        
        Digit obj = new Digit();

        int iRet = obj.CountDiff(No);

        System.out.println("Sum of even and odd digits is : "+iRet);
    }
}

class Digit
{
    public int CountDiff(int iNo)
    {
        int iDigit = 0;
        int iSumEven = 0;
        int iSumOdd = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if(iDigit % 2 == 0)
            {
                iSumEven += iDigit;
            }
            else
            {
                iSumOdd += iDigit;
            }
            iNo = iNo / 10;
        }
        return iSumEven - iSumOdd;  
    } 
}
