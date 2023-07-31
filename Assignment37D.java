///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Accept string from user and reverse the contents of that string by toggling the case.
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Assignment37D
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = sobj.nextLine();

        StringDemo obj = new StringDemo();

        String sRet = obj.StrRevTogX(str);

        System.out.println("Reverse and toggled string is : "+sRet);

        sobj.close();
    }
}

class StringDemo
{
    public String StrRevTogX(String str)
    {
        char Arr[] = str.toCharArray();

        int iStart = 0;
        int iEnd = Arr.length-1;
        
        char cTemp = ' ';

        while(iStart < iEnd)
        {
            if((Arr[iStart] >= 'a' && Arr[iStart] <= 'z') && (Arr[iEnd] >= 'a' && Arr[iEnd] <= 'z'))
            {
                cTemp = (char)(Arr[iStart] - 32);
                Arr[iStart] = (char)(Arr[iEnd] - 32);
                Arr[iEnd] = cTemp;
            }
            else if((Arr[iStart] >= 'A' && Arr[iStart] <= 'Z') && (Arr[iEnd] >= 'A' && Arr[iEnd] <= 'Z'))
            {
                cTemp = (char)(Arr[iStart] + 32);
                Arr[iStart] = (char)(Arr[iEnd] + 32);
                Arr[iEnd] = cTemp;
            }
            else if((Arr[iStart] >= 'a' && Arr[iStart] <= 'z') && (Arr[iEnd] >= 'A' && Arr[iEnd] <= 'Z'))
            {
                cTemp = (char)(Arr[iStart] - 32);
                Arr[iStart] = (char)(Arr[iEnd] + 32);
                Arr[iEnd] = cTemp;
            }
            else if((Arr[iStart] >= 'A' && Arr[iStart] <= 'Z') && (Arr[iEnd] >= 'a' && Arr[iEnd] <= 'z'))
            {
                cTemp = (char)(Arr[iStart] + 32);
                Arr[iStart] = (char)(Arr[iEnd] - 32);
                Arr[iEnd] = cTemp;
            }  
            iStart++;
            iEnd--;  
        }
        return new String(Arr);
    }
}