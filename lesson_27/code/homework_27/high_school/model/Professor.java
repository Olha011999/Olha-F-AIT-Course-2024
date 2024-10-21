package homework_27.high_school.model;

import java.util.Objects;

public class Professor extends Person{

    private String subject;

    public Professor(int size, String name, int age, String subject) {
        super(size, name, age);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Professor professor)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(subject, professor.subject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), subject);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Professor{");
        sb.append("subject='").append(subject).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
