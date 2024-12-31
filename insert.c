
#include <stdio.h>
#include <string.h>
#include <stdlib.h>

struct node {
int data;
struct node *next;
};
struct node *head = NULL;
struct node *ptr=NULL;
struct node *ptrprevnode;
void searchnode(struct node *ptr,int key);
void insertatbegin(int data);
void printList();
void insertlast(struct node *ptr,int item);
void deleteatbegin();
void deletelast();

void printList(){
struct node *ptr = head;
if(ptr==NULL)
{
printf("List empty");
}
printf("\n");

//start from the beginning
while(ptr != NULL) {
printf("%d",ptr->data);
ptr = ptr->next;

}
printf("\n");

}

void searchnode(struct node *ptr,int key)
{
int flag=0;
ptr=head;
while(flag==0&&ptr!=NULL)
{
if(ptr->data==key)
{
flag=1;
break;
}
ptr=ptr->next;
}
if(flag==0)
{
printf("no element");
}
else
{ int item;
struct node *newnode = (struct node*) malloc(sizeof(struct node));
printf("enter the element to insert");
scanf("%d",&item);
newnode->data = item;
newnode->next = ptr->next;

ptr->next = newnode;

}
}

void insertatbegin(int data){

//create a link
struct node *newnode = (struct node*) malloc(sizeof(struct node));
newnode->data = data;

// point it to old first node
newnode->next = head;

//point first to new first node
head = newnode;
}

void insertlast(struct node *ptr,int item)
{ ptr=head;
struct node *newnode = (struct node*) malloc(sizeof(struct node));
if(ptr==NULL)
{

newnode->data = item;
head=newnode;
ptr=head;
ptr->next=NULL;
}

else
{
while(ptr->next!=NULL)
{
ptr=ptr->next;
}
newnode->data = item;
newnode->next=NULL;
ptr->next=newnode;
}
}

//deletion
void deleteatbegin()
{
ptr=head;
if(ptr==NULL)
{
printf("Empty list");
}
else
{
ptr=ptr->next;
head=ptr;
}
}
void deletelast()
{

ptr=head;
if(ptr==NULL)

{
printf("empty list");

}
else if(ptr->next==NULL)
{
head=NULL;
}
else
{
while(ptr->next!=NULL)
{
ptrprevnode=ptr;
ptr=ptr->next;
}
ptrprevnode->next=NULL;

}
}

void main(){
while(1)
{
int ch,item;
printf("1.insert at first\n2.display\n3.insert after\n4.insert last\n5.Deleteatbegin\n6.Deletelast\n");
printf("enter the choice");
scanf("%d",&ch);
switch(ch)

{
case 1:
printf("enter the element to insert");
scanf("%d",&item);
insertatbegin(item);
break;
case 2:
printf("Linked List: ");
printList();
break;
case 3:

printf("insert after a node search for it");
int key;
printf("enter the keynode");
scanf("%d",&key);
//printf(&quot;enter the element to insert&quot;);
// scanf(&quot;%d&quot;,&amp;item);

searchnode(ptr,key);

break;
case 4:
printf("insert last");
int item;
printf("enter the element to insert");
scanf("%d",&item);
insertlast(ptr,item);
break;
case 5:
deleteatbegin();

break;
case 6:
deletelast();
break;

}
}


// print list

}