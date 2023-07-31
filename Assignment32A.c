//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Write a program which reverse each element of singly liner linked list. 
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

void Reverse(PNODE Head)
{
    while(Head != NULL)
    {
        int iDigit = 0;
        int iRev = 0;

        while((Head->data) != 0)
        {
            iDigit = (Head->data) % 10; 
            iRev = (iRev * 10) + iDigit;
            (Head -> data) = (Head->data)/10;
        }
        printf("%d \t",iRev);                   
        Head = Head->next;
    }
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

    Reverse(First);
    
    return 0;
}
