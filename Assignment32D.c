//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Write a program which display smallest digits of all element from singly liner linked list. 
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

void DisplaySmall(PNODE Head)
{
    while(Head != NULL)
    {
        int iDigit = 0;
        int iMin = 9;

        while((Head->data) != 0)
        {
            iDigit = (Head->data) % 10;
            if(iDigit < iMin)
            {
                iMin = iDigit;
            }
            (Head -> data) = (Head->data)/10;
        }
        printf("%d \t",iMin);
               
        Head = Head->next;
    }
}


int main()
{
    PNODE First = NULL;

    InsertFirst(&First,415);
    InsertFirst(&First,532);
    InsertFirst(&First,250);
    InsertFirst(&First,11);

    Display(First);

    DisplaySmall(First);
    
    return 0;
}
