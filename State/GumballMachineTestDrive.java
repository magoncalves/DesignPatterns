public class GumballMachineTestDrive {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.trunCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.trunCrank();
        gumballMachine.insertQuarter();
        gumballMachine.trunCrank();

        System.out.println(gumballMachine);
    }
}