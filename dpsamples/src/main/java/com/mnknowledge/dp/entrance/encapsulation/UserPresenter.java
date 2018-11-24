package com.mnknowledge.dp.entrance.encapsulation;

import java.util.List;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class UserPresenter {

    public static void main(String[] args) {
        final String[] FIRST_NAME = {"Petko", "Bjarne", "Robert", "Martin"};
        final String[] LAST_NAME = {"Ivanov", "Stroustrup", "Martin", "Folwer"};
        final String[] EMAIL = {"petko.ivanov@gmail.com", "stroustrup@gmail.com", "ruby@unclebob.com",
                "uml@martifolwer.com"};
        final IntFunction<User> createUserFn = index -> {
            final User user = new User();
            user.firstName = FIRST_NAME[index];
            user.lastName = LAST_NAME[index];
            user.email = EMAIL[index];
            return user;
        };
        final IntFunction<EncapsulatedUser> createEncUserFn = index -> {
            final EncapsulatedUser user = new EncapsulatedUser();
            user.setFirstName(FIRST_NAME[index]);
            user.setLastName(LAST_NAME[index]);
            user.setEmail(EMAIL[index]);
            return user;
        };
        final UserPresenter presenter = new UserPresenter();
        final List<User> users = presenter.getUsers(FIRST_NAME, createUserFn);
        final List<EncapsulatedUser> encapsulatedUsers = presenter.getUsers(FIRST_NAME, createEncUserFn);
        presenter.printUsers(users);
        presenter.print(encapsulatedUsers);
    }

    /**
     * Prints user's full name & email.
     */
    public void printUsers(List<User> users) {
        String fullName;
        String email;
        StringBuffer output = new StringBuffer("Users are:\n");
        for (User user : users) {
            fullName = user.firstName + " " + user.lastName;
            email = user.email;
            output.append(fullName).append(" -> ").append(email).append("\n");
        }
        System.out.println(output);
    }

    public <T> void print(List<T> objects) {
        final StringBuffer output = new StringBuffer("Objects are:\n");
        for (Object object : objects) {
            output.append(object).append("\n");
        }
        System.out.println(output);
    }

    public <T> List<T> getUsers(final String[] firstNames, IntFunction<T> createUserFn) {
        return IntStream.range(0, firstNames.length).mapToObj(createUserFn).collect(Collectors.toList());
    }
}
