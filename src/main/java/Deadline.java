/**
 * Handles a task with a deadline
 */
public class Deadline extends Task {
    protected String datetime;

    public Deadline(String description, String by) {
        super(description);
        datetime = by;
    }

    @Override
    public String toString() {
        return String.format("[D]%s (by: %s)", super.toString(), datetime);
    }
}