package passwordChecker;


public class PasswordChecker {
    private PasswordChecker() {
    }

    private static PasswordChecker passwordChecker;
    private int minLength = -1;
    private int maxRepeats = -1;

    public void setMinLength(int minLength) {
        if (minLength < 0) throw new IllegalArgumentException("unavailable min length");
        else this.minLength = minLength;
    }

    public void setMaxRepeats(int maxRepeats) {
        if (maxRepeats <= 0) throw new IllegalArgumentException("unavailable max repeats");
        else this.maxRepeats = maxRepeats;
    }

    public boolean verify(String password) {
        if (minLength == -1 || maxRepeats == -1)
            throw new IllegalStateException("minLength or maxRepeats not available");
        if (password.length() < minLength) return false;

        char tempChar = 0;
        int tempRepeats = 0;
        for (int i = 0; i < password.length(); i++) {
            if (i == 0) {
                tempChar = password.charAt(i);
                tempRepeats = 1;
                continue;
            }
            char currentChar = password.charAt(i);
            if (currentChar == tempChar) {
                if (++tempRepeats > maxRepeats) return false;
            } else {
                tempRepeats = 1;
            }
            tempChar = currentChar;
        }

        return true;
    }

    public static PasswordChecker getPasswordChecker() {
        if (passwordChecker == null)
            passwordChecker = new PasswordChecker();
        return passwordChecker;
    }
}