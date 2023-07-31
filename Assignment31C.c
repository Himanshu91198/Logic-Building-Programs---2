//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Write a program which returns addition of all even element from singly liner linked list. 
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>
#include<stdlib.h>

typedef struct node
{
    int data;
    struct node *next;
}NODE,*PNODE,**PPNODE;

 void InsertFirst(PPNODE Head,int no)
{
    PNODE newn = NULL;

    newn = (PNODE)malloc(sizeof(NODE));

    newn->data = no;
    newn->next = NULL;

    if(*Head == NULL)
    {
        *Head = newn;
    }
    else
    {
        newn->next = *Head;
        *Head = newn;
    }
}

void Display(PNODE Head)
{
    while(Head != NULL)
    {
        printf("| %d | -> ",Head->data);
        Head = Head->next;
    }
    printf("NULL \n");
}

int AdditionEven(PNODE Head)
{
    int iSum = 0;

    while(Head != NULL)
    {
        if((Head->data % 2 == 0))
        {
            iSum += (Head->data);
        }
        Head = Head->next;
    }
    return iSum;
}


int main()
{
    PNODE First = NULL;
    int iRet = 0;

    InsertFirst(&First,41);
    InsertFirst(&First,32);
    InsertFirst(&First,20);
    InsertFirst(&First,11);

    Display(First);

    iRet = AdditionEven(First);

    printf("%d",iRet);
    
    return 0;
}
