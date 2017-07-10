package info.cafeda.jdbutcher.sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import info.cafeda.jdbutcher.model.DataItem;

/**
 * Created by Vu Nguyen on 7/10/2017.
 */

public class DataFeeder {
    public static List<DataItem> dataItemList;
    public static Map<String,DataItem> dataItemMap;
    public static List<String> dataRangeList;
    public static List<String> tradingHours;
    static {
        dataItemList = new ArrayList<>();
        dataItemMap = new HashMap<>();
        addItem(new DataItem(null,"Chicken Breast Fillet","Chicken",7.99,null));
        addItem(new DataItem(null,"Chicken Maryland Fillet","Chicken",7.99,null));
        addItem(new DataItem(null,"Chicken Drumsticks","Chicken",3.49,null));
        addItem(new DataItem(null,"Chicken Wings","Chicken",1.99,null));

        dataRangeList = new ArrayList<>();
        dataRangeList.add("Chicken");
        dataRangeList.add("Beef");
        dataRangeList.add("Pork");
        dataRangeList.add("Lamb");
        dataRangeList.add("Goat");

        tradingHours =new ArrayList<>();
        tradingHours.add("Tuesday:         7:00am - 4:30pm");
        tradingHours.add("Wednesday:   7:00am - 4:30pm");
        tradingHours.add("Thursday:       7:00am - 4:30pm");
        tradingHours.add("Friday:             7:00am - 4:30pm");
        tradingHours.add("Saturday:        7:30am - 4:30pm");
        tradingHours.add("Sunday:           8:30am - 4:30pm");
        tradingHours.add("Monday:          Closed");
    }

    private static void addItem(DataItem item){
        dataItemList.add(item);
        dataItemMap.put(item.getItemName(),item);
    }

}
