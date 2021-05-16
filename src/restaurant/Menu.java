package restaurant;

import java.util.ArrayList;

public class Menu extends MenuItem {
    private String menuName;

    public Menu(String inputMenuName)
    {
        this.menuName = inputMenuName;
    }

    public String toString(){
        return menuName;
    }

    public String getMenu()
    {
        return this.menuName;
    }

}
