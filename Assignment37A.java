///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Write a java program which accepts two strings from user and concat N characters of second string after first string. Value of N should be accepted from user.
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Assignment37A
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter First String : ");
        String First = sobj.nextLine();

        System.out.println("Enter Second String : ");
        String Second = sobj.nextLine();
        
        System.out.println("Enter the number : ");
        int No = sobj.nextInt();

        StringDemo obj = new StringDemo();

        String Sret = obj.StrNCatX(First, Second, No);

        System.out.println("Concated string is : "+Sret);

        sobj.close();
    }
}

class StringDemo
{
    public String StrNCatX(String src,String dest,int iCnt)
    {
        char Brr[] = dest.toCharArray();

        src += " ";
        if(iCnt >= Brr.length)
        {
        for(int i = 0;i < Brr.length;i++)
            {   
                src  += Brr[i];
            }    
        }
        else
        {
            for(int i = 0;i < iCnt;i++)
            {   
                src  += Brr[i];
            }
        }
        return src;
    }
}