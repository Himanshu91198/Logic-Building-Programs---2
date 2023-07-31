///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// write a java program which accept array from user and reverse each number of that array.
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Assignment46A
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements : ");
        int Size = sobj.nextInt();

        int Arr[] = new int[Size];

        System.out.println("Enter the elements : ");

        for(int i = 0 ;i < Arr.length;i++)
        {
            Arr[i] = sobj.nextInt();
        }

        MyArray obj = new MyArray();

        obj.ReverseArray(Arr);

        sobj.close();
    }
}

class MyArray
{
    public void ReverseArray(int Arr[])
    {

        for(int i = 0;i < Arr.length;i++)
        {
            int iDigit = 0;
            int iNo = 0;
            while(Arr[i] != 0)
            {
                iDigit = Arr[i] % 10;
                iNo = (iNo * 10) + iDigit;
                Arr[i] = Arr[i] / 10;
            }
            Arr[i] = iNo;
        }

        for(int i = 0;i < Arr.length;i++)
        {
            System.out.print(Arr[i] + " ");
        }
    }
}