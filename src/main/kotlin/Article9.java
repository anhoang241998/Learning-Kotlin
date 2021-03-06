import java.util.Objects;

public class Article9 {

    private String name;
    private String email;
    private int age;

    public Article9() {
    }

    public Article9(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Article9{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Article9)) return false;
        Article9 article = (Article9) o;
        return getAge() == article.getAge() &&
                Objects.equals(getName(), article.getName()) &&
                Objects.equals(getEmail(), article.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, age);
    }
}

