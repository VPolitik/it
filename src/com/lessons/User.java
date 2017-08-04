package com.lessons;

public class User {
    //Поля : логин, пароль, Email, имя, возраст

    //Если поле помечено модификатором private , то перед названием поля, необходимо добавить m-
    //Ограничение доступа к полям класса.

    //Закрытые Поля класса
    private String mLogin; //login
    private String  mPassword;
    private String mEmail;
    private String mName;
    private int mAge;

    //Пользовательский конструктор
    //Если мы описываем пользовательский конструктор, то конструктор по-умолчанию,
    //Необходимо описать явно
    User(String login,
         String password,
         String email,
         String name,
         int age) {

        mLogin = login;
        mPassword = password;
        mEmail = email;
        mName = name;
        mAge = age;

    }

    //Конструктор по умолчанию. Инициализирует поля по-умолчанию
    User() {
        mLogin = null;
        mPassword = null;
        mEmail = null;
        mName = null;
        mAge = 0;
    }

    //Доступ к полям в ООп происходит с помощью методов доступа. set- и get- методы
    // Метод set- изменяет значение (для записи)
    //Метод get - возвращает значение (для чтения)

    String getLogin() {
        return mLogin;
    }

    void setLogin(String login){
        mLogin = login;
    }

    String getPassword (){
        return mPassword;
    }

    void setPassword (String password) {
        mPassword = password;
    }

    String getEmail() {return mEmail;}

    void setEmail(String email){
        mEmail = email;
    }

    String getName () {
        return mName;
    }

    void setName (String name) {
        mName = name;
    }

    int getAge () {
        return mAge;
    }

    void setAge (int age){
        if (age < 0 || age > 150)
            return;

        mAge = age;
    }

     void show () {
        System.out.println("Логин второго пользователя : " + mLogin + "\nПароль : " + mPassword +
        "\nИмя : " + mName + "\nEmail : " + mEmail +
        "\nВозраст : " + mAge);
    }
}
