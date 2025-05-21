package rs.in.staleks.template.iguana.testdata;

import com.github.javafaker.Faker;
import rs.in.staleks.template.iguana.domain.User;

public class FakerUserData {

    public static User randomUser() {
        Faker faker = new Faker();
        return User.of(faker.number().randomNumber(), faker.name().username(), faker.internet().emailAddress());
    }

}
