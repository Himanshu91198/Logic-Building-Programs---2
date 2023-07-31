///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Write a java program which accepts number from user and count of digits in between 3 and 7
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Assignment35C
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int No = sobj.nextInt();
        
        Digit obj = new Digit();

        int iRet = obj.CountRange(No);

        System.out.println("Count of digits in range is : "+iRet);
    }
}

class Digit
{
    public int CountRange(int iNo)
    {
        int iDigit = 0;
        int iCount = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if((iDigit > 3) && (iDigit < 7))
            {
                iCount++;
            }
            iNo = iNo / 10;
        }
        return iCount;  
    } 
}
