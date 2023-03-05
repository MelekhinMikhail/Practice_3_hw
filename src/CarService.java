public class CarService {
    private int freeStaff;

    public CarService(int freeStaff) {
        if (freeStaff < 0) {
            throw new IllegalArgumentException("Количество не может быть отрицательным");
        }
        this.freeStaff = freeStaff;
    }

    public void modify(Car car) {
        if (car == null) {
            throw new IllegalArgumentException("Передан пустой объект");
        } else if (freeStaff < 1) {
            System.out.println("В данный момент нет свободных мастеров.");
            return;
        }
        char[] array = car.getBrand().toCharArray();
        for (int i=0; i<array.length; i++) {
            if (array[i] == 'a' || array[i] == 'A') {
                array[i] = 'o';
            } else if (array[i] == 'i' || array[i] == 'I') {
                array[i] = 'e';
            }
        }
        car.setBrand(new String(array).toUpperCase());
    }

    public int getFreeStaff() {
        return freeStaff;
    }

    public void setFreeStaff(int freeStaff) {
        this.freeStaff = freeStaff;
    }
}
