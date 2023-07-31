///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// write a java program which accept array of characters from user and count number of capital characters.
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Assignment46C {
    public static void main(String Arg[]) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements : ");
        int Size = sobj.nextInt();

        char Arr[] = new char[Size];

        System.out.println("Enter the characters : ");

        Arr = sobj.next().toCharArray();

        MyArray obj = new MyArray();

        int iRet = obj.ArrayCapital(Arr);

        System.out.println("Number of capital characters are : "+iRet);
        sobj.close();
    }
}

class MyArray {
    public int ArrayCapital(char Arr[]) {
        int iCnt = 0;
        for (int i = 0; i < Arr.length; i++) {
            if(Arr[i] >= 'A' && Arr[i] <= 'Z')
            {
                iCnt++;
            }
        }
        return iCnt;
    }
}