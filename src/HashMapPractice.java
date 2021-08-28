import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class HashMapPractice {

    public static void main(String[] args) {
        HashMap<String, String> capitalMap = new HashMap<String, String>();
        capitalMap.put("India", "New Delhi");
        capitalMap.put("Karnataka", "Bengaluru");
        capitalMap.put("Tamil Nadu", "Chennai");
        capitalMap.put("Kerala", "Thiruvananthapuram");
        capitalMap.put("Telangana", "Hyderabad");
        capitalMap.put("Andhra Pradesh", "Amaravati");
        capitalMap.put("J&k", "Srinagar");
        capitalMap.put("Punjab", "Chandigarh");
        capitalMap.put("Rajasthan", "Jaipur");
        capitalMap.put("Uttar Pradesh", "Lucknow");

//        System.out.println(capitalMap.get("India"));
//        System.out.println(capitalMap.get("Karnataka"));

//        for (Map.Entry<String, String> entry : capitalMap.entrySet())
//            System.out.println("Key = " + entry.getKey() +
//                    ", Value = " + entry.getValue());
//
        Iterator<String> it = capitalMap.keySet().iterator();
        while(it.hasNext()){

            String key = it.next();
            String value = capitalMap.get(key);
            System.out.println("key: " + key + "value: " + value);
        }



    }
}
