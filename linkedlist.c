#include<stdio.h>
#include<stdlib.h>
struct node{
    int data;
    struct node* link;
};
int main()
{
    struct node* head=(struct node*)malloc(sizeof(struct node));
    head->data=30;
    head->link=NULL;

    struct node* ptr=(struct node*)malloc(sizeof(struct node));
    ptr->data=40;
    ptr->link=NULL;

    head->link=ptr;
    
}