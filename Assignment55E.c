///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// write a recursive program which accept number from user and return its product of digits. 
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>
#include<stdlib.h>

int Mult(int iNo)
{
    int Digit = 0;
    static int Product = 1;
    if(iNo != 0)
    {
        Digit = iNo % 10;
        Product *= Digit;
        iNo = iNo / 10;
        Mult(iNo);
    }

    return Product;
}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter number : ");
    scanf("%d",&iValue);

    iRet = Mult(iValue);

    printf("%d",iRet);

    return 0;
}