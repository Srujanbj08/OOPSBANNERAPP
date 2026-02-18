/**
 * OOPSBannerApp UC6 – OOPS Banner Application (Use Case 6)
 *
 * This use case extends UC5 by implementing a modular approach to generate each
 * letter's pattern through dedicated methods. This enhances code reusability and
 * maintainability by separating pattern generation logic from the main display logic.
 *
 * @author Developer
 * @version 6.0
 */
public class OOPSBannerApp {
    public static String[] getOPattern() {
        return new String[] {
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        };
    }
    public static String[] getPPattern() {
        return new String[] {
            "**** ",
            "*   *",
            "*   *",
            "**** ",
            "*    ",
            "*    ",
            "*    "
        };
    }
    public static String[] getSPattern() {
        return new String[] {
            " *** ",
            "*   *",
            "*    ",
            " *** ",
            "    *",
            "*   *",
            " *** "
        };
    }

    public static void main(String[] args) {

        // Get patterns for O, O, P, S
        String[] o1 = getOPattern();
        String[] o2 = getOPattern();
        String[] p  = getPPattern();
        String[] s  = getSPattern();

        // Gap between letters
        String gap = "  ";

        // Assume all patterns share the same height
        int rows = o1.length;

        // Print assembled banner line-by-line
        for (int i = 0; i < rows; i++) {
            System.out.println(
                o1[i] + gap +
                o2[i] + gap +
                p[i]  + gap +
                s[i]
            );
        }
    }
}
