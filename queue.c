#include<stdio.h>
int MAX=5;
int queue[5],front=-1,rear=-1;
int isFull();
int isEmpty();
int enqueue(int queue[],int MAX,int item);
int dequeue();
int display(int queue[],int MAX);

int main()
{
   int ch,item;
   printf("enter max size of array:");
   scanf("%d",&MAX);
   while(1)
   {
   printf("\n1.enqueue\n2.dequeue\n3.display\n4.exit\n");
   printf("enter your choice");
   scanf("%d",&ch);
    switch(ch)
    {
        case 1:
        printf("Enter item to insert");
        scanf("%d",&item);
        enqueue(queue,MAX,item);
        break;

        case 2:
        dequeue();
        break;

        case 3:
        display(queue,MAX);
        break;

        case 4:
        return 0;
        break;

        default:
        printf("invalid choice");
    }
}
}

int isFull()
    {
    if(MAX-1==rear){
        return 1;
    }
    else{
        return 0;
    }
    }

int isEmpty()
    {
        if(front==-1||front>rear){
            return 1;
        }
        else{
            return 0;
        }
    }

int enqueue(int queue[],int MAX,int item){
    if(!isFull()){
        if(front==-1){
            front=0;
        }
        else{
            rear++;
            queue[rear]=item;
        }
    }
    else{
        printf("enqueue not possible since overflow");
    }
}

int dequeue(){
    int item;
    if(!isEmpty()){
        item=queue[front];
        front++;
    }
    else{
        printf("deletion not possible since underflow");
    }
}

int display(int queue[],int MAX){
    if(front==-1&&rear==-1||front>rear){
        printf("Empty");

    }
    else{
        for(int i=front;i<=rear;i++){
            printf("%d",queue[i]);
        }
    }
}