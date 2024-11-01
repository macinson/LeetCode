public String convert(String s, int numRows) {
    if(numRows == 1) return s;
    String res = "";
    for(int i = 0; i < numRows && i < s.length(); i++){
        int j = i;
        while(j < s.length()){
            res += s.charAt(j);
            if(i != 0 && i != numRows-1 && j + 2*numRows -2*(i+1) < s.length()) res += s.charAt(j + 2*numRows -2*(i+1));
            j += 2*numRows - 2;
        }
    }

    return res;
}