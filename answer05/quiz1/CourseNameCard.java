package quiz1;

public class CourseNameCard extends NameCard {
    private final String course;
    public CourseNameCard(String name, String course) {
        super(name);
        this.course = course;
    }

    public String getCourse() {
        return String.format("Course: %s", course);
    }
}
