
import java.util.*;

public class _10_2_groupAnagrams {
    public void groupAnagrams(String[] strings){

    }

    void sort(String[] array){
        HashMapList<String, String> mapList = new HashMapList<String, String>();

        for (String s : array){
            String key = sortChars(s);
            mapList.put(key, s);
        }

        int index = 0;
        for (String key : mapList.keySet()){
            ArrayList<String> list = mapList.get(key);
            for (String t : list){
                array[index] = t;
                index++;
            }
        }
    }

    String sortChars(String s){
        char[] content = s.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }
}
