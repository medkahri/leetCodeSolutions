class Solution {
    public int romanToInt(String s) {
 int res = 0;
        int i = 0;
        Boolean bol = true;
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(4);
        nums.add(40);
        nums.add(9);
        nums.add(90);
        nums.add(400);
        nums.add(900);

        HashMap<Character,Integer> romans = new HashMap<Character, Integer>();

        romans.put('I',1);
        romans.put('V',5);
        romans.put('X',10);
        romans.put('L',50);
        romans.put('C',100);
        romans.put('D',500);
        romans.put('M',1000);


        if(s.length()==1){
            return romans.get(s.charAt(0)) ;
        }


        while(i<s.length()-1){

            if(nums.contains(romans.get(s.charAt(i+1))-romans.get(s.charAt(i)))){
                res += romans.get(s.charAt(i+1))-romans.get(s.charAt(i));
                
                i+=2;

            }
            else{
                res+= romans.get(s.charAt(i));
                i+=1;
            }


        }
        



        if(i==s.length()-1){
            return res += romans.get(s.charAt(i));
        }

        return res;











    }




        
        
    }