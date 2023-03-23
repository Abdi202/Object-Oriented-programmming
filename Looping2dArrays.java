package UpdateCouse;

import java.util.Arrays;

public class Looping2dArrays {

    public static void main(String[]args){

        //looping Arrays  looping and Arrays They are spling brother
        double [][] Students = {{74.4,67.5,89.3,54.76 },
     {24.4,76.5,86.3,63.76},
     {63.76,35.4,73.5,93.3}};

    //   for(int i =0;i<Students[0].length;i++){
    //    System.out.println(Students[0][i]);//[0][0],[0][1],[0][2][0][3]
    //   }
    //   System.out.println("----------------------------------------");

    //   for(int i =0;i<Students[1].length;i++){
    //     System.out.println(Students[1][i]);//[1][0],[1][1],[1][2][1][3]
    //   }
    //   System.out.println("----------------------------------------");

    //   for(int i =0;i<Students[2].length;i++){
    //     System.out.println(Students[2][i]);//[2][0],[2][1],[2][2][2][3]
    //   } 

    //inner loop
    for(int i =0;i<Students.length;i++){ /// 0 1 2
        switch(i){
            case 0: System.out.print("\tAbdikarim:  ");break;
            case 1: System.out.print("\tALi:  " );break;   
           case 2: System.out.print("\tMoha:  " );break;
        }
        for(int j =0;j<Students[i].length;j++){
         System.out.print(Students[i][j] +" ");
        }
        System.out.println("\n");
         } 
         
        //  System.out.println(Arrays.toString(Students[0]));
        //  System.out.println(Arrays.toString(Students[1]));
        //  System.out.println(Arrays.toString(Students[2]));
    }
    
}
