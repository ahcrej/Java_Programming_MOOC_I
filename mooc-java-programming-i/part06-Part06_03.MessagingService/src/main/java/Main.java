
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        Message letter = new Message("Bob", "Hello");
        Message letterTwo = new Message("John", "Bye");
        MessagingService post = new MessagingService();
        post.add(letter);
        post.add(letterTwo);
        System.out.println(post.getMessages());
    }
}
