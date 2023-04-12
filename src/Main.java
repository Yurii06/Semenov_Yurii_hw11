public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(20000);

        try {
            while (true) {
                account.withDraw(6000);
                System.out.println("Ваша операция прошла успешно!" );
            }
        } catch (LimitException e) {
            System.out.println("Ошибка: " + e.getMessage());
            System.out.println("Доступная сумма: " + e.getRemainingAmount());
        }
    }
}