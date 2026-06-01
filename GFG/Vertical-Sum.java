class Solution {
    void solve(Node root,int col, TreeMap<Integer,Integer>map) {
        
        if(root==null){
            return;
        }
        if(map.containsKey(col)){
             map.put(col,map.get(col)+root.data);
        }
        else{
            map.put(col,root.data);
        }
        solve(root.left,col-1, map);
        solve(root.right,col+1,map);
    }
    public ArrayList<Integer>verticalSum(Node root){
        TreeMap<Integer,Integer>map=new TreeMap<>();
        solve(root , 0 ,map);
        ArrayList<Integer>ans=new ArrayList<>();
        for(Integer key :map.keySet()){
            ans.add(map.get(key));
        }
        return ans;
    }
}
        
