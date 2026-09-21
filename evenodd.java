import java.util.Scanner;
public class evenodd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements of the array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            if(arr[i]%2==0){
                System.out.println(arr[i]+" is even");
            }
            else{
                System.out.println(arr[i]+" is odd");
            }
        }
    }
}