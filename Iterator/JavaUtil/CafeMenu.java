import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu implements Menu {
    Hashtable menuItems = new Hashtable();

    public CafeMenu() {
        // add items
    }

    public void addItem(String name, String description, boolean isVegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, isVegetarian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }

    public Iterator createIterator() {
        return menuItems.values().iterator();
    }
}