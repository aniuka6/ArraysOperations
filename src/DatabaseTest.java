public class DatabaseTest {
    public static void main(String[] args) {
        PersonDatabase database = new PersonDatabase();
        database.add(new Person("Jan", "Kowalski", "543409504"));
        database.add(new Person("Ola", "Kot", "46636353636"));
        database.add(new Person("Wojtek", "Odrobina", "63656265"));
        database.add(new Person("Ania", "Kot", "43958343"));
        Person person = database.get(3);
        System.out.println(person);
        System.out.println(database);
        database.remove(new Person("Ania", "Kot", "43958343"));
        System.out.println();
        System.out.println(database);


    }
}