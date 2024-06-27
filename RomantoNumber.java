class RomantoNumber {
    public int romanToInt(String s) {
        char[] s1 = new char[s.length()];

for (int i = 0; i < s.length(); i++) {
        s1[i] = s.charAt(i);
}
    HashMap<Character, Integer> roman = new HashMap<Character, Integer>();
    int sum =0 ;
    roman.put('I',1);
    roman.put('V',5);
    roman.put('X',10);
    roman.put('L',50);
    roman.put('C',100);
    roman.put('D',500);
    roman.put('M',1000);
    for (int i =0 ; i<s.length();i++){
if( i+1<s.length() && roman.get(s1[i])<roman.get(s1[i+1])){
sum = sum - roman.get(s1[i]);
}
else {
sum = sum+roman.get(s1[i]);
}
}
return sum;
        
    }
}
