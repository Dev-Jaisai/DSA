 @FunctionalInterface
interface AbcInter{
public int squatIntMy(int x);

}


public class Myclass {
    public static void main(String[] args) {

//   AbcInter abc=x->(x*x);
//        System.out.println(abc.squatIntMy(5));

        AbcInter abc=Myclass::squalre;

        System.out.println(abc.squatIntMy(5));

        }
    public static int squalre(int y){
        return y*y;
    }


}
