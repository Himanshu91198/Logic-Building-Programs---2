///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// write a program which accept matrix and one number from user and return frequency of that number.
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Assignment47B {
    public static void main(String Arg[]) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of rows : ");
        int Rows = sobj.nextInt();

        System.out.println("Enter the numerb of columns : ");
        int Cols = sobj.nextInt();

        int Arr[][] = new int[Rows][Cols];

        System.out.println("Enter the elements: ");
        for(int i = 0; i < Rows; i++)
        {
            for(int j = 0; j < Cols; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }

        System.out.println("Enter a number: ");
        int No = sobj.nextInt();

        Matrix obj = new Matrix();

        int iRet = obj.frequency(Arr,Rows,Cols,No);

        System.out.println("Frequency of that element is : "+iRet);
        
        sobj.close();
    }
}

class Matrix {
    public int frequency(int Arr[][],int iRow,int iCol,int iNo) {
        int iCnt = 0;
        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                if(Arr[i][j] == iNo)
                {
                    iCnt++;
                }
            }
        }
        return iCnt;
    }
}