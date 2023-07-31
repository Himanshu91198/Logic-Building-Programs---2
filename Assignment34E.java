///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Write a java program which accepts N numbers from user and display all such elements which are multiples of 11.
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Assignment34E
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
        System.out.println("Numbers that are multiples of 11 are: ");
        for(int iCnt = 0;iCnt < Arr.length;iCnt++)
        {
            if(((Arr[iCnt] % 11) == 0))
            {
                System.out.println(Arr[iCnt]);
            }
        }
    } 
}
