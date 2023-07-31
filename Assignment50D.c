///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// write application which accept file name from user and display size of file. 
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>
#include<stdlib.h>
#include<fcntl.h>

int main()
{
    int fd = 0;
    char FileName[50];
    int iRet = 0;
    char Arr[50] = {'\0'};

    printf("Enter the file name : ");
    scanf("%[^\n]s",FileName);

    fd = open(FileName,O_RDWR);

    if(fd == -1)
    {
        printf("File not opened\n");
    }
    else
    {
        printf("File successfully opened");
        return -1;
    }

    iRet = read(fd,Arr,50);

    printf("Size of the file is %d",iRet);

    close(fd);

    return 0;
}