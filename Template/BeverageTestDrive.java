public class BeverageTestDrive {
    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();

        System.out.println("\nPreparing tea...");
        tea.prepareRecipe();

        System.out.println("\nPreparing coffee...");
        coffee.prepareRecipe();
    }
}