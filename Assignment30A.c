//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Write a program which search first occurence of particular element from singly liner linked list. Function should return
// position at which element is found. 
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>
#include<stdlib.h>

typedef struct Node
{
    int data;
    struct Node *next;
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
        Head = Head -> next;
    }
    printf("NULL\n");
}

int SearchFirstOcc(PNODE Head,int no)
{
    int iCnt = 0;

    while(Head != NULL)
    {
        iCnt++;
        
        if(Head->data == no)
        { 
            break;
        }
        Head = Head->next;
    }
    return iCnt;
}

int main()
{
    PNODE First = NULL;

    int iRet = 0;

    InsertFirst(&First,70);
    InsertFirst(&First,30);
    InsertFirst(&First,50);
    InsertFirst(&First,40);
    InsertFirst(&First,30);
    InsertFirst(&First,20);
    InsertFirst(&First,10);

    Display(First);
    
    iRet = SearchFirstOcc(First,30);

    printf("%d",iRet);

    return 0;

}