package PatternPrinting;

public class ReverseAlphabeat {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
    }
}
