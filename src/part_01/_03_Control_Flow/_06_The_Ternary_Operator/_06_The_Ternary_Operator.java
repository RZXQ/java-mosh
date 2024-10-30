package part_01._03_Control_Flow._06_The_Ternary_Operator;

public class _06_The_Ternary_Operator {
    
    public static void main(String[] args) {
        int income = 120_000;
        
        // ternary operator:
        String className = income > 100_000 ? "First" : "Economy";
        System.out.println(className);
    }
    
}
