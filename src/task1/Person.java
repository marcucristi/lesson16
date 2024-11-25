package task1;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Person implements Comparable<Person> {

     private String name;
     private Integer age;


     public Person(String name, Integer age) {
             this.name = name;
             this.age = age;
     }


     public String toString() {
             return "Nume: " + name + ", varsta: " + age + ".";
     }


     public boolean equals(Object nobj) {
             if (this == nobj) return true;
             if (nobj == null || getClass() != nobj.getClass()) return false;
             Person nuper = (Person) nobj;
             return age == nuper.age && Objects.equals(name, nuper.name);
     }


     public int hashCode() {
             return Objects.hash(name, age);
     }

     public int compareTo(Person other) {
             int result = this.age.compareTo(other.age);
             if (result !=0) {
                     return result;
             }
             return this.name.compareTo(other.name);
     }


     public static void main(String[] args) {

            TreeSet<Person> set = new TreeSet<>();

            set.add(new Person("Nicolae", 34));
            set.add(new Person("Andreo", 67));
            set.add(new Person("Veverita", 87));
            set.add(new Person("Artur", 59));
            set.add(new Person("Angela", 62));

            System.out.println("Ordonate");
            for (Person p : set) {
                System.out.println(p);
            }

         System.out.println("\nPersoane cu varsta mai mare de 60:");
            for (Person p : set) {
                if (p.age > 60){
                    System.out.println(p);
                }
            }

         HashSet<Person> sset = new HashSet<>();

         sset.add(new Person("Nicolae", 34));
         sset.add(new Person("Andreo", 67));
         sset.add(new Person("Veverita", 87));
         sset.add(new Person("Artur", 59));
         sset.add(new Person("Angela", 62));

         System.out.println("\n" + sset);
     }
}
