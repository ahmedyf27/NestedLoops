class NestedLoops {
    public static void main(String[] args) {

        System.out.print("Task 7:");
        System.out.println("\n");
        for (int i = 1; i <= 5; i++) { // Controls the amount of lines that there will be dots on
            for (int j = 1; j <= 5; j++) { //controls the amount of dots per line
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}