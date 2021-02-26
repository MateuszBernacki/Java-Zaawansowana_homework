package homework.task13;

import java.util.List;

public class Menu {
    final List<MenuItem> menuItems;

    public Menu(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public void print(){
        for (MenuItem item : menuItems) {
            System.out.println(item.number+". "+item.label);
        }
    }
    public void process(int number){
        for (MenuItem item : menuItems) {
            if(item.getNumber() == number){
                item.process();
            }
        }
    }
}
