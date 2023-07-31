///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// write a recursive program which accept string from user and count white spaces. 
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>
#include<stdlib.h>

int WhiteSpace(char str[])
{
    static int iCount = 0;
    static int i = 0;

    if(str[i] != 0)
    {
        if(str[i] == ' ')
        {
            iCount++;
        }
        i++;
        WhiteSpace(str);
    }

    return iCount;
}

int main()
{
    char arr[20];
    int iRet = 0;

    printf("Enter string : ");
    scanf("%[^\n]s",arr);

    iRet = WhiteSpace(arr);

    printf("%d",iRet);

    return 0;
}