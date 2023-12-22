public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height;
        int mass;
        height=1.87;
        mass=98;
        System.out.println();
        System.out.println("Расчёт BMI-индекса при росте "+(height) + "м и весе "+ (mass)+"кг.");
        System.out.println("BMI-индекс:"+ service.calculate(height,mass));

        System.out.println();
        System.out.println("Тест");
        System.out.println(service.calculate(1.87,98));
        System.out.println(service.calculate(1.50,100));
        System.out.println(service.calculate(1.60,50));
        System.out.println(service.calculate(1.87,107));
        System.out.println(service.calculate(1.87,90));
        System.out.println(service.calculate(2,90));


    }
}