///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// write a program which accept matrix and display addition of elements from each column.
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Assignment47D {
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

        obj.AddColumn(Arr,Rows,Cols);
        
        sobj.close();
    }
}

class Matrix {
    public void AddColumn(int Arr[][],int iRow,int iCol) {
        for(int i = 0; i < iRow;i++)
        {
            int iSum = 0;
            for(int j = 0;j < iCol;j++)
            {
                iSum += Arr[j][i];
            }
            System.out.print(iSum + " ");
        }
    }
}