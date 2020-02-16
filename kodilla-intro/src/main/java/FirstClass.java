public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600,1200, 2018);
        Notebook heavyNotebook = new Notebook(2000, 2300, 2020);
        Notebook oldNotebook = new Notebook(1200, 850, 2005);
        System.out.println(notebook.weight + " " + notebook.price + " " +notebook.year);
        System.out.println(heavyNotebook.weight + " "+heavyNotebook.price+ " "+heavyNotebook.year);
        System.out.println(oldNotebook.weight + " "+oldNotebook.price+ " "+oldNotebook.year);
        notebook.checkPrice();
        heavyNotebook.checkPrice();
        oldNotebook.checkPrice();
        notebook.checkYear();
        heavyNotebook.checkYear();
        oldNotebook.checkYear();
        notebook.checkWeight();
        heavyNotebook.checkWeight();
        oldNotebook.checkWeight();



    }
}