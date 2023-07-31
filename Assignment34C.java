///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Write a java program which accepts N numbers from user and display all such elements which are even and divisible by 5.
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Assignment34C
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int iSize = sobj.nextInt();
        
        int Arr[] = new int[iSize];
        
        System.out.println("Enter the elements: ");
        for(int iCnt = 0;iCnt < iSize;iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
        
        ArrayDemo obj = new ArrayDemo();
        
        obj.Display(Arr);
    }
}

class ArrayDemo
{
    public void Display(int Arr[])
    {
        System.out.println("Numbers that are divisible by 2 and 5  are: ");
        for(int iCnt = 0;iCnt < Arr.length;iCnt++)
        {
            if(((Arr[iCnt] % 2) == 0) && ((Arr[iCnt] % 5) == 0))
            {
                System.out.println(Arr[iCnt]);
            }
        }
    } 
}
