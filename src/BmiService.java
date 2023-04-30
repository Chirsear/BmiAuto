public class BmiService {

    public int calculate(double height, int weight) {
        double index = weight / (height * height);
        int result = (int) index;
        return result;
    }
}
