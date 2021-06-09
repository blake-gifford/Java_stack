public class BasicTesting {
    public static void main(String[] args){
        oneToOneHundred o = new Basic();
        for(int i = 0; i < 101; i++){
            Integer result = o.oneToOneHundred(i);
            System.out.println(result);
        }
    }
}