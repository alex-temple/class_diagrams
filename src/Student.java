import java.util.List;

public class Student extends User
{
    @Override
    public String getRoleName()
    {
        return "Student";
    }

    public List<Course> enrolledCourses;

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

