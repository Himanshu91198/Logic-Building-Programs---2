///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// write application which accept file name from user and create that file. 
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>
#include<stdlib.h>
#include<fcntl.h>

int main()
{
    int fd = 0;
    char FileName[20];

    printf("Enter file name : ");
    scanf("%s",FileName);

    fd = creat(FileName,0777);

    if(fd == -1)
    {
        printf("Unable to create file");
        return -1;
    }
    else
    {
        printf("File is successfully created with fd %d",fd);
    }

    close(fd);

    return 0;
}