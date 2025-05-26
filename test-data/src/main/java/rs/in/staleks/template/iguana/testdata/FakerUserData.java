package rs.in.staleks.template.iguana.testdata;

import com.github.javafaker.Faker;
import rs.in.staleks.template.iguana.domain.management.Account;
import rs.in.staleks.template.iguana.domain.management.User;

public class FakerUserData {

    public static User randomUser() {
        Faker faker = new Faker();
        Account testAccount = Account.create("Dummy Name");
        return User.of(faker.number().randomNumber(), faker.name().username(), faker.internet().emailAddress(), testAccount);
    }

}
