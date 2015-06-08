package exercises.java;

import java.util.HashMap;

/**
 * Created by hubert on 2015.06.06.
 * for java learning from http://tutorials.jenkov.com/
 */
public class Exercise5 {
    public static void main(String[] args) {
        DataObject[] dataObjects = new DataObject[5];

        DataObject dataObject = new DataObject();
        dataObject.count = 5;
        dataObject.code  = "friday";
        dataObjects[0] = dataObject;

        dataObject = new DataObject();
        dataObject.count = 7;
        dataObject.code  = "friday";
        dataObjects[1] = dataObject;

        dataObject = new DataObject();
        dataObject.count = 9;
        dataObject.code  = "saturday";
        dataObjects[2] = dataObject;

        dataObject = new DataObject();
        dataObject.count = 11;
        dataObject.code  = "saturday";
        dataObjects[3] = dataObject;

        dataObject = new DataObject();
        dataObject.count = 13;
        dataObject.code  = "saturday";
        dataObjects[4] = dataObject;

        HashMap<String, Integer> map = new HashMap<>();

        for(DataObject i: dataObjects){
            Integer sumForCode = map.get(i.code);
            if(sumForCode == null)
                sumForCode = 0;
            sumForCode = sumForCode + i.count;
            map.put(i.code, sumForCode);
        }
        for(String code : map.keySet()){
            System.out.println(code+" "+map.get(code));
        }

    }
}