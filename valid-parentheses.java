//class Solution {
//
//    // hold mappings
//    private HashMap<Character, Character> mappings;
//
//    // constructor
//    public Solution(){
//        this.mappings = new HashMap<Character,Character>();
//        this.mappings.put(')','(');
//        this.mappings.put('}','{');
//        this.mappings.put(']','[');
//    }
//
//    public boolean isValid(String s) {
//        // init stack
//        Stack<Character> stack = new Stack<Character>();
//
//        // bracket of the expression
//        for(int i=0;i<s.length();i++){
//            char c = s.charAt(i);
//
//            if(this.mappings.containsKey(c)){
//            //closing bracket
//                char topElement = stack.isEmpty() ? '#' : stack.pop();
//                if(topElement != this.mappings.get(c)){
//                    return false;
//                }
//            }else{
//            //opening bracket
//                stack.push(c);
//            }
//        }
//
//        return stack.isEmpty();
//    }
//}
