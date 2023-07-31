///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// write a program which accept matrix and swap the contents of consecutive rows.
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Assignment47E {
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

        obj.SwapRows(Arr,Rows,Cols);
        
        sobj.close();
    }
}

class Matrix {
    public void SwapRows(int Arr[][],int iRow,int iCol) {
        int Brr[][];
        for(int i = 0;i < iRow; i++)
        {
            Brr = new int[iRow][iCol];
            for(int j = 0; j < iCol; j++)
            {
                if(i % 2 ==0)
                {
                    Brr[i][j] = Arr[i][j];
                    Arr[i][j] = Arr[i+1][j];
                    Arr[i+1][j] = Brr[i][j]; 
                }
            }
        }

        System.out.println("Swapped Row Arrai is : ");
        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                System.out.print(Arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}