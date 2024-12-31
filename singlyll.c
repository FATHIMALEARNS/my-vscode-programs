#include<stdio.h>
#include<stdlib.h>
struct node{
    int data;
    struct node* next;
};
int main()
{
    struct node* head=(struct node*)malloc(sizeof(struct node));
    head->data=45;
    head->next=NULL;

    struct node* current=(struct node*)malloc(sizeof(struct node));
    current->data=90;
    current->next=NULL;
    head->next=current;
    return 0;
}