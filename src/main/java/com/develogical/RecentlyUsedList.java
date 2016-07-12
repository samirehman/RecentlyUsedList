package com.develogical;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ape16 on 12/07/2016.
 */
public class RecentlyUsedList {

    public List<String> itemList = new ArrayList<String>();


    public int countItem() {
        return itemList.size();
    }


    public void addItem(String i) {
        if (itemList.size() == 0){
            itemList.add(i);
        }
        else {
            List<String> copyList = new ArrayList<String>();
            copyList.add(i);
            for (int j = 0; j < itemList.size(); j++){
                if (i != itemList.get(j))
                copyList.add(itemList.get(j));
            }
            itemList = copyList;
        }


    }

    public String retrieveItem(int i) {
        return itemList.get(i);
    }
}
