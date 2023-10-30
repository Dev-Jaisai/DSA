public class Fibbon {
    public static void main(String[] args) {
        int first=0;
        int second=1;
        int n=30;

        while (first<=n){
            System.out.print(first+ " ");
            int next=first+second;
            first=second;
            second=next;
        }
    }
}
