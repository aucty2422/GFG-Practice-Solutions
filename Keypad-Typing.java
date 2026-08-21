/*
Problem: Keypad Typing
Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public String printNumber(String s) {
        
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if('a'<=ch && ch<='c') sb.append("2");
            else if('d'<=ch && ch<='f') sb.append("3");
            else if('g'<=ch && ch<='i') sb.append("4");
            else if('j'<=ch && ch<='l') sb.append("5");
            else if('m'<=ch && ch<='o') sb.append("6");
            else if('p'<=ch && ch<='s') sb.append("7");
            else if('t'<=ch && ch<='v') sb.append("8");
            else sb.append("9");
        }
        return sb.toString();
        
    }
}
