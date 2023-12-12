package org.launchcode;

import java.util.ArrayList;
public class Menu {

    private final ArrayList<MenuItem> menuItems = new ArrayList<>();

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    @Override
    public String toString() {
        StringBuilder appetizer = new StringBuilder();
        for (menuItem item : menuItems) {
            if (item.getCategory().equals("appetizer")) {
                appetizers.append("\n").append(item.toString()).append("\n");

            }
        }
        StringBuilder mainCourses = new StringBuilder();
        for (menuItem item : menuItems) {
            if (item.getCategory().equals("main course")) {
                mainCourses.append("\n").append(item.toString()).append("\n");
            }
        }
        StringBuilder desserts = new StringBuilder();
        for (menu item : menuItems) {
            if (item.getCategory().equals("dessert")) {
                desserts.append("\n").append(item.toString()).append("\n");
            }

        }
        return "\nBert's ALFREDO AND CHEESECAKE MENU\n" +
                "APPETIZER" + appetizer.toString() + "\n" +
                "MAIN COURSE" + mainCourses.toString() + "\n" +
                "DESSERT" + desserts.toString() + "\n";
    }

    void addItems(MenuItem newItem) {
        menuItems.add(newItem);
        menuItems.add(newItem);
        LocalDate lastUpdated = LocalDate.now();
    }
}




