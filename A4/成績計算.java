import java.util.Scanner;

public class 成績計算 {
    public static void main(String[] args){
        //輸入國文
        Scanner CH = new Scanner(System.in);
        System.out.print("1.請輸入國文");
        int Chinese = CH.nextInt();
        CH.close(); //關閉掃描儀 
        //輸入英文
        Scanner US = new Scanner(System.in);
        System.out.print("2.請輸入英文");
        int English = US.nextInt();
        US.close(); //關閉掃描儀 
        //輸入數學
        Scanner MT = new Scanner(System.in);
        System.out.print("3.請輸入數學");
        int Math = MT.nextInt();
        MT.close(); //關閉掃描儀 
        //總分
        int total = Chinese + English + Math;
        System.out.println("總成績"+total);
        //平均 
        double ave = (double)total / 3 ; //強制轉型只限制數字 
        System.out.println("平均"+ave);
        //if else
        // if (ave >= 60){
        //     System.out.println("恭喜及格");
        // }else{
        //     System.out.println("抱歉補考");
        // }
        if((ave<100)&&(ave>80)){
            System.out.println("A");
        }else if((ave<90)&&(ave>80)){
            System.out.println("B");
        }else if((ave<0)&&(ave>90)){
            System.out.println("C");
        }
    }
    
}
