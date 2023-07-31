///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// write a program which accept matrix and display transpose of the matrix.
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Assignment48A
 {
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

        obj.Transpose(Arr,Rows,Cols);
        
        sobj.close();
    }
}

class Matrix {
    public void Transpose(int Arr[][],int iRow,int iCol) {
        int Transpose[][];
        for(int i = 0; i < iRow; i++)
        {   
            Transpose = new int[iRow][iCol];
            for(int j = 0; j < iCol; j++)
            {
                Transpose[i][j] = Arr[j][i];
                System.out.print(Transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}