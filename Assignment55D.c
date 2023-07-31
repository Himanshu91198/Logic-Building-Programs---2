///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// write a recursive program which accept number from user and return ist factorial. 
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>
#include<stdlib.h>

int Fact(int iNo)
{
    static int Factorial = 1; 
    if(iNo >= 1)
    {
        Factorial *= iNo;
        iNo--;
        Fact(iNo);
    }

    return Factorial;
}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter number : ");
    scanf("%d",&iValue);

    iRet = Fact(iValue);

    printf("%d",iRet);

    return 0;
}