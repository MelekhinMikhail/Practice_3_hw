import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String brand, model, color;
        int maxSpeed;
        double engineCapacity;
        System.out.println("Мелехин Михаил Тимофеевич");
        System.out.println("Группа РИБО-01-21");
        while (true) {
            System.out.println();
            System.out.println("Введите марку автомобиля (на английском):");
            brand = scan();
            if (brand.isEmpty() || brand.isBlank()) {
                System.out.println("Поле Марка должно быть заполнено");
                continue;
            }
            break;
        }
        while (true) {
            System.out.println();
            System.out.println("Введите модель машины:");
            model = scan();
            if (model.isEmpty() || model.isBlank()) {
                System.out.println("Поле Модель должно быть заполнено");
                continue;
            }
            break;
        }
        while (true) {
            System.out.println();
            System.out.println("Введите цвет машины:");
            color = scan();
            if (color.isEmpty() || color.isBlank()) {
                System.out.println("Поле Модель должно быть заполнено");
                continue;
            }
            break;
        }
        while (true) {
            System.out.println();
            System.out.println("Введите максимальную скорость в км/ч:");
            try {
                maxSpeed = Integer.parseInt(scan());
                if (maxSpeed <= 0) {
                    System.out.println("Максимальная скорость должна быть больше нуля");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Необходимо ввести целое число");
            }
        }
        while (true) {
            System.out.println();
            System.out.println("Введите объем двигателя в литрах:");
            try {
                engineCapacity = Double.parseDouble(scan());
                if (engineCapacity <= 0) {
                    System.out.println("Объем двигателя должен быть больше нуля");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Необходимо ввести число");
            }
        }
        Car car = new Car(brand, model, color, maxSpeed, engineCapacity);
        System.out.println();
        System.out.println("Готово! Объект создан.");
        System.out.println(car);
        System.out.println();
        System.out.println("Вызываем метод modify...");
        CarService carService = new CarService(5);
        carService.modify(car);
        System.out.println();
        System.out.println("Готово! Измененный объект:");
        System.out.println(car);
    }

    public static String scan() {
        return new Scanner(System.in).nextLine();
    }
}