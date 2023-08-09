 public class LuckyShuttles {
        public static void main(String[] args) {
            System.out.println("Перші 100 номерів без нещасливих чисел:");

            int count = 0;
            int number = 1;

            while (count < 100 && number <= 100) {
                if (!isUnluckyNumber(number)) {
                    System.out.print(number + " ");
                    count++;
                }
                number++;
            }
        }

        public static boolean isUnluckyNumber(int num) {
            return num % 10 == 4 || num % 10 == 9 || num / 10 == 4 || num / 10 == 9;
        }
    }



