public class FizzBuzzTest {
    public static void main(String[] args){
        FizzBuzz f = new FizzBuzz();

        // System.out.println(f.dogs(3));
        // System.out.println(f.dogs(5));
        // System.out.println(f.dogs(15));
        // System.out.println(f.dogs(2));

        for (int i = 0; i < 100; i++){
            String result = f.fizzBuzz(i);
            String output = String.format("Number: %d - Result: %s", i, result);
            System.out.println(output);
        }
    }
}