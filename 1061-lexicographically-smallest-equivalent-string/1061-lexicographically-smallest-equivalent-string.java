 class UnionFind{
        
        int[] p;
        int[] r ;
        UnionFind(){
            
            p = new int[26];
            r = new int[26];
            
            for(int i=0 ; i<26 ; i++){
                
                p[i] = i;
            }
        }
        
        int find(int a){
            
            while(a!=p[a]){
                
                a = p[a];
            }
            
            return a ;
        }
        
        void union(int a, int b){
            
            int rootA = find(a);
            int rootB = find(b);
            
            if(rootA==rootB) return ;
            
            if(rootA<rootB){
                
                p[rootB] = rootA ;
            }
            else{
                
                p[rootA] = rootB ;
            }
        }
    }
  class Solution {
  
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        
        
        UnionFind uf = new UnionFind();
        
        StringBuilder sb  = new StringBuilder();
        
        for(int i=0 ; i<s1.length() ; i++){
            
            int f = s1.charAt(i)-'a';
            int s = s2.charAt(i)-'a';
            
            uf.union(f,s);
        }
        
        for(int i=0 ; i<baseStr.length() ; i++){
            
            int b  = uf.find(baseStr.charAt(i)-'a');
            
            sb.append((char)(b+'a'));
        }
        
        return sb.toString();
    }
  }

//class Solution {
    
    
//     public String smallestEquivalentString(String s1, String s2, String baseStr) {
//               int len = s1.length();
//         List<Set<Character>> set = new ArrayList<>();
//         int currSet = 1;
//         int[] sets = new int[26];
//         for(int i=0; i<len; i++)
//         {
//             // System.out.println(set);
//             char c1 = s1.charAt(i);
//             char c2 = s2.charAt(i);
//             if(c1==c2) continue;
//             if(sets[c1-'a'] == 0 && sets[c2-'a'] == 0)
//             {
//                 Set<Character> newSet = new TreeSet<>();
//                 newSet.add(c1);
//                 newSet.add(c2);
//                 sets[c1-'a'] = currSet;
//                 sets[c2-'a'] = currSet;
//                 currSet++;
//                 set.add(newSet);
//             }
//             else if(sets[c1-'a'] == 0)
//             {
//                 Set<Character> curr = set.get(sets[c2-'a']-1);
//                 curr.add(c1);
//                 sets[c1-'a'] = sets[c2-'a'];
//             }
//             else if(sets[c2-'a'] == 0)
//             {
//                 Set<Character> curr = set.get(sets[c1-'a']-1);
//                 curr.add(c2);
//                 sets[c2-'a'] = sets[c1-'a'];
//             }
//             else if(sets[c2-'a'] != sets[c1-'a'])
//             {
//                 // System.out.println(Arrays.toString(sets));
//                 // System.out.println(c2+"  "+c1);
//                 Set<Character> first = set.get(sets[c1-'a']-1);
//                 Set<Character> second = set.get(sets[c2-'a']-1);
//                 for(char cha : second)
//                 {
//                     first.add(cha);
//                     sets[cha-'a'] = sets[c1-'a'];
//                 }
//                 second.clear();
//             }
//         }
//         System.out.println(set);
        
//         String ans = "";
//         for(int i=0; i<baseStr.length(); i++)
//         {
//             char ch = baseStr.charAt(i);
//             int index = sets[ch-'a']-1;
//             if(index<0) ans += ch;
//             else ans += set.get(index).iterator().next();;
//         }
//         return ans;

//     }
// }