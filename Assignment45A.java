///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// write a java program which accept number of rows and number of columns from user and display below pattern.
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Assignment45A
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
        for(int i = Rows-1;i>=0;i--)
        {
            for(int j = 0;j < Cols;j++)
            {
                if(i > j)
                {
                    System.out.print("*" + " ");
                }
                else if(i == j)
                {
                    System.out.print("#" + " ");
                }
                else
                {
                    System.out.print("*" + " ");
                }
            }
            System.out.println();
        }
    }
}