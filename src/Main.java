import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UserNotFoundException, AccessDeniedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите логин");
        String login = scanner.nextLine();
        System.out.println("Введите пароль");
        String password = scanner.nextLine();

        User user = getUserByLoginAndPassword(login, password); //вызываем метод для проверки логина и пароля
        validateUser(user);
    }


    public static User[] getUsers() { // создаем метод, который должен возвращать список, по этому пишем User[], так как мы работаем с юзерами
        User user1 = new User("jhon", "jhon@gmail.com", "pass", 24);// todo в классе User создай конструктор для описания фетода ( функции)
        User user2 = new User("viktor", "viktor@gmail.com", "pass", 10);// todo в классе User создай конструктор для описания фетода ( функции)
        User user3 = new User("georg", "georg@gmail.com", "pass", 18);// todo в классе User создай конструктор для описания фетода ( функции)

        return new User[]{user1, user2, user3};// возвращаем наши созданные объекты в виде списка в User[]
    }
    public static User getUserByLoginAndPassword(String login, String password) throws UserNotFoundException{
        User[] users = getUsers();
        for (User user : users) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                return user;
            }
        }
        throw new UserNotFoundException("User not found");
    }
    public static void validateUser(User user) throws AccessDeniedException {
        if (user.getAge() < 18) {
            throw new AccessDeniedException("Вам нет 18 лет. Доступ запрещён.");
        } else {
            System.out.println("Доступ разрешён.");
        }
    }
}
