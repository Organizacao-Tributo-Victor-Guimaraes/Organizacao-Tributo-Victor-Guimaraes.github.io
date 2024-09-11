public class Main {
    public static void main(String[] args) {
        InterpretadorSemantico interpreter = new InterpretadorSemantico();

        System.out.println(interpreter.interpret("45 mais 6"));
        System.out.println(interpreter.interpret("21,1 menos 4,1"));
        System.out.println(interpreter.interpret("147 divide 3"));
        System.out.println(interpreter.interpret("6 multiplica 8"));
    }
}