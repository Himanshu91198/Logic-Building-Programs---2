///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// write a program which accept matrix and return largest numebr from both the diagonals.
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Assignment47C {
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

        int iRet = obj.MaxDiagonal(Arr,Rows,Cols);

        System.out.println("Maximum element in the diagonal is : "+iRet);
        
        sobj.close();
    }
}

class Matrix {
    public int MaxDiagonal(int Arr[][],int iRow,int iCol) {
        int iMax1 = Arr[0][0];
        int iMax2 = Arr[Arr.length - 1][0];
        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                if(i == j)
                {
                    if(iMax1 < Arr[i][j])
                    {
                        iMax1 = Arr[i][j];
                    }
                }
                if((i+j) == (Arr.length - 1))
                {
                    if(iMax2 < Arr[i][j])
                    {
                        iMax2 = Arr[i][j];
                    }
                }
            }
        }
        
        if(iMax1 > iMax2)
        {
            return iMax1;
        }
        else
        {
            return iMax2;
        }
    }
}