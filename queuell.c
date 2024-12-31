#include<stdio.h>
#include<stdlib.h>
struct node{
    int data;
    struct node* next;
};
int display();
int enqueue(int item);
int dequeue();
int peek();

struct node* front=NULL;
struct node* rear=NULL;
int main(){
    while(1){
        int choice,item;
        printf("1.enqueue\n2.dequeue\n3.dispaly\n4.peek\n5.exit\n");
        printf("Enter choice");
        scanf("%d",&choice);

        switch(choice){
            case 1:
            printf("enter element to insert");
            scanf("%d",&item);
            enqueue(item);
            break;

            case 2:
            dequeue();
            break;

            case 3:
            display();
            break;

            case 4:
            peek();
            
            break;

            case 5:
            return 0;
            break;

            default:
            printf("Invalid choice");
            break;
        }
    }
}

int display(){
    struct node* temp=front;
    if(temp==NULL){
        printf("queue is empty");
        return 0;
    }
    while(temp!=NULL){
        printf("%d",temp->data);
        temp=temp->next;
    }
    printf("\n");
}

int enqueue(int item){
     struct node* newnode=(struct node*)malloc(sizeof(struct node));
     newnode->data=item;
     newnode->next=NULL;
    
     if(rear==NULL&&front==NULL){
        front=rear=newnode;
       
     }
     else{
        rear->next=newnode;
        rear=newnode;
     }
     printf("element inserted");
}

int dequeue(){
    struct node* temp;
    if(front==NULL){
        printf("queue empty");
        return 0;
    }
    else{
        temp=front;
        front=front->next;
        if(front==NULL){
            rear=NULL;
        }
        free(temp);
    }
    printf("Element deleted from front");
}

int peek(){
    if(front==NULL&&rear==NULL){
        printf("queue is empty");
    }
    else{
        printf("%d",front->data);
        //return front->data;
    }
}