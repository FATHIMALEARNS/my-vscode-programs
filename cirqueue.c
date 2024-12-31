#include<stdio.h>
int size=3;
int arr[3];
int	front=-1;
int	rear=-1;
int item,v;
	int ch;
void enqueue(int value);
int dequeue();
void display();
void display()
	// Circular Queue
	
{
	if (front == -1)
	{
		printf("\nQueue is Empty");
		
	}
	printf("\nElements in Circular Queue are: ");
	if (rear >= front)
	{
		for (int i = front; i <= rear; i++)
			printf("%d ",arr[i]);
	}
	else
	{
		for (int i = front; i < size; i++)
			printf("%d ", arr[i]);

		for (int i = 0; i <= rear; i++)
			printf("%d ", arr[i]);
	}
}

int dequeue()
{
	if (front == -1)
	{
		printf("\nQueue is Empty");
	
	}

	int data = arr[front];
	arr[front] = -1;
	printf("front %d %d",front,arr[front]);
	if (front == rear)
	{
		front = -1;
		rear = -1;
	}
	else if (front == size-1)
		front = 0;
	else
		front++;

	return data;
}
void enqueue(int value)
{
    if ((front == 0 && rear == size-1) ||
			((rear+1) % size == front))
	{
		printf("\nQueue is Full");
		return;
	}

	else if (front == -1) /* Insert First Element */
	{
		front =rear = 0;
		arr[rear] = value;
		printf("rear position %d\n",rear);
		printf("front position %d\n",front);
	}

	else if (rear == size-1 && front != 0)
	{
		rear = 0;
		arr[rear] = value;
		printf("rear position %d\n",rear);
		printf("front position %d\n",front);
	}

	else
	{
		rear++;
		arr[rear] = value;
		printf("rear position %d\n",rear);
		printf("front position %d\n",front);
	}
}

    


int main()
{
	// Initialize front and rear
	

	
while(1)
{
printf("1.enqueue\n2.dequeue\n3.display\n4.exit\n");
printf("enter the choice");
scanf("%d",&ch);
switch(ch)
{
    case 1:
    printf("enter the element to insert");
    scanf("%d",&item);
    enqueue(item);
    break;
    case 2:
    
     v=dequeue();
    printf("\nDeleted value = %d", v);
    break;
    case 3:
    display();
    break;
    case 4:
    return 0;
    break;
    default:
    printf("Invalid choice");
    break;
}
    
    
}
}
