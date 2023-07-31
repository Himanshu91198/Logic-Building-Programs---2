///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// write a java program which accept array of characters from user and accept one character. return difference between frequency of capital and frequency of small characters.
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Assignment44A {
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

        obj.Pattern(Arr);

        sobj.close();
    }
}

class MyArray {
    public void Pattern(int Arr[]) {

        for(int i = 0;i < Arr.length;i++)
        {
            if(Arr[i] % 2 == 0)
            {
                for(int j = 0;j < Arr[i];j++)
                {
                    System.out.print("*" + " ");
                }
                System.out.println();
            }
        }

    }
}