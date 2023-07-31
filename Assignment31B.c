//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Write a program which displays all elements which are prime from singly liner linked list. 
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

void DisplayPrime(PNODE Head)
{
    while(Head != NULL)
    {
        int iCnt = 1;
        int iCount = 0; 

        while((Head->data >= iCnt))
        {
            if((Head->data) % iCnt == 0)
            {
                iCount++;    
            }
            iCnt++;
        }
        if(iCount == 2)
        {
            printf("%d \t",Head->data);
        }
        Head = Head->next;
    }
    
}

int main()
{
    PNODE First = NULL;

    InsertFirst(&First,89);
    InsertFirst(&First,22);
    InsertFirst(&First,41);
    InsertFirst(&First,17);
    InsertFirst(&First,20);
    InsertFirst(&First,11);

    Display(First);
    
    DisplayPrime(First);

    return 0;
}
