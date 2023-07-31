///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// write a java program which accept number of rows and number of columns from user and display below pattern.
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Assignment45E
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of Rows : ");
        int Rows = sobj.nextInt();

        System.out.println("Enter the number of Columns : ");
        int Cols = sobj.nextInt();

        pattern obj = new pattern();

        obj.Pattern(Rows,Cols);

        sobj.close();
    }
}

class pattern
{
    public void Pattern(int Rows,int Cols)
    {
        for(int i = 1;i<=Rows;i++)
        {
            for(int j = 1;j <= Cols;j++)
            {
                if(j == 1)
                {
                    System.out.print(j + " ");
                }
                else if(i == 1)
                {
                   System.out.print(j + " ");
                }
                else if(j == Cols)
                {
                    System.out.print(j + " ");
                }
                else if(i == Rows)
                {
                    System.out.print(j + " ");
                }
                else if(i == j)
                {
                    System.out.print(j + " ");
                }
                else
                {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }
}