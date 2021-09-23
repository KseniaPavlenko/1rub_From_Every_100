public class Main {

    public static void main(String[] args) {
        int currentAccount = 100;
        int transferAmount = 1100;

        int bonus;
        int totalAccount;
        if (transferAmount > 1000) {

            bonus = transferAmount / 100;

        } else {

            bonus = 0;

        }
        totalAccount = currentAccount + transferAmount + bonus;
        System.out.println("На Вашем счете:" + totalAccount);
        System.out.println("Начислено бонусов:" + bonus);
    }
}
