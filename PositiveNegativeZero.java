import java.util.Scanner;
class PositiveNegativeZero { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter size: "); 
        int n = sc.nextInt(); 
        int[] arr = new int[n]; 
        int positive = 0, negative = 0, zero = 0; 
        System.out.println("Enter elements:"); 
        for (int i = 0; i < n; i++) { 
            arr[i] = sc.nextInt(); 
            if (arr[i] > 0) 
                positive++; 
            else if (arr[i] < 0) 
                negative++; 
            else 
                zero++; 
        } 
        System.out.println("Positive = " + positive); 
        System.out.println("Negative = " + negative); 
        System.out.println("Zero = " + zero); 
    } 
} 