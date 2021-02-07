package uni.pld.masters.cli;

import uni.pld.masters.CliClient;

/**
 * 
 * Helper enum for possible action used in {@link CliClient}
 * 
 * @author nstoilov
 *
 */
public enum ActionEnum {

    PRINT_STUDENTS(1, "Print students"),
    ADD_STUDENT(2, "Add Student"),
    PRINT_UNIVERSITIES(3, "Print universities"),
    ADD_UNIVERSITY(4, "Add university"),
    PRINT_SPECIALITIES(5, "Print specialities"),
    ADD_SPECIALITY(6, "Add speciality");

    private int id;
    private String name;

    private ActionEnum(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public static ActionEnum valueById(int id) {
        for (ActionEnum action : values()) {
            if (action.getId() == id) {
                return action;
            }
        }

        throw new IllegalArgumentException("No action with id " + id);
    }

}
