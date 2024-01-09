package bigONotation;

public class Notations {

    public static void main(String[] args) {
        String[] array = new String[10000];
        for(int i = 0 ; i < array.length; i++) {
            array[i] = "Krishna";
        }

        //O(n) Notation --> Linear Time
        for(String a : array) {
            if(a.equalsIgnoreCase("Krishna"))
            System.out.println(a);
        }
    }
}
