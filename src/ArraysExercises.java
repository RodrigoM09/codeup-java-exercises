import java.util.Scanner;

public class ArraysExercises {

    public static void main(String[] args) {
           Person john = new Person("John");
           Person rodrigo = new Person ("Rodrigo");
           Person javier = new Person("Javier");
           Person[] persons = new Person[] {john, rodrigo, javier};

            for(int i =0; i < persons.length; i++){
                System.out.printf("%s%n", persons[i].getName());
            }
            Person [] newArray = addPerson(persons, new Person("Billy"));
            for(Person person : newArray){
                System.out.println(person.getName());
            }
        System.out.println(newArray);
    }
    public static Person[] addPerson(Person[] persons, Person person) {
        Person[] newPersonsArray = new Person[persons.length + 1];
        for(int i =0; i < persons.length; i++){
            newPersonsArray[i] = persons[i];
        }
        newPersonsArray[newPersonsArray.length - 1] = person;
        return newPersonsArray;
        }
    }
