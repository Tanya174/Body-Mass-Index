public class BodyMainIndex {

        public static void main(String[] args) {
            BmiService service = new BmiService();
            double height = 1.65;
            double weight = 49.9;
            double bodyMassIndex = service.calculate(height, weight);
            System.out.println(bodyMassIndex);

        }
    }

