///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// write a program which accept matrix from user adn return addition of diagonal elements.
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Assignment47A {
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

        Matrix obj = new Matrix();

        int iRet = obj.AddDiagonal(Arr,Rows,Cols);

        System.out.println("Addition of diagonal elements is : "+iRet);

        sobj.close();
    }
}

class Matrix {
    public int AddDiagonal(int Arr[][],int iRow,int iCol) {
        int iSum = 0;
        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                if(i == j)
                {
                    iSum += Arr[i][j];
                }
            }
        }
        return iSum;
    }
}