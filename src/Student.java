import java.util.List;

public class Student extends User
{
    @Override
    public String getRoleName()
    {
        return "Student";
    }

    public List<Course> enrolledCourses;

    public EnrollmentRequest requestEnrollment(Course course)
    {
        return null;
    }

    public void enroll(Course course)
    {

    }

    public void drop(Course course)
    {

    }

    public List<Course> getSchedule()
    {
        return enrolledCourses;
    }
}

