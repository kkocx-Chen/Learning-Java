import java.io.*;

public class A8 {
    public static void main(String A[]) throws IOException{
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.print("請輸入起始值:");
        int s = Integer.parseInt(br.readLine());
        while (s<0){
            System.out.print("請重新輸入起始值:");
            s = Integer.parseInt(br.readLine());
        }
        System.out.print("請輸入終止值:");
        int y = Integer.parseInt(br.readLine());
        do{
            System.out.print("請重新輸入終止值:");
            y = Integer.parseInt(br.readLine());
        }
        while(y<0||y<s);
        int i;
        int sum=0;
        for (i=s;i<=y;i++){
            sum=sum+i;
            if(i%3==0||i%5==0){
                System.out.println("i= "+i);
                System.out.println("   sum="+sum);
            }
        }
        System.out.print("迴圈中斷 i = "+i);
        System.out.println("   sum = "+sum);
    }
    
}
