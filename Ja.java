public class Ja{
    public static void ja(String[] args){
            Character c1 = new Character("Bob", 23);
            c1.numbers();
    }
}

class Character{
    private String nick;
    private int age;
    private static int countPerson;

    public Character(String nick, int age){
        this.nick = nick;
        this.age = age;
        countPerson++;
    }
    public void numbers(){
        System.out.println("Numbers of players " + countPerson);
    }
}