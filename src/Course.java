import java.util.List;

public class Course
{
    public String courseId;

    public String title;

    public List<Student> students;

    public List<Instructor> instructors;

    public void addStudent(Student s)
    {

    }

    public void removeStudent(Student s)
    {

    }

    public void addInstructor(Instructor i)
    {

    }

    public void removeInstructor(Instructor i)
    {

    }

    public List<Student> getRoster()
    {
        return students;
    }

    public List<Module> modules;

    public void addModule(Module m)
    {

    }

    public void removeModule(Module m)
    {

    }

    public List<Module> getModules()
    {
        return modules;
    }
}
