///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// write a program which accept matrix and check whether the matrix is sparse matrix or not.
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Assignment48E
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

        boolean bRet = obj.ChkIdentity(Arr,Rows,Cols);
        
        if(bRet == true)
        {
            System.out.println("It is a Sparse Matrix");
        }
        else
        {
            System.out.println("It is not an Sparse Matrix");
        }

        sobj.close();
    }
}

class Matrix {
    public boolean ChkIdentity(int Arr[][],int iRow,int iCol) {
        int iCnt1 = 0;
        int iCnt2 = 0;
        for(int i = 0;i < iRow;i++)
        {
            for(int j = 0 ;j < iCol; j++)
            {
                if(Arr[i][j] == 0)
                {
                    iCnt1++;
                }
                if(Arr[i][j] != 0)
                {
                    iCnt2++;
                }
            }
        }
        if(iCnt1 > iCnt2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}