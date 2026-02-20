/**
 * OOPSBannerApp – Use Map for Character Patterns and Render via Function
 *
 * This use case extends UC7 by utilizing advanced Object-Oriented Programming concepts
 * such as the Collections Framework to manage character patterns in a more flexible
 * and efficient manner. The application retrieves and displays the "OOPS" banner
 * using a HashMap thereby enhancing code organization and modularity.
 *
 * @author Developer
 * @version 8.0
 */
import java.util.*;
public class OOPSBannerApp {
    public static void main(String[] args) {
        HashMap<Character, String[]> map = new HashMap<>();
        map.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });
        map.put('P', new String[]{
                "****** ",
                "*     *",
                "****** ",
                "*      ",
                "*      "
        });
        map.put('S', new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        });
        String word = "OOPS";
        for (int i = 0; i < 5; i++) {  // 5 rows
            for (char ch : word.toCharArray()) {
                System.out.print(map.get(ch)[i] + "  ");
            }
            System.out.println();
        }
    }
}