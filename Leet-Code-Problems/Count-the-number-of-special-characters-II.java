class Solution {
    public int numberOfSpecialChars(String word) {
        int[] lower=new int[26];
        int[] upper=new int[26];
        for(int i=0; i<26; i++){
            lower[i] = -1;
            upper[i]= -1;

        }
        for(int i=0; i<word.length();i++){
            char ch=word.charAt(i);
            if(ch>='a' && ch<='z'){
                lower[ch - 'a']=i;
            }
            else if(ch>='A' && ch<='Z'){
                if(upper[ch-'A']==-1){
                upper[ch - 'A']=i;
            }
            }
        }
        int count=0;
        for(int i=0; i<26; i++){
            if(lower[i]!=-1 && upper[i]!=-1 && lower[i] < upper[i]){
                count++;
            }
        }
        return count;
    }
}
