package com.mnknowledge.dp.entrance.encapsulation;

import java.util.ArrayList;
import java.util.Collection;

public class UserPresenter {

    public static void main(String[] args) {
        final String[] FIRST_NAME = { "Petko", "Bjarne", "Robert", "Martin" };
        final String[] LAST_NAME = { "Ivanov", "Stroustrup", "Martin", "Folwer" };
        final String[] EMAIL = { "petko.ivanov@gmail.com", "stroustrup@gmail.com", "ruby@unclebob.com",
                "uml@martifolwer.com" };
        UserPresenter presenter = new UserPresenter();
        Collection<User> users = presenter.getUsers(FIRST_NAME, LAST_NAME, EMAIL);
        Collection<Object> encapsulatedUsers = presenter.getEncapsulatedUsers(FIRST_NAME, LAST_NAME, EMAIL);
        presenter.printUsers(users);
        presenter.print(encapsulatedUsers);
    }

    /**
     * Prints user's full name & email.
     */
    public void printUsers(Collection<User> users) {
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

    public void print(Collection<Object> objects) {
        StringBuffer output = new StringBuffer("Objects are:\n");
        for (Object object : objects) {
            output.append(object).append("\n");
        }
        System.out.println(output);
    }

    public Collection<User> getUsers(final String[] FIRST_NAME, final String[] LAST_NAME, final String[] EMAIL) {
        Collection<User> users = new ArrayList<User>();
        User user;
        for (int index = 0; index < FIRST_NAME.length; index++) {
            user = new User();
            user.firstName = FIRST_NAME[index];
            user.lastName = LAST_NAME[index];
            user.email = EMAIL[index];
            users.add(user);
        }
        return users;
    }

    public Collection<Object> getEncapsulatedUsers(final String[] FIRST_NAME, final String[] LAST_NAME,
            final String[] EMAIL) {
        Collection<Object> users = new ArrayList<>();
        EncapsulatedUser user;
        for (int index = 0; index < FIRST_NAME.length; index++) {
            user = new EncapsulatedUser();
            user.setFirstName(FIRST_NAME[index]);
            user.setLastName(LAST_NAME[index]);
            user.setEmail(EMAIL[index]);
            users.add(user);
        }
        return users;
    }
}
