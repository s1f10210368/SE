public class NameCard {
    final String familyName;
    final String firstName;
    final int id;
    static int count = 1;

    NameCard(String firstName, String familyName) {
        this.familyName = familyName;
        this.firstName = firstName;
        this.id = count++;
    }

    String getLabel() {
        return String.format("No. %d: %s %s", id, firstName, familyName);
    }
}
