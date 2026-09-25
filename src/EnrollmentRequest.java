public class EnrollmentRequest
{
    public String requestId;

    public Student student;

    public Course course;

    public String createdAt;

    public Student getStudent()
    {
        return student;
    }

    public Course getCourse()
    {
        return course;
    }
}