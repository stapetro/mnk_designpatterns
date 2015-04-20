package com.mnknowledge.dp.entrance.encapsulation;

public class EncapsulatedUser {

    private String firstName;
    private String lastName;
    private String email;

    private String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String getFullName() {
        return getFirstName() + " " + getLastName();
    }

    @Override
    public String toString() {
        return "EncapsulatedUser [email=" + getEmail() + ", fullName=" + getFullName() + "]";
    }

}
