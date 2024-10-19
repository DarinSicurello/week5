
public class SpacedLogger implements Logger {
    
    public static void log(String message) {
        // Changes the characters
        char[] characters = message.toCharArray();
        
        // Iterate the loop for the each letter length
        for (int i = 0; i < characters.length; i++) {
            System.out.print(characters[i]);
            if (i < characters.length - 1) {
                System.out.print(" "); //SPACE
            }
        } 
    }
}
