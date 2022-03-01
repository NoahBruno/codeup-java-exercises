import java.util.Arrays;
public class ArraysExercises {
//    public static Person[] addPerson(Person[] person, Person name) {
//        Person[] nextPerson = Arrays.copyOf(person,person.length+1);
//        nextPerson[nextPerson.length-1]= name;
//        return nextPerson;
//    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
        Person[] person = new Person[3];
        person[0] = new Person("noah");
        person[1] = new Person("mordecai");
        person[2] = new Person("rigby");
//        System.out.println(person[0].getName());
//        System.out.println(person[1].getName());
//        System.out.println(person[2].getName());

//        String[] person = {"noah", "mordecai", "rigby"};
//        for (int i = 0; i < person.length; i += 1){
//            System.out.println(person[i].getName());
//        }

//        Person[] nextPerson = addPerson(person, new Person("dexter"));
//        for (Person newGuy : nextPerson){
//            System.out.println(newGuy.getName());
//        }
    }
}
