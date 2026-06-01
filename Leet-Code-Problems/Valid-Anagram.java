class Solution {
    public boolean isAnagram(String s, String t) {
        int i=0;
        int j=s.length()-1;
        int k=0;
        int l=t.length()-1;
        if(s.length()!=t.length()){
            return false;
        }
        char[] a=s.toCharArray();
        char[] b=t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        while(i<=j && k<=l){
            if(a[i]!=b[i] || a[j]!=b[j]){
                return false;
            }
            i++;
            j--;
            k++;
            l--;
        }
        return true;
        }
        
    }
