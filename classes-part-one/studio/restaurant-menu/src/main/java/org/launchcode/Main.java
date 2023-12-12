package org.launchcode;

public class Main {

    public static void main(String[] args) {
        MenuItem item1 = new MenuItem("Chicken Alfredo", "Tasty Alfredo Sauce", 13.99, "main entree" );
        MenuItem item2 = new MenuItem("Garlic Bread sticks", "Garlic Butter over our fresh bread", 6.99, "appetizer");
        MenuItem item3 = new MenuItem("Choclate cheesecake", "Rich Choclate and it'll have you coming back for more cheesecake", 7.89, "dessert");
    }
    System.out.println(item1.isNew());
    System.out.println(item1);

    Menu menu = new Menu();

    menu.addItem(item1);
    menu.addItem(item2);
    menu.addItem(item3);

    System.out.println(menu);


}




