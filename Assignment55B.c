///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// write a recursive program which accept number from user and return summation of its digits. 
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>
#include<stdlib.h>

int Sum(int iNo)
{   
    int Digit = 0;
    static int iSum = 0; 
    if(iNo != 0)
    {
        Digit = iNo % 10;
        iSum = iSum + Digit;
        iNo = iNo/10;
        Sum(iNo);
    }

    return iSum;
}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter number : ");
    scanf("%d",&iValue);

    iRet = Sum(iValue);

    printf("Summation of its digits is : %d",iRet);

    return 0;
}