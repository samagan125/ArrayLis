import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
                List<Integer> allNumbers = new ArrayList<>();
                for (int i = 1; i <= 100; i++) {
                    allNumbers.add(i);
                }

                List<Integer> evenNumbers = new ArrayList<>();


                for (int number : allNumbers) {
                    if (number % 2 == 0) {
                        evenNumbers.add(number);
                    } else {
                    }
                }

                System.out.println("Even numbers: " + evenNumbers);

            }
        }

