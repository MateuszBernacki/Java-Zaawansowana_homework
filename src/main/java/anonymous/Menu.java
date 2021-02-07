package anonymous;

public class Menu {
    final MenuItem[] menuItems;

    public Menu(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }
    public void print(){
        for (MenuItem item : menuItems) {
            System.out.println(item.NUMBER + " " + item.LABEL);
        }
    }
    public void process(int number){
        for (MenuItem item :
                menuItems) {
            if (item.getNUMBER() == number){
                System.out.println("Wybrano polecenie: "+ item.LABEL);
            }
        }
    }
}
