///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// write a recursive program which accept number from user and return its reverse number. 
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>
#include<stdlib.h>

int Reverse(int iNo)
{
    static int RevNo = 0;
    int Digit = 0;
    if(iNo != 0)
    {
        Digit = iNo % 10;
        RevNo = (RevNo * 10) + Digit;
        iNo = iNo / 10;
        Reverse(iNo);
    }

    return RevNo;
}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter number : ");
    scanf("%d",&iValue);

    iRet = Reverse(iValue);

    printf("%d",iRet); 

    return 0;
}