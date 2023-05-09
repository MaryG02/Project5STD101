package Part1;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person(2000);
        Person p2 = new Person(1999);
        Person p3 = new Person(1989);
        Person p4 = new Person(2000);
        int res1 = p1.compareTo(p2);
        int res2 = p3.compareTo(p2);
        int res3 = p1.compareTo(p4);
        System.out.println(" Program returns "+res1+" so p1 is bigger than p2");
        System.out.println(" Program returns "+res2+" so p3 is less than p2");
        System.out.println(" Program returns "+res3+" so p1 is equal to p4");

    }
}
