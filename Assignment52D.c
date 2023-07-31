///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// write a program which accept file name from user and one character from user and count number of occurences of that character from that file. 
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>
#include<stdlib.h>
#include<io.h>
#include<fcntl.h>

int CountChar(char FName[], char Ch)
{
    int fd = 0;
    int n = 0;
    char Buffer[30];
    int iCount = 0;

    fd = open(FName,O_RDONLY);

    if(fd == -1)
    {
        printf("Unable to open the file\n");
        return -1;
    }
    else
    {
        printf("File is successfully opened\n");
    }

    n = read(fd,Buffer,30);

    printf("No. of bytes read : %d\n",n);

    for(int i = 0;i < n;i++)
    {
        if(Buffer[i] == Ch)
        {
            iCount++;
        }
    }

    close(fd);

    return iCount;
}

int main()
{
    char FileName[30];
    int iRet = 0;
    char cValue;

    printf("Enter file name: \n");
    scanf("%s",FileName);

    printf("Enter character that you want to search : \n");
    scanf(" %c",&cValue);

    iRet = CountChar(FileName,cValue);

    printf("Frequecy is %d",iRet);

    return 0;
}