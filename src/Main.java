import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    //import logger
    public static Logger logger = LoggerFactory.getLogger(Main.class.getName());

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> stringHashSet = new HashSet<>();
        Set<String> duplicateStringHashSet = new HashSet<>();
        int n;
        while (true) {
            System.out.println("Enter a number of string to insert into the Set");
            try {
                n = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                logger.error("Invalid input. Please enter a number");
            }
        }
        logger.info("Number of string to insert: " + n);

        for (int i = 0; i < n; i++) {
            System.out.println("Enter a string to insert into the Set");
            String input = sc.nextLine();
            if (stringHashSet.contains(input)) {
                duplicateStringHashSet.add(input);
            } else {
                stringHashSet.add(input);
            }
        }

        logger.info("Duplicate string: " + duplicateStringHashSet);
        logger.info("Set: " + stringHashSet);
        logger.info("Size of Set: " + stringHashSet.size());
        sc.close();
    }


}