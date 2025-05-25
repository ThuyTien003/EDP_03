package bai2_composite_3;

public class Main {
    public static void main(String[] args) {
        MenuItem newFile = new MenuItem("New File");
        MenuItem openFile = new MenuItem("Open File");

        SubMenu fileMenu = new SubMenu("File");
        fileMenu.add(newFile);
        fileMenu.add(openFile);

        MenuItem copy = new MenuItem("Copy");
        MenuItem paste = new MenuItem("Paste");

        SubMenu editMenu = new SubMenu("Edit");
        editMenu.add(copy);
        editMenu.add(paste);

        SubMenu toolsMenu = new SubMenu("Tools");
        toolsMenu.add(new MenuItem("Options"));

        SubMenu mainMenu = new SubMenu("Main Menu");
        mainMenu.add(fileMenu);
        mainMenu.add(editMenu);
        mainMenu.add(toolsMenu);

        mainMenu.show("");
    }
}

