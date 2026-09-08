class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map = new HashMap<>();
        int l=0;
        int maxlen=0;
        int maxfreq=0;
        for(int r=0;r<s.length();r++){
            map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);
            for(int i:map.values())maxfreq=Math.max(maxfreq,i);
            if((r-l+1)-maxfreq<=k){
                maxlen=Math.max(maxlen,r-l+1);
            }else{
                while((r-l+1)-maxfreq>k){
                    map.put(s.charAt(l),map.get(s.charAt(l))-1);
                    if(map.get(s.charAt(l))==0)map.remove(s.charAt(l));
                    l++;
                }
            }
        }
        return maxlen;
        
    }
}