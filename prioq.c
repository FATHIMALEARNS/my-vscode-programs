#include<stdio.h>
#include<stdlib.h>
#define MAX 100
int idx=-1;
int pqval[MAX],pqpriority[MAX];

int isEmpty(){
    return idx==-1;
}
int isFull(){
    return idx=MAX-1;
}

int enqueue(int data, int priority) {
    if (isFull()) {
        printf("Queue is full\n");
        return -1;
    }
    idx++;
    pqval[idx] = data;
    pqpriority[idx] = priority;

    // Sort elements by priority
    int i = idx;
    while (i > 0 && pqpriority[i] > pqpriority[i - 1]) {
        // Swap data and priority with the previous element
        int tempData = pqval[i];
        pqval[i] = pqval[i - 1];
        pqval[i - 1] = tempData;

        int tempPriority = pqpriority[i];
        pqpriority[i] = pqpriority[i - 1];
        pqpriority[i - 1] = tempPriority;

        i--;
    }
    return 0;
}
int peek(){
    int maxprio=-1;
    int indexpos=-1;
    for(int i=0;i<=idx;i++){
        if(maxprio<pqpriority[i]){
            maxprio=pqpriority[i];
            indexpos=i;
        }
    }
    return indexpos;
}

void dequeue(){
    if(!isEmpty){
        int indexpos=peek();
        for(int i=indexpos;i<idx;i++){
            pqval[i]=pqval[i+1];
            pqpriority[i]=pqpriority[i+1];  
        }
        idx--;    
    }
    else{
        printf("Queue is empty");
    }
}

int main(){
    enqueue(10,2);
    enqueue(20,5);
    enqueue(30,1);
    printf("Element with highes priority:%d",pqval[peek()]);
    dequeue();
    printf("Element with highes priority after dequeue:%d",pqval[peek()]);
    return 0;

}