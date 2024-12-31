import java.util.*;
public class MultiplyMatrix{
    public static void main(String args[]){
        int i,j,k;
        int x[][]=new int [2][2];
        int y[][]=new int [2][2];
        int z[][]=new int [2][2];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements of x:");
        for(i=0;i<2;i++){
            for(j=0;j<2;j++){
                x[i][j]=sc.nextInt();
            }
        }
        System.out.println("elements of x are:");
        for(i=0;i<2;i++){
            for(j=0;j<2;j++){
               System.out.print(x[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Enter elements of y:");
        for(i=0;i<2;i++){
            for(j=0;j<2;j++){
                y[i][j]=sc.nextInt();
            }
        }
        System.out.println("elements of y are:");
        for(i=0;i<2;i++){
            for(j=0;j<2;j++){
               System.out.print(y[i][j]+" ");
            }
            System.out.println();
        }

        for(i=0;i<2;i++){
            for(j=0;j<2;j++){
                z[i][j]=0;
                for(k=0;k<2;k++){
                    z[i][j]=z[i][j]+(x[i][k]*y[k][j]);
                }
            }
        }

        System.out.println("Product is");
        for(i=0;i<2;i++){
            for(j=0;j<2;j++){
                System.out.print(z[i][j]+" ");
            }
            System.out.println();
        }

}
}