package ten.practise;

import java.util.Objects;

public class Person {
    public String name;public String scores;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScores() {
        return scores;
    }

    public void setScores(String scores) {
        this.scores = scores;
    }

    public Person() {
    }

    public Person(String name, String scores) {
        this.name = name;
        this.scores = scores;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", scores='" + scores + '\'' +
                '}';
    }

//    @Override
//    public boolean equals(String  o) {
//
//
//
//
//    }

    @Override
    public int hashCode() {
        return Objects.hash(name, scores);
    }
}
