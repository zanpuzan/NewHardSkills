package by.vzanevsky;

public class WhileClass {
    public static void main(String[] args) {

        int int1 = 0;

        System.out.println("����� ����� �� 0 �� 50");

        while (int1 <= 50) {
            System.out.print(int1 + " ");
            int1++;
        }

        System.out.println();

        System.out.println("����� ����� �� 50 �� 0");

        do {
            if (int1 <= 50) {
                System.out.print(int1 + " ");
            }
            int1--;
        } while (int1 >= 0);

        System.out.println();

        System.out.println("����� �������� ����� �� 0 �� 50");

        while (int1 <= 50) {
            if (int1 % 2 == 1) {
                System.out.print(int1 + " ");
            }
            int1++;
        }

        System.out.println();

        System.out.println("����� ������ ����� �� 50 �� 0");

        while (int1 > 0) {
            if (int1 % 2 == 0) {
                System.out.print(int1 + " ");
            }
            int1--;
        }

        System.out.println();

        System.out.println("����� �������� ������������������ �����");

        int1 = 2;

        while (int1 <= 1024) {
            System.out.print(int1 + " ");
            int1 = int1 * 2;
        }

        System.out.println();

        System.out.println("����� ����� �� 50 �� 30");

        while (int1 >= 30) {
            if (int1 <= 50) {
                System.out.print(int1 + " ");
            }
            int1--;
        }

        System.out.println();

        System.out.println("��������� ���������������� �����");

        int numb1 = -278446;
        int numb2 = 0;
        int numb3 = 0;

        System.out.println("��������� ����� = " + numb1);

        if (numb1 < 0) {
            numb2 = numb1 * -1;
            numb3 = numb1 * -1;
        } else {
            numb2 = numb1;
            numb3 = numb1;
        }

        boolean exception = numb2 >= 0 & numb2 <= 9;

        if (exception){
            System.out.print("���������� ����������� ������������� �����");
        } else if (numb1 > 0){
            System.out.print("������������ ��������: ");
        } else {
            System.out.print("������������ ��������: -");
        }

        int result;

        while (numb2 > 0) {
            result = numb2 % 10;
            if (!exception) {
                System.out.print(result);
            }
            numb2 = numb2 / 10;
        }

        System.out.println();

        int min = 9;
        int max = 0;

        while (numb3 > 0) {
            if (min > numb3 % 10) {
                min = numb3 % 10;
            }
            if (max < numb3 % 10) {
                max = numb3 % 10;
            }
            numb3 = numb3 / 10;
        }

        System.out.println("����������� ����� � ����� = " + min);
        System.out.println("�a����������� ����� � ����� = " + max);

    }
}
