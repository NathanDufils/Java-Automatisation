public class Addition {
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Addition addition = new Addition();
        int result = addition.add(5, 3);
        System.out.println("The sum is: " + result);
    }
}