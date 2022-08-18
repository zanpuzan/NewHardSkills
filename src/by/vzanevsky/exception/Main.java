package by.vzanevsky.exception;

public class Main {
    public static void main(String[] args) {

        User user = new User();

        System.out.println("������: ���������� ������� ��������� ����� ������");

        do {
            try {
                user.scanName();
            } catch (RuntimeException re) {
                System.out.println(re.getMessage());
            }
        } while (user.fullName == null);

        System.out.println("�������! ���� ������");

        do {
            try{
                user.scanAge();
            } catch (RuntimeException re) {
                System.out.println(re.getMessage());
            }
        } while (user.age <= 0 | user.age >= 100);

        System.out.println("������� �� ���������� ._.");
    }
}
