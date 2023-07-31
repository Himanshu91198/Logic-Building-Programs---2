///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// write a program which accept matrix and check whether the matrix is identity matrix or not.
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Assignment48D
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
            System.out.println("It is a Identity Matrix");
        }
        else
        {
            System.out.println("It is not an Identity Matrix");
        }

        sobj.close();
    }
}

class Matrix {
    public boolean ChkIdentity(int Arr[][],int iRow,int iCol) {
        boolean flag = true;
        for(int i = 0;i < iRow;i++)
        {
            for(int j = 0 ;j < iCol; j++)
            {
                if(i==j && Arr[i][j] != 1)
                {
                    flag = false;
                    break;
                }
                if(i!=j && Arr[i][j] != 0)
                {
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }
}