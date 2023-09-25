/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author J
 */
import java.util.ArrayList;

public class Room {

    private ArrayList<Person> room;

    public Room() {
        this.room = new ArrayList<>();
    }

    public void add(Person person) {
        this.room.add(person);
    }

    public boolean isEmpty() {
        if (this.room.isEmpty()) {
            return true;
        }
        return false;
    }

    public ArrayList<Person> getPersons() {
        return this.room;
    }

    public Person shortest() {
        if (this.room.isEmpty()) {
            return null;
        }

        Person returnPerson = this.room.get(0);

        for (Person person : this.room) {
            if (returnPerson.getHeight() > person.getHeight()) {
                returnPerson = person;
            }
        }
        return returnPerson;
    }

    public Person take() {
//        if (this.room.isEmpty()) {
//            return null;
//        }
//
//        Person returnPerson = this.room.get(0);
//        for (Person person : this.room) {
//            if (returnPerson.getHeight() > person.getHeight()) {
//                returnPerson = person;
//            }
//        }
//        int index = this.room.indexOf(returnPerson);
//        return this.room.remove(index);

        Person shortestPerson = shortest();
        this.room.remove(shortestPerson);
        return shortestPerson;
    }

}
