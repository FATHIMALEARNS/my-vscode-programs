import java.util.*;
public class transpose{
                        public static void main(String args[]){
                            int i,j;
                            int x[][]=new int[2][2];
                            int y[][]=new int[2][2];
                            Scanner sc=new Scanner(System.in);
                            System.out.println("Enter elements of x:");
                            for(i=0;i<2;i++){
                                for(j=0;j<2;j++){
                                    x[i][j]=sc.nextInt();
                                }
                            }

                            for(i=0;i<2;i++){
                                for(j=0;j<2;j++){
                                    y[j][i]=x[i][j];
                                }
                            }

                            System.out.println("Transpose is:");
                            for(i=0;i<2;i++){
                                for(j=0;j<2;j++){
                                   System.out.print(y[i][j]+" ");
                                }
                                System.out.println();
                            }
                        }
                    }