//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        MyArrayToList myArrayToList = new MyArrayToList();
        myArrayToList.conversion(new String[]{"xyz", "abc", "xox"});
        myArrayToList.replacement(2);
        myArrayToList.remove();
        myArrayToList.toString();
    }
}