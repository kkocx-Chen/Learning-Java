public class A6 {
    public static void main(String A[])
    {
        int imax=java.lang.Integer.MAX_VALUE;
        int imin=java.lang.Integer.MIN_VALUE;
        System.out.println("imin="+imin+" imax="+imax);
        System.out.println("錯誤處理，(long)(imin-1)="+((long)(imin-1))+" (long)(imax+1)="+(long)(imax+1));
        System.out.println("正確處理，((long)(imin-1))="+((long)(imin-1))+" (imax+1(long))="+(imax+(long)1));   
    }
    
}
