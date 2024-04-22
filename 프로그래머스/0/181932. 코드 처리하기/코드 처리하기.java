import java.util.function.BiFunction;
class Solution {
    public String solution(String code) {
        
        BiFunction<String,String,String> BiCode = (oneArg, mode) ->{
            StringBuilder ret = new StringBuilder();
            for(int i=0;i<code.length();i++){
                if(mode.equals("1")){
                    for(int j=i;j<code.length();j++){
                        if(j % 2 != 0 && !code.substring(j,j+1).equals("1")){
                            ret.append(code.substring(j,j+1));
                            i=j;
                            
                        }else if(code.substring(j,j+1).equals("1")){
                            mode = "0";
                            i=j;
                            break;
                        }
                    }
                }
                else if(mode.equals("0")){
                    for(int j=i;j<code.length();j++){
                        if(j % 2 == 0 && !code.substring(j,j+1).equals("1")){
                            ret.append(code.substring(j,j+1));
                            i=j;
                        }else if(code.substring(j,j+1).equals("1")){
                            mode = "1";
                            i=j;
                            break;
                        }
                    }
                }
            }
            
            
            
            return ret.length() == 0 ? "EMPTY" : ret.toString();
        };
        String mode = "0";
        
        return BiCode.apply(null,mode);
        
        // BiFunction to process code and generate result
//         BiFunction<Character, Character, String> processCode = (mode, currentChar) -> {
//             StringBuilder ret = new StringBuilder();
//             for (int idx = 0; idx < code.length(); idx++) {
//                 char c = code.charAt(idx);
//                 if (mode == '0') {
//                     if (c != '1' && idx % 2 == 0) {
//                         ret.append(c);
//                     } else if (c == '1') {
//                         mode = '1';
//                     }
//                 } else {
//                     if (c != '1' && idx % 2 != 0) {
//                         ret.append(c);
//                     } else if (c == '1') {
//                         mode = '0';
//                     }
//                 }
//             }
//             return ret.length() == 0 ? "EMPTY" : ret.toString();
//         };

//         // Initialize mode to 0
//         char mode = '0';

//         // Process code using BiFunction
//         return processCode.apply(mode, null);
    }
}