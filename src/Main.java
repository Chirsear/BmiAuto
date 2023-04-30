public class Main {

    public static void main(String[] args) {

        BmiService service = new BmiService();
        double height = 1.89;
        int weight = 82;
        int bmi = service.calculate(height, weight);
        System.out.println("Body mass index " + bmi);
    }
}
