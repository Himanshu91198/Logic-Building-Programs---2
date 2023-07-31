//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Write a program which returns Smallest element from singly liner linked list. 
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>
#include<stdlib.h>

typedef struct node
{
    int data;
    struct node *next;
}NODE,*PNODE,**PPNODE;

void InsertFirst(PPNODE Head, int no)
{
    PNODE newn = NULL;

    newn = (PNODE)malloc(sizeof(NODE));

    newn -> data = no;
    newn -> next = NULL;

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
        printf("| %d | ->",Head->data);
        Head = Head-> next;
    }
    printf("NULL\n");
}    

int Minimum(PNODE Head)
{
    int iMin = Head->data;

    while(Head != NULL)
    {
        if((Head->data) < iMin)
        {
            iMin = Head->data;
        }
        Head = Head -> next;        
    }
    return iMin;
}

int main()
{
    PNODE First = NULL;
    int iRet = 0;

    InsertFirst(&First,640);
    InsertFirst(&First,240);
    InsertFirst(&First,20);
    InsertFirst(&First,230);
    InsertFirst(&First,110);

    Display(First);
    
    iRet = Minimum(First);

    printf("%d",iRet);

    return 0;
}
