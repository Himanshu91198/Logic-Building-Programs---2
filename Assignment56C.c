///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// write a recursive program which accept string from user and count number of small characters. 
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>
#include<stdlib.h>

int Small(char *str)
{
    static int iCount = 0;
    static int i = 0;

    if(str[i] != 0)
    {
        if(str[i] >= 'a' && str[i] <= 'z')
        {
            iCount++;
        }
        i++;
        Small(str);
    }

    return iCount;
}

int main()
{
    char arr[20];
    int iRet = 0;

    printf("Enter string : ");
    scanf("%s",arr);

    iRet = Small(arr);

    printf("%d",iRet); 

    return 0;
}