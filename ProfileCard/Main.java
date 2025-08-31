public class Main {
    public static void main(String[] args) {
        profileHeader(30);
        userProfile Barci = new userProfile("John Paul Barcinilla", "BSIT-102", "Don't compare your chapter 1 to someone who finished a system", "Minute burger + fries = heaven");
        Barci.displayProfile();
        symbolicArt();
    }

    private static void profileHeader(int stars) {
        String profile_title = "MY PROFILE CARD";

        for (int i=0; i<=stars; i++) {
            System.out.print("*");
        }
        System.out.print("\n*");
        for (int i=0; i<(stars - 1 - profile_title.length())/2; i++) {
            System.out.print(' ');
        }
        System.out.print(profile_title);
        for (int i=0; i<(stars - 1 - profile_title.length())/2; i++) {
            System.out.print(' ');
        }
        System.out.print("*\n");
        for (int i=0; i<=stars; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
    private static void symbolicArt() {
        System.out.println("\nSymbolic Art: ");
        System.out.println(
                "    ,-\"-.-\"-.\n" +
                "   (         )\n" +
                "    \".     .\"\n" +
                "      \"._.\"");
    }
    private static class userProfile {
        String name, section, favoriteQuote, funFact;

        public userProfile(String name, String section, String favoriteQuote, String funFact) {
            this.name = name;
            this.section = section;
            this.favoriteQuote = favoriteQuote;
            this.funFact = funFact;
        }

        public void displayProfile() {
            System.out.printf("\nName: %s\nSection: %s\nFavorite Quote: %s\nFun Fact: %s\n", name, section, favoriteQuote, funFact);
        }
    }
}