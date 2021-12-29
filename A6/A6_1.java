import java.io.*;

public class A6_1 {
    public static void main(String A[]) throws IOException {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader  br=new BufferedReader(isr);
        System.out.print("請輸入姓名:");
        String name = br.readLine();
        System.out.println("姓名 "+name);
        System.out.print("請輸入國文:");
        String Chinese = br.readLine();
        System.out.println("國文 "+Chinese);
        System.out.print("請輸入數學:");
        String Math = br.readLine();
        System.out.println("數學 "+Math);
        System.out.print("請輸入英文:");
        String English = br.readLine();
        System.out.println("英文 "+English);
        long total = (Long.parseLong(Chinese) + Long.parseLong(English) + Long.parseLong(Math));
        System.out.println("總成績為: "+ total);
        double ave = ((double) total / 3);
        System.out.println("平均: "+ave);
        if(ave >= 60){
            System.out.println("恭喜及格");
        }else{
            System.out.println("抱歉補考");
        }
        if((ave<=100)&&(ave>=90)){
            System.out.println("A");
        }else if((ave<90)&&(ave>=80)){
            System.out.println("B");
        }else if((ave<80)&&(ave>=70)){
            System.out.println("C");
        }else if ((ave<70)&&(ave>=60)){
            System.out.println("D");
        }else if ((ave<60)&&(ave>=0)){
            System.out.println("E");
        }
    }
}
