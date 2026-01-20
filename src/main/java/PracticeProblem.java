public class PracticeProblem {

    public static void main(String[] args) {
    }

    // --- Question 1: validateAge ---
    /**
     * Validates age within a specific range.
     * @throws IllegalArgumentException for negative or unrealistic ages.
     */
    public static boolean validateAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        if (age > 150) {
            throw new IllegalArgumentException("Age must be realistic");
        }
        return true;
    }

    // --- Question 2: withdraw ---
    /**
     * Calculates new balance after withdrawal.
     * @throws IllegalArgumentException for invalid amounts.
     * @throws IllegalStateException for insufficient funds.
     */
    public static double withdraw(double amount, double balance) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
        if (balance - amount < 0) {
            throw new IllegalStateException("Insufficient funds");
        }
        return balance - amount;
    }

    // --- Question 3: getElement ---
    /**
     * Retrieves an element from an array safely.
     * @throws NullPointerException if array is null.
     * @throws IndexOutOfBoundsException if index is invalid.
     */
    public static int getElement(int[] array, int index) {
        if (array == null) {
            throw new NullPointerException("Array cannot be null");
        }
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
        }
        return array[index];
    }

    // --- Question 4: validateEmail ---
    /**
     * Validates and trims an email address.
     * @throws IllegalArgumentException for null, empty, or malformed emails.
     */
    public static String validateEmail(String email) {
        if (email == null || email.trim().isEmpty()) {
            throw new IllegalArgumentException("Email cannot be empty");
        }

        int atIndex = email.indexOf('@');
        if (atIndex == -1) {
            throw new IllegalArgumentException("Invalid email format");
        }

        int dotIndex = email.indexOf('.', atIndex);
        if (dotIndex == -1) {
            throw new IllegalArgumentException("Invalid email format");
        }

        return email.trim();
    }

    // Empty hooks for your previous structure if needed
    public static void q1() {}
    public static void q2() {}
    public static void q3() {}
    public static void q4() {}
    public static void q5() {}
}
