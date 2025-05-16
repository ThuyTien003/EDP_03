package bai7;

public class App {
    private final Button button;
    private final Checkbox checkbox;
    private final Menu menu;
    private final Scrollbar scrollbar;

    public App(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
        menu = factory.createMenu();
        scrollbar = factory.createScrollbar();
    }

    public void render() {
        button.paint();
        checkbox.paint();
        menu.paint();
        scrollbar.paint();
    }
}


