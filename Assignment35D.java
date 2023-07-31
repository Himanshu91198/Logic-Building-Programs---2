///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Write a java program which accepts number from user and return multiplication of all digits.
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Assignment35D
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int No = sobj.nextInt();
        
        Digit obj = new Digit();

        int iRet = obj.Multiply(No);

        System.out.println("Multiplication of digits is : "+iRet);
    }
}

class Digit
{
    public int Multiply(int iNo)
    {
        int iDigit = 0;
        int iMult = 1;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if(iDigit != 0)
            {
                iMult *= iDigit;
            }
            iNo = iNo / 10;
        }
        return iMult;  
    } 
}
