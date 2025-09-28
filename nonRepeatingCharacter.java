import java.util.*;
public class main{

    public static void main(String [] args){

        String str = "programming";

        Map<Character, Integer> map = new LinkedHashMap<>();

        for(char c :str.toCharArray())
        map.put(c , map.getOrDefault(c ,0) +1);
        System.out.println(map);
        for(var e :map.entrySet())
            if(e.getValue() == 1){
                System.out.println(e.getKey());     
            }

    }
}
