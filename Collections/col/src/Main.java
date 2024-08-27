import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        //ArrayList
        ArrayList<String> names = new ArrayList<>();
        names.add("Jacob");
        names.add("Steven");
        names.add("Jennefer");

        for(String name : names){
            System.out.println(name);
        }
        //ArrayList Methods
        //remove member
        names.remove("Steven");
        //Add member
        names.add("Kyle");
        //get()
        String element1 = names.get(1); //If we have to indicate(belirtmek) we can use this method.
        String element2 = names.getFirst(); //Or we can directly call this method for first element
        System.out.printf("%s is %s \n", element1, element2);
        //set() Indicated index member change
        String element3 = names.set(2,"Turbo");
        //size() Returns number of elements
        int element4 = names.size();
        //clear() Clears all elements.
         names.clear();
         //isEmpty() Returns List is empty or what
        names.isEmpty();
        //Contains
        names.contains("Turbo");
        //indexof Returns first element of List
        names.indexOf("Turbo"); // -1 if its not exist
        //lastIndex
        names.lastIndexOf("Kyle"); //-1 if its not exist.




    }
}