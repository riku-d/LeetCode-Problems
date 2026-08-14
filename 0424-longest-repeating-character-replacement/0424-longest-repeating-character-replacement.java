class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map = new HashMap<>();
        int l=0;
        int ml=0;
        int maxlen=0;
        for(int r=0;r<s.length();r++){
            map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);
            maxlen=Math.max(maxlen,map.get(s.charAt(r)));
            while(((r-l+1)-maxlen)>k){
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                l++;
            }
            ml=Math.max(ml,r-l+1);
        }
        return ml;
    }
}