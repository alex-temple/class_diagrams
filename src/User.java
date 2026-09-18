public abstract class User
{
    public String userId;

    public String name;

    public String email;

    public String getEmail() { return email; }

    public abstract String getRoleName();
}