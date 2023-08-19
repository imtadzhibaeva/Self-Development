public class learnJava {
    public static void main(String[] args) {
        // Primitive data types = build-in Java
        // int a = 5;
        // char b = 'i';
        // Long c = 400;
        // double d = 3.2;

        // Non-primitive data types
        // String name = "Susan";
        // System.out.println(name.toLowerCase());

        String exclaim = addExplanationPoints("hot dogs");
        System.out.println(exclaim);
    }

    public static void addExplanationPoints(String s){
        System.out.println(s + "!");

    }
}