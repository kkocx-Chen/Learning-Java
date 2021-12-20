public class A3 {
    // 主程式 
    public static void main(String A[]) { 
        System.out.println("身高="+A[0]);
        System.out.println("體重="+A[1]);
        double 身高公尺 = (Double.parseDouble(A[0])/100);
        double 身高公尺平方 = (身高公尺*身高公尺);
        double BMI = (Integer.parseInt(A[1])/身高公尺平方);
        System.out.println(BMI);

           
    }
}
        
       
        
        
        
		
   