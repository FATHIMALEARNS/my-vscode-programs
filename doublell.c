#include <stdio.h>
#include <stdlib.h>

struct node {
    int data;
    struct node* next;
    struct node* prev;
};

struct node* head = NULL; // Initialize the head to NULL

struct node* CreateNode(int x) {
    struct node* newnode = (struct node*)malloc(sizeof(struct node));
    newnode->data = x;
    newnode->prev = NULL;
    newnode->next = NULL;
    return newnode;
}

void InsertAtFirst(int x) {
    struct node* newnode = CreateNode(x);
    if (head == NULL) {
        head = newnode;
        return;
    }
    head->prev = newnode;
    newnode->next = head;
    head = newnode;
}

void InsertAtLast(int x) {
    struct node* newnode = CreateNode(x);
    if (head == NULL) {
        head = newnode;
        return;
    }
    struct node* temp = head;
    while (temp->next != NULL) {
        temp = temp->next;
    }
    temp->next = newnode;
    newnode->prev = temp;
}

void InsertAtPosition(int x, int pos) {
    struct node* newnode = CreateNode(x);
    if (pos == 1) {
        InsertAtFirst(x);
        return;
    }
    struct node* temp = head;
    for (int i = 1; i < pos - 1 && temp != NULL; i++) {
        temp = temp->next;
    }
    if (temp == NULL) {
        printf("Position out of range\n");
        return;
    }
    newnode->next = temp->next;
    newnode->prev = temp;
    if (temp->next != NULL) {
        temp->next->prev = newnode;
    }
    temp->next = newnode;
}

void DeleteAtFirst() {
    if (head == NULL) {
        printf("List is empty\n");
        return;
    }
    struct node* temp = head;
    head = head->next;
    if (head != NULL) {
        head->prev = NULL;
    }
    free(temp);
}

void DeleteAtLast() {
    if (head == NULL) {
        printf("List is empty\n");
        return;
    }
    struct node* temp = head;
    if (head->next == NULL) {
        head = NULL;
        free(temp);
        return;
    }
    while (temp->next != NULL) {
        temp = temp->next;
    }
    temp->prev->next = NULL;
    free(temp);
}

void DeleteAtPosition(int pos) {
    if (head == NULL) {
        printf("List is empty\n");
        return;
    }
    struct node* temp = head;
    if (pos == 1) {
        DeleteAtFirst();
        return;
    }
    for (int i = 1; i < pos && temp != NULL; i++) {
        temp = temp->next;
    }
    if (temp == NULL) {
        printf("Position out of range\n");
        return;
    }
    temp->prev->next = temp->next;
    if (temp->next != NULL) {
        temp->next->prev = temp->prev;
    }
    free(temp);
}

void Display() {
    struct node* temp = head;
    while (temp != NULL) {
        printf("%d ", temp->data);
        temp = temp->next;
    }
    printf("\n");
}

int main() {
    int choice, value, position;
    while (1) {
        printf("\n--- Doubly Linked List Menu ---\n");
        printf("1. Insert at First\n");
        printf("2. Insert at Last\n");
        printf("3. Insert at Position\n");
        printf("4. Delete at First\n");
        printf("5. Delete at Last\n");
        printf("6. Delete at Position\n");
        printf("7. Display List\n");
        printf("8. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);
        switch (choice) {
            case 1:
                printf("Enter value to insert at first: ");
                scanf("%d", &value);
                InsertAtFirst(value);
                break;
            case 2:
                printf("Enter value to insert at last: ");
                scanf("%d", &value);
                InsertAtLast(value);
                break;
            case 3:
                printf("Enter value to insert: ");
                scanf("%d", &value);
                printf("Enter position to insert at: ");
                scanf("%d", &position);
                InsertAtPosition(value, position);
                break;
            case 4:
                DeleteAtFirst();
                break;
            case 5:
                DeleteAtLast();
                break;
            case 6:
                printf("Enter position to delete: ");
                scanf("%d", &position);
                DeleteAtPosition(position);
                break;
            case 7:
                printf("Doubly Linked List: ");
                Display();
                break;
            case 8:
                printf("Exiting program.\n");
                exit(0);
            default:
                printf("Invalid choice! Please try again.\n");
        }
    }
    return 0;
}
