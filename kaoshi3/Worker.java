package kaoshi3;

/**
 *
 */
public class Worker {
    public int id;
    public String name;
    public String marry;
    public String system;
    public String experience;
    public int age;

    public Worker(int id, String name, String marry, String system, String experience, int age) {
        this.id = id;
        this.name = name;
        this.marry = marry;
        this.system = system;
        this.experience = experience;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMarry() {
        return marry;
    }

    public void setMarry(String marry) {
        this.marry = marry;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marry='" + marry + '\'' +
                ", system='" + system + '\'' +
                ", experience='" + experience + '\'' +
                ", age=" + age +
                '}';
    }
}
