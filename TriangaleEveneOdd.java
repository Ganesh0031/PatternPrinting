package PatternPrinting;

public class TriangaleEveneOdd {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i%2==0){
                    System.out.print(j+" ");
                }
                else{
                    System.out.print((char)(64+j)+" ");
                }
            }
            System.out.println();
        }
    }
}
