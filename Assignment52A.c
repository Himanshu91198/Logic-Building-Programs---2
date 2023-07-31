///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// write a program which accept file name from user and count number of capital characters from that file. 
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>
#include<stdlib.h>
#include<io.h>
#include<fcntl.h>

int CountCapital(char FName[])
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

    for(int i = 0;i < n;i++)
    {
        if(Buffer[i] >= 'A' && Buffer[i] <= 'Z')
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

    printf("Enter file name: ");
    scanf("%s",FileName);

    iRet = CountCapital(FileName);

    printf("No. of Capital characters are %d",iRet);

    return 0;
}