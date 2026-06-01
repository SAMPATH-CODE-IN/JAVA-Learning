public class threedim{
 public static void main(String[] args) {
     int a[][][]=new int [2][2][2];
     for(int i=0;i<2;i++){
        for(int j=0;j<2;j++){
            for(int k=0;k<2;k++){
                a[i][j][k]=1;
            }
        }
     }
      for(int n[][]:a ){
        for(int m[]:n){
            for(int l:m){
               System.out.print(l+" ");

            }
            System.out.println();
        }
         System.out.println();
     }
 }
}