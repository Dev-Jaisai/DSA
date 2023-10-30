package Interview;
class NewTest {
    public static void main(String[] args)
    {
        String str = "Scientech Easy";
        int x[ ] = {0, 1, 2, 3, 4};

        try // Outer try block
        {
            int slength = str.length();
            System.out.println("String length: " +slength);

            try // Inner try block
            {
                int y = 6;
                System.out.println(x[y]); // Exception occurred.
            }
            catch(ArrayIndexOutOfBoundsException aie)
            {
                System.out.println("Exception is thrown");
                System.out.println(aie.toString());
            }
        } // Outer try block ends here.
        catch(NullPointerException npe)
        {
            System.out.println("Exception is thrown ");
            System.out.println(npe.toString());
        }
    }
}