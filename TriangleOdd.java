package PatternPrinting;

public class TriangleOdd {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            int a=1;
            for(int j=1;j<=i;j++){
                System.out.print(a+" ");
                a+=2;
            }
            System.out.println();
        }
    }
}
