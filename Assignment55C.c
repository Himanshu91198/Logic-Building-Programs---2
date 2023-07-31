///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// write a recursive program which accept string from user and count number of characters. 
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>
#include<stdlib.h>

int Strlen(char *str)
{
    static int i = 0;
    static int iCount = 0;
    if(str[i] != 0)
    {   
        iCount++;
        i++;
        Strlen(str);
    }

    return iCount;
}

int main()
{
    char arr[20];
    int iRet = 0;

    printf("Enter string : ");
    scanf("%s",arr);

    iRet = Strlen(arr);

    printf("No. of characters in string are : %d",iRet);

    return 0;
}