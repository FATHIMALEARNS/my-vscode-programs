#include<stdio.h>
#include<stdlib.h>

#define MAX 100

typedef struct Queue{
    int items[MAX];
    int front;
    int rear;
} Queue;

Queue* createQueue(){
    Queue* q=(Queue*)malloc(sizeof(Queue));
    q->front=-1;
    q->rear=-1;
    return q;
}

int isFull(Queue* q){
    return q->rear==MAX-1;
}

int isEmpty(Queue* q){
    return q->front=-1;
}

void enqueue(Queue* q,int customerID){
    if(isFull(q)){
        printf("Queue is full.Cannot add more customers");
        return;
    }
    if(isEmpty(q)){
        q->front = 0;
    }
    q->rear++;
    q->items[q->rear]=customerID;
    printf("Customer %d added to the queue.\n",customerID);
}

int dequeue(Queue* q){
    if(isEmpty(q)){
        printf("Queue is empty.No customer to serve.\n");
        return -1;
    }
    int customerID=q->items[q->front];
    printf("Serving customer %d.\n",customerID);
    if(q->front==q->rear){
        q->front=q->rear=-1;
    }else{
        q->front++;
    }
    return customerID;
}

int peek(Queue* q){
    if(isEmpty(q)){
        printf("Queue is empty.No customers to peek.\n");
        return -1;
    }
    printf("Customer at front of queue:%d\n,q->items[q->front]");
    return q->items[q->front];
}

void displayQueue(Queue* q) {
    if (isEmpty(q)) {
        printf("Queue is empty.\n");
        return;
    }
    printf("Current queue: ");
    for (int i = q->front; i <= q->rear; i++) {
        printf("%d ", q->items[i]);
    }
    printf("\n");
}

int main() {
    Queue* q = createQueue();
    int choice, customerID;

    while (1) {
        printf("\n1. Add customer to queue\n");
        printf("2. Serve customer\n");
        printf("3. Peek at front customer\n");
        printf("4. Display queue\n");
        printf("5. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                printf("Enter customer ID to add: ");
                scanf("%d", &customerID);
                enqueue(q, customerID);
                break;
            case 2:
                dequeue(q);
                break;
            case 3:
                peek(q);
                break;
            case 4:
                displayQueue(q);
                break;
            case 5:
                free(q);
                exit(0);
            default:
                printf("Invalid choice. Please try again.\n");
        }
    }
    return 0;
}