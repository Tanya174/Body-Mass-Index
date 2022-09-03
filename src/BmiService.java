public class BmiService {
    public double calculate(double height, double weight) {
        double bodyMassIndex = weight / Math.pow(height, 2) ;
        return bodyMassIndex;
    }
}
