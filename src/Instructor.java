import java.util.List;

public class Instructor extends User
{
    @Override
    public String getRoleName()
    {
        return "Instructor";
    }

    public void sendAnnouncement(Course course, String message, NotificationService service)
    {

    }

    public List<Course> coursesTaught;

    public void assignTo(Course course)
    {

    }

    public void unassignFrom(Course course)
    {

    }

    public List<Course> getTeachingLoad()
    {
        return coursesTaught;
    }
}
