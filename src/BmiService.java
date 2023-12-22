public class BmiService {
    public int calculate (double height, int mass) {
        int n=2;
        int index;
        index = (int) (mass / (Math.pow(height, n)));
        return  index;
    }
}
