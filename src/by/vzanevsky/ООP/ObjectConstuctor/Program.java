package by.vzanevsky.��P.ObjectConstuctor;

public class Program {
    public static void main(String[] args) {

        Questions questions = new Questions();
        User user = new User();
        Check check = new Check();

        user.firstName();
        user.lastName();

        System.out.printf("������������ %1$s %2$s! \n", user.firstName, user.lastName);

        System.out.println("����� ���������� �� ��������� �� ���� ������!");

        questions.questionOne();

        while (!check.result) {
            user.scan();
            check.result(questions.reply, user.answer);
        }

        check.result = false;

        questions.questionTwo();

        while (!check.result) {
            user.scan();
            check.result(questions.reply, user.answer);
        }

        check.result = false;

        questions.questionThree();

        while (!check.result) {
            user.scan();
            check.result(questions.reply, user.answer);
        }

        check.result = false;

        questions.questionFour();

        while (!check.result) {
            user.scan();
            check.result(questions.reply, user.answer);
        }

        System.out.println("����������� � ������������ ���������!");
    }
}
