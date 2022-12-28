package assignments.assignment06;

import java.time.LocalDate;

/**
 * Please refer to the material in Assignment #6
 */
public class CengStudent {

    private static final String DEPARTMENT = "Computer Engineering";

    private final String id;

    private final String fullName;

    private LocalDate birthDate;

    private int semester;

    public CengStudent(String id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    public String getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public boolean isBirthday() {
        if (birthDate != null) {
            LocalDate now = LocalDate.now();
            return now.getMonth() == birthDate.getMonth() && now.getDayOfMonth() == birthDate.getDayOfMonth();
        }
        else
            return false;
    }

    static String getDepartment() {
        return DEPARTMENT;
    }
}
