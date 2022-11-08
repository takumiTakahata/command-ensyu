public class Main{
    public static void main(String[] args) {
        double height = 1.65;
        double weight = 50;
        double result = 0;
        result = weight/(height*height); 
        double height2 = 1.8;
        double weight2 = 70;
        double result2 = 0;
        result2 = weight2/(height2*height2); 
        System.out.println("一人目のBMIは"+String.format("%.2f", result));
        System.out.println("二人目のBMIは"+String.format("%.2f", result2));

    }
}