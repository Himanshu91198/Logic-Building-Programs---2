//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Write a program which displays additions of digits of elementr from singly liner linked list. 
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

void SumDigit(PNODE Head)
{
    while(Head != NULL)
    {
        int iSum = 0;
        int iDigit = 0;

        while((Head->data) != 0)
        {
            iDigit = (Head->data) % 10;
            iSum += iDigit; 
            (Head -> data) = (Head->data)/10; 
        }
        printf("%d \t",iSum);                   
        Head = Head->next;
    }
}


int main()
{
    PNODE First = NULL;

    InsertFirst(&First,640);
    InsertFirst(&First,240);
    InsertFirst(&First,20);
    InsertFirst(&First,230);
    InsertFirst(&First,110);

    Display(First);

    SumDigit(First);
    
    return 0;
}
