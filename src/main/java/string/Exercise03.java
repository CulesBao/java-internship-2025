package string;

public class Exercise03 {
    public boolean isRepeatBySubstring(final String s){
        if(s == null || s.length() == 0) return false;
        String doubled = s + s;
        String modified = doubled.substring(1, doubled.length() - 1);
        return modified.contains(s);
    }
}
