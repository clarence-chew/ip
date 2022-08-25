package duke.task;

import duke.ParsedDateTime;

/**
 * Handles a task with a deadline.
 */
public class Deadline extends Task {
    protected ParsedDateTime datetime;

    /**
     * Creates a duke.tasks.Deadline object.
     * @param description Description of deadline.
     * @param by Time of deadline.
     */
    public Deadline(String description, String by) {
        this(description, by, false);
    }

    /**
     * Creates a duke.tasks.Deadline object.
     * @param description Description of deadline.
     * @param by Time of deadline.
     * @param done If the task is done.
     */
    public Deadline(String description, String by, boolean done) {
        super(description, done);
        datetime = new ParsedDateTime(by);
    }

    @Override
    public String toString() {
        return String.format("[D]%s (by: %s)", super.toString(), datetime.toString());
    }

    /**
     * Get a string array representation suitable for printing to files.
     * @return String array representation.
     */
    @Override
    public String[] getAsStringArray() {
        String[] data = super.getAsStringArray();
        return new String[]{ "Deadline", data[1], data[2], datetime.toString() };
    }
}
