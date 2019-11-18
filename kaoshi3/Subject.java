package kaoshi3;

/**
 *
 */
public class Subject {
    public int id;
    public String work;

    public Subject(int id, String work) {
        this.id = id;
        this.work = work;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", work='" + work + '\'' +
                '}';
    }
}
