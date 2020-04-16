import java.rmi.Naming;

public class GumballMachineTestDrive {
    public static void main(String[] args) {
        int count = 0;

        if (args.length < 2) {
            System.out.println("GumballMachine <name> <inventory>");
            System.exit(1);
        }

        try {
            count = Integer.parseInt(args[1]);
            GumballMachine gumballMachine = new GumballMachine(args[0], count);

            Naming.rebind("//" + args[0] + "\gumballmachine", gumballMachine);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // GumballMonitor monitor = new GumballMonitor(gumballMachine);

        // System.out.println(gumballMachine);

        // gumballMachine.insertQuarter();
        // gumballMachine.trunCrank();

        // System.out.println(gumballMachine);

        // gumballMachine.insertQuarter();
        // gumballMachine.trunCrank();
        // gumballMachine.insertQuarter();
        // gumballMachine.trunCrank();

        // System.out.println(gumballMachine);

        // monitor.report();
    }
}