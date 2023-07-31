///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// write a java program which accept two arrays from user and copy the contents of that array into another array and return new array.
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Assignment43E
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of elements : ");
        int Size1 = sobj.nextInt();

        int Arr[] = new int[Size1];

        System.out.println("Enter the elements : ");

        for(int i = 0; i < Arr.length;i++)
        {
            Arr[i] = sobj.nextInt();
        }

        MyArray obj = new MyArray();

        boolean bRet = obj.ChkPallindrome(Arr);

        if(bRet == true)
        {
            System.out.println("Elements are pallindrome");
        }
        else
        {
            System.out.println("Elements are not pallindrome");
        }
        
        sobj.close();
    }
}

class MyArray
{
    public boolean ChkPallindrome(int Arr[])
    {  
        int Brr[] = new int[Arr.length];
        int iCnt = 0;

        for(int i = 0,iNo = 0,iDigit = 0; i < Arr.length; i++)
        {
            while(Arr[i] != 0)
            {
                iDigit = Arr[i] % 10;
                iNo = (iNo * 10) + iDigit;
                Arr[i] = Arr[i] / 10;
            }
            Brr[i] = iNo;
        }

        for(int i = 0;i < Arr.length;i++)
        {
            if(Arr[i] == Brr[i])
            {
                iCnt++;
            }
        }
        if(iCnt == Arr.length)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}