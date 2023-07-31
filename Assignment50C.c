///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// write application which accept file name from user and read all data from that file and display contents on screen. 
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>
#include<stdlib.h>
#include<fcntl.h>

int main()
{
    int fd = 0;
    char FileName[20];
    int iRet = 0;
    char Arr[50] = {'\0'};

    printf("Enter file name : ");
    scanf("%s",FileName);

    fd = open(FileName,O_RDONLY);

    if(fd == -1)
    {
        printf("Unable to open file");
        return -1;
    }
    else
    {
        printf("File is successfully opened with fd %d",fd);
    }

    iRet = read(fd,Arr,50);

    printf("%d byte gets successfully fetched from the file\n",iRet);

    printf("Data from the file is : ");

    write(1,Arr,iRet);

    close(fd);

    return 0;
}