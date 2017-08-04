package com.lessons;

public class Main {

    public static void main(String[] args) {

        User user1 = new User();

        user1.setLogin("Politik");
        user1.setPassword("0000");
        user1.setName("Vanya");
        user1.setEmail("vanyapolitanskiy@gmail.com");
        user1.setAge(17);

        System.out.println("Логин : " + user1.getLogin() + "\nПароль : " + user1.getPassword() +
                "\nИмя : " + user1.getName() + "\nEmail : " + user1.getEmail() +
                "\nВозраст : " + user1.getAge());

        System.out.println("");


        User user2 = new User("MRX", "1111", "krytoiked80@gmail.com", "Default", 30);


        user2.show();
        System.out.println("");

        Cat mur = new Cat("mur", "white", 4, "Vanya", "Odessa", "Fish");
        mur.pass();
        System.out.println("\n");
        Cat Nika = new Cat("Nika", "Gray", "Meat");
        Nika.cat();
    }
}
