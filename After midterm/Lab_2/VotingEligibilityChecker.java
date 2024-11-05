//id : 22234103166
class UnderageException extends Exception {
    public UnderageException(String message) {
        super(message);
    }
}

public class VotingEligibilityChecker {
    public static void checkEligibility(int age) throws UnderageException {
        if (age < 18) {
            throw new UnderageException("Age is less than 18. Not eligible to vote.");
        }
        System.out.println("Eligible to vote.");
    }

    public static void main(String[] args) {
        try {
            checkEligibility(16);
        } catch (UnderageException e) {
            System.out.println(e.getMessage());
        }
    }
}
