public class PancakeHouseMenu implements Menu {
    ArrayList menuItems;

    public PancakeHouseMenu(ArrayList menuItems) {
        this.menuItems = menuItems;
    }

    public Iterator createIterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }
}