import java.lang.reflect.InvocationHandler;

public class MatchMakingTestDrive {
    // instance variables

    public static void main(String[] args) {
        MatchMakingTestDrive test = new MatchMakingTestDrive();
        test.drive();
    }

    public MatchMakingTestDrive() {
        initializeDatabase();
    }

    public void drive() {
        PersonBean joe = getPersonFromDatabase("Joe Javabean");
        InvocationHandler ownerHandler = new OwnerInvocationHandler(joe);
        PersonBean ownerProxy = getProxy(joe, ownerHandler);
        System.out.println("Name is " + ownerProxy.getName());
        ownerProxy.setInterests("bowling, Go");
        try {
            ownerProxy.setHotOrNotRating(10);
        } catch (Exception e) {
            System.out.println("Can't set rating from owner proxy");
        }
        System.out.println("Rating is " + ownerProxy.getHotOrNotRating());

        InvocationHandler nonOwnerHandler = new NonOwnerInvocationHandler(joe);
        PersonBean nonOwnerProxy = getProxy(joe, nonOwnerHandler);
        System.out.println("Name is " + nonOwnerProxy.getName());
        nonOwnerProxy.setInterests("bowling, Go");
        try {
            nonOwnerProxy.setInterests("bowling, Go");
        } catch (Exception e) {
            System.out.println("Can't set interests from non owner proxy");
        }
        nonOwnerProxy.setHotOrNotRating(3);
        System.out.println("Rating set from non owner proxy");
        System.out.println("Rating is " + nonOwnerProxy.getHotOrNotRating());
    }

    PersonBean getProxy(PersonBean person, InvocationHandler handler) {
        return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(),
                person.getClass().getInterfaces(), handler);

    public void initializeDatabase() {
        // initialize database
    }

    PersonBean getPersonFromDatabase(String name) {
        // return PersonBeanImpl
    }
}