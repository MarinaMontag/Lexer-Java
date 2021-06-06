package ua.knu.montag;
public class Main {
    public static void main(String[] args) {
        String filePath1 = "ExtendedEuclidAlgorithm.java";
        String filePath2 = "Hello.java";
        Lexer lexer = new Lexer(filePath1);
        lexer.parse();
    }
}
