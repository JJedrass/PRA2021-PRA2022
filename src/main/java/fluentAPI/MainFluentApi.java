package fluentAPI;

import fluentAPI.interfaces.Title;
import fluentAPI.model.Person;
import fluentAPI.model.PersonBuilder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class MainFluentApi {

    public static void main(String[] args) {

        Person person = new PersonBuilder()
                .withName("Jan")
                .withTitle(Title.STUDENT)
                .build();

        Person person1 = new PersonBuilder()
                .withName("Asia")
                .withTitle(Title.STUDENT)
                .build();

        Person person2 = new PersonBuilder()
                .withName("Zosia")
                .withTitle(Title.MGR)
                .build();

        person
                .addFriend(person1)
                .addFriend(person2);

//        person.sayHelloToFriends();

        //Function<List<Person>, List<Person>> cleanFriends = friends -> new ArrayList<>();



        person.processFriends(friends -> {friends.clear() ;
                                return Collections.singletonList(person1);}).sayHelloToFriends();
        person.sayHelloToFriends();

        Function<List<Person>, Person> picker = friends -> {
            return friends.get(0);
        };

        person.chooseBestFriend(picker).print();

        //Package-private constructor is not accessible here, we must use the builder:
        //Person p = new Person("a", Title.PROF);

        // Todo
    }
}