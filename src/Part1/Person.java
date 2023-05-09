package Part1;

public class Person implements Comparable<Person>{
    private int birthYear;
    public Person(int birthYear){
        this.birthYear = birthYear;
    }
    @Override
    public int compareTo(Person p){
        return Integer.compare(this.birthYear, p.birthYear);
    }
}
