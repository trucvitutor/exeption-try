public class demo {
    public static void main(String[] args) {
        User[] users=new User[3];
        System.out.println("demo");
        System.out.println("demo 3");
        try {
            System.out.println(users[2].getName());
        } catch (NullPointerException e) {
            System.out.println(e);
        }
        System.out.println("done");
    }
}
