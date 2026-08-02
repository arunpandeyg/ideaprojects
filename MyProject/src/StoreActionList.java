

import java.util.ArrayList;

public class StoreActionList {
    private ArrayList<String> storeList = new ArrayList<>();
    public void addStoreItem(String Item){
        storeList.add(Item);
    }
    public void printStoreList(){
        System.out.println("You have "+storeList.size() +" " +"items in Your List");
        for (int i = 0; i < storeList.size(); i++) {
            System.out.println((i+1)+ " " +storeList.get(i));

        }
    }
    public void modifyStoreList(int position, String newItem){
        storeList.set(position, newItem);
        System.out.println("Store Item " +(position+1) + "has been modified ");
    }
    public void removeStoreItem(int position){
        String theItem = storeList.get(position);
        storeList.remove(position);
    }
    public String findItem (String searchItem) {
        int position = storeList.indexOf(searchItem);
        if(position >=0) {
            return storeList.get(position);
        }
        return null;
    }

}
