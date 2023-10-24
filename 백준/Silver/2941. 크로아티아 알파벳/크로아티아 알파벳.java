import java.io.*;



public class Main{
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s;
        int cnt=0;

        s=br.readLine();
        for(int i=0;i<=s.length()-1;i++){
            char c = s.charAt(i);

            if (c == 'c' && i < s.length() - 1) {
                if (s.charAt(i + 1) == '=' || s.charAt(i + 1) == '-') {
                    i += 1;
                }
                cnt++;
            } else if (c == 'd') {
                if (i + 2 < s.length() || i + 1 < s.length()) {
                    if (s.charAt(i + 1) == 'z' && i+2<s.length()) {
                        if (s.charAt(i + 2) == '=') {
                            i += 2;
                        }
                        cnt++;
                    } else if (s.charAt(i + 1) == '-') {
                        i += 1;
                        cnt++;
                    } else {
                        cnt++;
                    }
                } else {
                    cnt++;
                }
            } else if ((c == 'l' || c == 'n') && (i < s.length() - 1)) {
                if (s.charAt(i + 1) == 'j') {
                    i += 1;
                }
                cnt++;
            } else if ((c == 's' || c == 'z') && (i < s.length() - 1)) {
                if (s.charAt(i + 1) == '=') {
                    i += 1;
                }
                cnt++;
            } else {
                cnt++;
            }

        }

        System.out.println(cnt);
    }
}
