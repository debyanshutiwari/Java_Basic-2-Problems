package debyanshu;

public class Reverse {
    public static void main(String[] args) {
        int a[][] = {{1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}};
      //  System.out.println( rev(a));
        rev(a);

    }
    static  void  rev(int a[][]){
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a.length ; j++) {
          int start=0;
          int end=a.length-1;

          while(start<end) {
              int temp = a[i][start];// checking condition
              a[i][start] = a[i][end];

              a[i][end] = temp;
              start++;
              end--;


          }



                System.out.print(a[i][j]+" ");

          }

            System.out.println();
            }

       // return -1;

        }


    }

