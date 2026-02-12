public class Ej16 {
    public static void main(String[] args) {
        
    
        int[] vector1 = new int[10];
        for (int i = 0; i < vector1.length; i++) {
            vector1[i] = i;
        }
        for (int i = 0; i < vector1.length; i++) {
            System.out.print(vector1[i] + " ");
        }

        System.out.println("\n");

        int[] vector2 = new int[10];
        for (int j = 0; j < vector2.length; j++) {
            vector2[j] = j + 1;
        }
        for (int j = 0; j < vector2.length; j++) {
            System.out.print(vector2[j] + " ");
        }
        
        
        System.out.println("\n");
        
        
        
    }
}
