///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// write a java program which accept array of characters from user and replace each capital character with its corresponding small character.
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Assignment44A {
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String str = sobj.nextLine();
        
        char Arr[] = str.toCharArray();

        MyArray obj = new MyArray();

        obj.ArrayReplace(Arr);

        sobj.close();
    }
}

class MyArray
{
    public void ArrayReplace(char Arr[])
    {
        for(int i = 0;i < Arr.length;i++)
        {
            if((Arr[i] >= 'A') && (Arr[i] <= 'Z'))
            {
                Arr[i] = (char)(Arr[i] + 32);
            }
            System.out.print(Arr[i] + " ");
        }
    }
}