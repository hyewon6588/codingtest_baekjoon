import java.io.*;
import java.util.HashMap;


public class Main{
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s;
        int max=0;
        char maxKey='?';
        HashMap<Character,Integer> map=new HashMap<>();


        s=br.readLine();
        s=s.toUpperCase();



        for(int i=0;i<s.length();i++){
            if(!map.keySet().contains(s.charAt(i))){
                map.put(s.charAt(i),1);
            }else{
                int cnt=map.get(s.charAt(i));
                cnt++;
                map.put(s.charAt(i),cnt);
            }
        }

        for(char key:map.keySet()){
            if(map.get(key)>max){
                maxKey=key;
                max=map.get(key);
            }else if(map.get(key)==max){
                maxKey='?';
            }
        }

        System.out.println(maxKey);
    }
}
