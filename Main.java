public class Main{
    public static void main(String[] args) {
        double height = 1.65;
        double weight = 50;
        double result = 0;
        result = weight/(height*height); 
        System.out.println(String.format("%.2f", result));
    }
}