//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Write a program which display product of all digits of all element from singly liner linked list. 
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

void DisplayProduct(PNODE Head)
{
    while(Head != NULL)
    {
        int iDigit = 0;
        int iMul = 1;

        while((Head->data) != 0)
        {
            iDigit = (Head->data) % 10; 
            iMul *= iDigit;
            (Head -> data) = (Head->data)/10;
        }
        printf("%d \t",iMul);        
        Head = Head->next;
    }
}


int main()
{
    PNODE First = NULL;

    InsertFirst(&First,41);
    InsertFirst(&First,32);
    InsertFirst(&First,20);
    InsertFirst(&First,11);

    Display(First);

    DisplayProduct(First);
    
    return 0;
}
