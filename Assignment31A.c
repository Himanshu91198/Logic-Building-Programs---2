//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Write a program which displays all elements which are perfect from singly liner linked list. 
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

void DisplayPerfect(PNODE Head)
{
    while(Head != NULL)
    {
        int iCnt = 1;
        int iSum = 0;

        while(iCnt < (Head->data))
        {
            if(((Head->data) % iCnt) == 0)
            {
                iSum += iCnt;        
            }
            iCnt++;
        }
            if((Head->data) == iSum)
            {
                printf(" | %d | is a perfect number \t",Head->data);
            }
        Head = Head->next;       
    }
    return;
}

int main()
{
    PNODE First = NULL;

    InsertFirst(&First,89);
    InsertFirst(&First,6);
    InsertFirst(&First,41);
    InsertFirst(&First,17);
    InsertFirst(&First,28);
    InsertFirst(&First,11);

    Display(First);
    
    DisplayPerfect(First);

    return 0;
}
