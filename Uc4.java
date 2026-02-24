/**
 * OOPSBannerApp UC4 - Render OOPS as Banner using String Array and Loop
 *
 * This use case improves upon UC3 by using a String array to store banner lines
 * and iterating through them with a for-each loop, eliminating hardcoded print
 * statements and improving modularity and reusability.
 *
 * @author Developer
 * @version 4
 */
public class OOPSBannerApp {

    // Main method to run the banner display
    public static void main(String[] args) {
        
        // 1. Create a String array to store all seven lines of the OOPS banner
        String[] bannerLines = new String[7];

        // 2. Construct each line using String.join() with individual 9-character width string segments
        bannerLines[0] = String.join(" ", "   *** ", "   *** ", " ****** ", "  ***** ");
        bannerLines[1] = String.join(" ", " ** ** ", " ** ** ", " ** ** ", " ** ** ");
        bannerLines[2] = String.join(" ", " ** ** ", " ** ** ", " ** ** ", " ** ");
        bannerLines[3] = String.join(" ", " ** ** ", " ** ** ", " ****** ", "  ***** ");
        bannerLines[4] = String.join(" ", " ** ** ", " ** ** ", " ** ", "      ** ");
        bannerLines[5] = String.join(" ", " ** ** ", " ** ** ", " ** ", " ** ** ");
        bannerLines[6] = String.join(" ", "   *** ", "   *** ", " ** ", "  ***** ");

        // 3. Use a for-each loop to iterate through the array and print each line
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}
