package XunLian;


public class FuXi1 {
   public static void main(String args[]){
           int sum=0,i;
           for (i=1;i<1000;i++) {
               sum = sum + i;
               if(sum>=8888) {
                   System.out.println(i-1);
                   break;
               }
           }
    }
}


