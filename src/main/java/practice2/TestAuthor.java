package practice2;

/** Практическая 2, задание 1: проверка всех методов класса {@link Author}. */
public class TestAuthor {

    public static void main(String[] args) {
        Author author = new Author("Шапаренко Ф. А.", "shaparenko.f.a@edu.mirea.ru", 'm');

        System.out.println("toString():  " + author);
        System.out.println("getName():   " + author.getName());
        System.out.println("getEmail():  " + author.getEmail());
        System.out.println("getGender(): " + author.getGender());

        author.setEmail("f.shaparenko@example.com");
        System.out.println("после setEmail(): " + author);
    }
}
