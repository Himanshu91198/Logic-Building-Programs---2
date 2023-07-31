///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// write a program which accept file name from user and one count from user and read that number of characters from the starting position. 
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>
#include<stdlib.h>
#include<io.h>
#include<fcntl.h>

int DisplayN(char FName[], int iSize)
{
    int fd = 0;
    int n = 0;
    char Buffer[30];
    int iPos = 0;

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

    n = read(fd,Buffer,iSize);

    write(1,Buffer,n);

    close(fd);

}

int main()
{
    char FileName[30];
    int iRet = 0;
    int iValue = 0;

    printf("Enter file name: ");
    scanf("%s",FileName);

    printf("Enter the number of characters : ");
    scanf("%d",&iValue);

    DisplayN(FileName,iValue);

    return 0;
}