///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// write a recursive program which accept number from user and return smallest digit. 
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>
#include<stdlib.h>

int Min(int iNo)
{
    static int iMin = 9;   
    int Digit = 0;

    if (iNo != 0)
    {
        Digit = iNo % 10;
        if(iMin > Digit)
        {
            iMin = Digit;
        }
        iNo = iNo / 10;
        Min(iNo);
    }

    return iMin;
}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter number : ");
    scanf("%d",&iValue);

    iRet = Min(iValue);

    printf("%d",iRet); 

    return 0;
}