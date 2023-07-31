///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// write a java program which accept array from user and replace each member with summation of its digit.
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Assignment46B {
    public static void main(String Arg[]) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements : ");
        int Size = sobj.nextInt();

        int Arr[] = new int[Size];

        System.out.println("Enter the elements : ");

        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = sobj.nextInt();
        }

        MyArray obj = new MyArray();

        obj.SumArray(Arr);

        sobj.close();
    }
}

class MyArray {
    public void SumArray(int Arr[]) {
        for (int i = 0; i < Arr.length; i++) {
            int iDigit = 0;
            int iSum = 0;
            while (Arr[i] != 0) {
                iDigit = Arr[i] % 10;
                iSum += iDigit;
                Arr[i] = Arr[i] / 10;
            }
            Arr[i] = iSum;
        }

        for(int i = 0;i < Arr.length;i++)
        {
            System.out.print(Arr[i] + " ");
        }
    }
}