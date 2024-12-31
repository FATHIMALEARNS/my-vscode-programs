import java.util.*;
public class SecondSmallestelement{
    public static void main(String args[]){
        int i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter elements");
        for(i=0;i<n;i++){
           arr[i]=sc.nextInt();
        }

        System.out.println("bubble sorting");
        for(i=0;i<n-1;i++)
        {
            for(j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {

                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }

        System.out.println("Sorted array is");
        for(i=0;i<n;i++)
        {
        System.out.print(arr[i]+" ");
        }
        System.out.println();
        
        System.out.println("Second smallest element is"+arr[1]);
    }
}
