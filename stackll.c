#include<stdio.h>
#include<stdlib.h>
#include<string.h>
int push(int item);
int pop();
int peek();
void display();
    struct node{
        int data;
        struct node* next;
    };
    struct node* top=NULL;
    struct node* ptr=NULL;

    int main(){
        while(1){
            int choice,item;
            printf("1.push\n2.pop\n3.display\n4.peek\n5.exit\n");
            printf("enter choice:");
            scanf("%d",&choice);
            switch(choice){
                case 1:
                printf("Enter element to insert");
                scanf("%d",&item);
                push(item);
               // printf("top element is %d",push(item));
                break;

                case 2:
                pop();
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
                printf("Invalid choice!");
                break;
            }
        }
    }

int push(int item){
    struct node* newnode=(struct node*)malloc(sizeof(struct node));
    newnode->data=item;
    newnode->next=top;
    top=newnode;
    return top->data;
}

int pop(){
    ptr=top;
    if(ptr==NULL){
        printf("empty list");
    }
    else{
        ptr=ptr->next;
        top=ptr;
        printf("popped element is %d",ptr->data);
        return ptr->data;
        free(top);
    }
}

int peek(){
    ptr=top;
    if(ptr==NULL){
        printf("empty list");
    }
    else{
        printf("top element is %d",ptr->data);
    }
}

void display(){
    struct node* ptr=top;
    if(ptr==NULL){
        printf("Empty list");
        return;
    }
    while(ptr!=NULL){
        printf("%d",ptr->data);
        ptr=ptr->next;
        printf("\n");
    }
    
}