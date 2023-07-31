///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// write a java program which accpet numeber of rows and number of columns from user and display below pattern.
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Assignment39B
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of rows : ");
        int rows = sobj.nextInt();

        System.out.println("Enter number of columns : ");
        int cols = sobj.nextInt();

        pattern obj = new pattern();

        obj.Pattern(rows, cols);

    }
}

class pattern
{
    public void Pattern(int iRow,int iCol)
    {  
        for(int i = 0; i < iRow ; i++)
        {    
            for(int j = 1; j <= iCol ; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}