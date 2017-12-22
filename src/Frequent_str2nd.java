import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;

public class Frequent_str2nd {
    public static void main (String[] args) {
        String[] a = {"aaa", "bbb", "ccc", "bbb", "aaa", "aaa"};
        Map<String, Integer> m = new HashMap<String, Integer>();

        for(int i=0;i<a.length;i++){
            if(!m.containsKey(a[i])){
                m.put(a[i], 1);

            }
            else{
                m.put(a[i], m.get(a[i])+1);
            }
        }

        Set<Entry<String, Integer>> set = m.entrySet();
        List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>(){
            public int compare(Map.Entry<String, Integer> a1, Map.Entry<String, Integer> a2) {
                int x = (a1.getValue()).compareTo(a2.getValue());
                if(x > 0)
                    return 1;
                else if(x < 0)
                    return -1;
                else
                    return 0;
            }
        });
//     for(String s : m.keySet()){}
//       System.out.println(s+" "+m.get(s));
        int c=1;

        for(Map.Entry<String, Integer> entry : list){
            if(c==2){
                System.out.println(entry.getKey());
                break;
            }
            c++;
        }
    }
}
