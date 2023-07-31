///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// write application which accept file name from user and one string from user. write that string at the end of file. 
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>
#include<stdlib.h>
#include<fcntl.h>
#include<string.h>

int main()
{
    int fd = 0;
    char FileName[20];
    char Data[30];
    int iRet = 0;
    char Arr[20];

    printf("Enter file name that you want to open : ");
    scanf("%s",FileName);

    fd = open(FileName,O_WRONLY | O_APPEND);

    if(fd == -1)
    {
        printf("Unable to open the file\n");
        return -1;
    }
    else
    {
        printf("File successfully opened\n");
    }
    
    printf("Enter string : \n");
    scanf("%[^\n]s",Arr);

    printf("String is : %s",Arr);

    write(fd,Arr,iRet);

    close(fd);

    return 0;
}