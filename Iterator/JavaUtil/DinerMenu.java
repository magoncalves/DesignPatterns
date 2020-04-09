public class DinerMenu implements Menu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    //

    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}