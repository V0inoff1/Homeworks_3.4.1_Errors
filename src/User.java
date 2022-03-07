public class User {
    String classUser;
    String login;
    String password;
    String email;
    int age;

    public User(String login, String email, String password, int age) { // создаем метод и описываем и User с использованием полей ( создаем конструктор)
        this.login = login; // после вызова поля login из метода Main записать login в поле login текущего класса (this.login)
        this.email = email;
        this.password = password;
        this.age = age;
    }

    public String getLogin() { // создали метод getLogin
        return login; // возвращаем логин
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }

}
