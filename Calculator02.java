package calculator02;

public class Calculator02 {
    
    public static void main(String[] args) {
        add(5,6);
        subtract(10,2);
        multiply(5,6);
        divide(10,2);
    }
    
    public static int add(int x, int y) {
        int total = x + y;
        System.out.println(total);
        
        return total;
    }
    
    public static int subtract(int x, int y) {
        int total = x - y;
        System.out.println(total);
        
        return total;
    }
        
    public static int multiply(int x, int y) {
        int total = x * y;
        System.out.println(total);
        
        return total;
    }
    
    public static int divide(int x, int y) {
        int total = x / y;
        System.out.println(total);
        
        return total;
    }
}