///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// write a program which accept matrix and reverse the contents of each row.
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Assignment48B
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

        obj.ReverseRow(Arr,Rows,Cols);
        
        sobj.close();
    }
}

class Matrix {
    public void ReverseRow(int Arr[][],int iRow,int iCol) {
        for(int i = 0;i < iRow;i++)
        {   
            for(int j = 0,itemp = 0;j<iCol/2;j++)
            {   
                itemp = Arr[i][j];
                Arr[i][j] = Arr[i][iCol-j-1];
                Arr[i][iCol-j-1] = itemp;
            }
        }

        for(int i = 0;i < iRow;i++)
        {
            for(int j = 0;j<iCol;j++)
            {
                System.out.print(Arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}