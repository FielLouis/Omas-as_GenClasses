package Map;

import java.util.ArrayList;

public class MyMap<T, U> {
    ArrayList<T> keys;
    ArrayList<U> values;

    public MyMap() {
        keys = new ArrayList<>();
        values = new ArrayList<>();
    }

    public void put(T key, U value) {
        //if key already exists
        if(keys.contains(key)) {
            values.set(keys.indexOf(key), value);
            return;
        }

        keys.add(key);
        values.add(value);
    }

    public U get(T key) {
        if(keys.contains(key)) {
            return values.get(keys.indexOf(key));
        }

        return null;
    }

    public U remove(T key) {
        if(keys.contains(key)) {
            int index = keys.indexOf(key);
            keys.remove(index);
            return values.remove(index);
        }

        return null;
    }

    //Just a helper method to print arraylists
    public void print() {
        if(keys.isEmpty()) {
            System.out.println("\nEMPTY");
            return;
        }

        System.out.println("\n========================================================================================");
        System.out.println("Keys - Values: ");
        for(int i = 0; i < keys.size(); i++) {
            System.out.println(keys.get(i) + " -" + values.get(i));
        }
        System.out.print("========================================================================================\n");
    }
}
