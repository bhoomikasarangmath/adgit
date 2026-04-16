public class EasyJava{
    public static void main(String[] args) {
        
        // Check if input is passed from Jenkins
        if (args.length == 0) {
            System.out.println("No name provided. Using default name.");
            System.out.println("Hello DefaultUser");
        } else {
            String name = args[0];
            System.out.println("Hello " + name);
        }
    }
}
