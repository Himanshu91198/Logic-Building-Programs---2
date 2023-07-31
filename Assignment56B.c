///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// write a recursive program which accept number from user and return largest digit. 
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>
#include<stdlib.h>

int Max(int iNo)
{
    int Digit = 0;
    static int iMax = 0;

    if(iNo != 0)
    {
        Digit = iNo % 10;
        if(iMax < Digit)
        {
            iMax = Digit;
        }
        iNo = iNo / 10;
        Max(iNo);
    }

    return iMax;
}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter number: ");
    scanf("%d",&iValue);

    iRet = Max(iValue);

    printf("%d",iRet);
    return 0;
}