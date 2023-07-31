///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Write a java program which accepts N numbers from user and accept one another number as NO, check whether NO is present or not.
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Assignment36A
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int iSize = sobj.nextInt();
        
        int Arr[] = new int[iSize];

        System.out.println("Enter the elements : ");
        for(int iCnt = 0;iCnt< iSize;iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        System.out.println("Enter the number : ");
        int No = sobj.nextInt();

        Number obj = new Number();

        boolean bRet = obj.Check(Arr, No);

        if(bRet == true)
        {
            System.out.println("Number is present");
        }
        else
        {
            System.out.println("Number is not present");
        }
    }
}

class Number 
{
    public boolean Check(int Arr[], int iNo)
    {   
        boolean flag = false;

          for(int iCnt = 0;iCnt < Arr.length;iCnt++)
          {
            if(Arr[iCnt] == iNo)
            {
                flag = true;
                break;
            }
          }
          return flag;
    } 
}
