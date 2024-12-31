#include<stdio.h>
int MAX=10;
int arr[10],i,key,low=0,mid,high=9;
int binarysearch(int arr[],int MAX,int key,int low,int high);
int binarysearch(int arr[],int MAX,int key,int low,int high)
{
    if(high>low)
    {
        mid=(high+low)/2;
        if(arr[mid]==key)
        {
            return mid;
        }
        else if(key<arr[mid])
        {
            high=mid-1;
            return binarysearch( arr, MAX, key, low, high);
        }
        else if(key>arr[mid])
        {
            low=mid+1;
            return binarysearch(arr,MAX, key, low, high);

        }
        else
        {
            return -1;
        }
    }
}
int main()
{
    printf("Enter array elements in sorted order");
    for(i=0;i<MAX;i++)
    {
        scanf("%d",&arr[i]);
    }
    printf("Enter key");
    scanf("%d",&key);
    int result = binarysearch(arr,MAX,key,low,high);
    if(result==-1)
    printf("Element not present");
    else
    printf("%d found at %d",arr[mid],mid);
    return 0;
}
