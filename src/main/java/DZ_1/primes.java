package DZ_1;

/* Вывести все простые числа от 1 до 1000  */
public class primes {
    public static void main(String[] args) {
        for(int i = 2; i <= 1000; i++) {
            boolean prime = true;
            for(int j = 2; j < i; j++) {
                if(i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if(prime) {
                System.out.println(i);
            }
        }
    }
}