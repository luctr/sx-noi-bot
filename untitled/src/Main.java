import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Dog> list = new ArrayList<>();
        do {
            System.out.println("------Menu------");
            System.out.println("1. Thêm cún");
            System.out.println("2. Sắp xếp theo tuổi");
            System.out.println("3. Xóa cún theo tên");
            System.out.println("4. Sửa thông tin");
            System.out.println("5. Thoát :");
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            switch (num) {
                case 1:
                    System.out.println("Nhập tên cún :");
                    String name = new Scanner(System.in).nextLine();
                    System.out.println("Nhập tuổi cún :");
                    Integer age = new Scanner(System.in).nextInt();
                    System.out.println("Màu sắc :");
                    String color = new Scanner(System.in).nextLine();
                    Dog dog = new Dog(name, age, color);
                    list.add(dog);
                    break;
                case 2:
                    bubleSort(list);
                    break;
                case 3:
                    delete(list);
                    break;
                case 4:
                    System.out.println("------------");
                    System.out.println("1. ");
                    System.out.println();
                    System.out.println();
                    break;
            }
        } while (true);
    }

    // sắp xếp nổi bọt
    public static void bubleSort(ArrayList<Dog> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = list.size() - 1; j > i; j--) {
                if (list.get(j).getAge() < list.get(j - 1).getAge()) {
                    Dog temp = list.get(j);
                    list.set(j, list.get(j - 1));
                    list.set(j - 1, temp);
                }
            }

        }
        show(list);
    }

    // show
    private static void show(ArrayList<Dog> list) {
        for (int j = 0; j < list.size(); j++) {
            System.out.println(list.get(j));
        }
    }

    // Xóa
    public static void delete(ArrayList<Dog> list) {
        System.out.println("Nhập tên cần xóa :");
        String name = new Scanner(System.in).nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(name)) {
                list.remove(i);
            }
        }
    }

}
