package com.springapp.algorithm;

/**
 * 数据类
 * Created by zhouzhenjiang on 2016/8/30.
 */
public class Name implements Comparable<Name> {

    private String firstName;

    private String lastName;

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public int compareTo(Name o) {
        int result = this.firstName.compareTo(o.getFirstName());

        return  result == 0?this.lastName.compareTo(o.getLastName()):result;
    }

    @Override
    public String toString() {
        return "Name{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
