public class PasswordChecker {
    private final String password;

    public PasswordChecker(String password) {
        this.password = password;
    }

    // No getter for the raw password anywhere in this class.
    public String getStrength() {
        int len = password.length();

        if (len < 6) {
            return "Weak";
        } else if (len < 10) {
            return "Medium";
        } else {
            return "Strong";
        }
    }

    public static void main(String[] args) {
        PasswordChecker pc = new PasswordChecker("abcd");
        System.out.println(pc.getStrength());   // Weak

        PasswordChecker pc2 = new PasswordChecker("abcdefgh"); // 8 chars
        System.out.println(pc2.getStrength());  // Medium

        PasswordChecker pc3 = new PasswordChecker("abcdefghij"); // 10 chars
        System.out.println(pc3.getStrength());  // Strong
    }
}