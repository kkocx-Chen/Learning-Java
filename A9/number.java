public class number {
    public static void main(String[] args) {
      int rows = 1;
      for (int i = 10; i >= rows; i--) {
        for (int j = 1; j <= 10; j++) {
            if(j<i){
                System.out.print(" ");
            }else{
                System.out.print(j);
            }
        }
        System.out.println(""+"i="+i);
      }
    }
  }