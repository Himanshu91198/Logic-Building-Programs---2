//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Write a program which returns second maximum element from singly liner linked list. 
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

int SecMaximum(PNODE Head)
{
    int FirstMax = 0;
    int SecondMax = 0;

    while(Head != NULL)
    {
        if((Head -> data) > FirstMax)
        {
            SecondMax = FirstMax;
            FirstMax = (Head->data);
        }
        else if(((Head->data) > SecondMax) && ((Head->data) < FirstMax))
        {
            SecondMax = Head->data;
        }
        Head = Head->next;
    }
    return SecondMax;
}


int main()
{
    PNODE First = NULL;
    int iRet = 0;

    InsertFirst(&First,240);
    InsertFirst(&First,320);
    InsertFirst(&First,230);
    InsertFirst(&First,110);

    Display(First);

    iRet = SecMaximum(First);

    printf("%d",iRet);
    
    return 0;
}
