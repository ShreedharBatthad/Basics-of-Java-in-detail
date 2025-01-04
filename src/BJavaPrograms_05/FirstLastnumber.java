package BJavaPrograms_05;

public class FirstLastnumber
{
    public static void main(String[] args)
    {
        int[] numbers = {10, 20, 30, 40, 50};

        // Check if the array is not empty
        if (numbers.length > 0) {
            int firstElement = numbers[0]; // First element
            int lastElement = numbers[numbers.length - 1]; // Last element

            // Display the results
            System.out.println("First element: " + firstElement);
            System.out.println("Last element: " + lastElement);
        } else {
            System.out.println("The array is empty.");
        }
    }
}
