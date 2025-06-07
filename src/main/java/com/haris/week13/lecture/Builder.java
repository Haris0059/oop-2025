package com.haris.week13.lecture;

import java.util.Date;

class Builder {
    // Use it only when constructor has more variables than you have fingers!
    public static void main(String[] args) {
        User haris = new User.UserBuilder(1)
                .setName("Haris")
                .setSurname("Skeledzija")
                .setDateOfBirth(new Date(105,03,23))
                .setHasSister()
                .build();

        System.out.println(haris);
    }
}

class User {
    private int id;
    private String name;
    private String surname;
    private Date dateOfBirth;
    private boolean hasBrother;
    private boolean hasSister;

    public User(UserBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.surname = builder.surname;
        this.dateOfBirth = builder.dateOfBirth;
        this.hasBrother = builder.hasBrother;
        this.hasSister = builder.hasSister;
    }

    public String toString() {
        return  "id: " + this.id + ", full name: " + this.name + " " + this.surname + ", Date" + this.dateOfBirth;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean getHasBrother() {
        return hasBrother;
    }
    public void setHasBrother(boolean hasBrother) {
        this.hasBrother = hasBrother;
    }

    public boolean getHasSister() {
        return hasSister;
    }
    public void setHasSister(boolean hasSister) {
        this.hasSister = hasSister;
    }

    static class UserBuilder {
        private int id;
        private String name;
        private String surname;
        private Date dateOfBirth;
        private boolean hasBrother;
        private boolean hasSister;

        public UserBuilder(int id) {
            this.id = id;
        }

        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder setSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public UserBuilder setDateOfBirth(Date dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public UserBuilder setHasBrother() {
            this.hasBrother = true;
            return this;
        }

        public UserBuilder setHasSister() {
            this.hasSister = true;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}

