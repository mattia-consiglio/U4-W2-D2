import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

public class Exercise2 {
    public static Logger logger = LoggerFactory.getLogger(Exercise1.class.getName());

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        while (true) {
            System.out.println("Enter a number to generate a list of random numbers");
            try {
                n = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                logger.error("Invalid input. Please enter a number");
            }
        }

        List<Integer> list = genList(n);
        logger.info("List: " + list);
        addInvertedList(list);
        logger.info("List: " + list);

        String input = "";
        while (!input.equals("0") && !input.equals("1")) {
            System.out.println("Enter 0 (for even) 1 (for odd) filter the list with even or odd indexes");
            input = sc.nextLine();
        }

        if (input.equals("0")) {
            logger.info("Even list: " + evenOddList(true, list));
        } else {
            logger.info("Odd list: " + evenOddList(false, list));
        }
        sc.close();

    }

    public static List<Integer> genList(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new Random().nextInt(100));
        }
        Collections.sort(list);
        return list;
    }

    public static void addInvertedList(List<Integer> list) {
        List<Integer> invertedList = new ArrayList<>(list);

        invertedList.sort(Collections.reverseOrder());

        list.addAll(invertedList);
    }

    public static List<Integer> evenOddList(boolean even, List<Integer> list) {
        List<Integer> evenOddList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (even && i % 2 == 0) {
                evenOddList.add(list.get(i));
            }
            if (!even && i % 2 != 0) {
                evenOddList.add(list.get(i));

            }
        }
        return evenOddList;
    }
}