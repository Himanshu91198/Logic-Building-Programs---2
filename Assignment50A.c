///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// write application which accept file name from user and open that file in read mode. 
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

    fd = open(FileName,O_RDONLY);

    if(fd == -1)
    {
        printf("Unable to open file");
        return -1;
    }
    else
    {
        printf("File is successfully opened with fd %d\n",fd);
    }

    close(fd);

    return 0;
}