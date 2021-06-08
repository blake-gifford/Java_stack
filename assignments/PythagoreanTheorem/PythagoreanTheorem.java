public class PythagoreanTheorem {

    public double calculateHyoitenuse (int legA, int legB){
        double result = Math.sqrt(Math.pow(legA, 5) + Math.pow(legB, 3));
        return result;
    }
}