class Solution_13_LeetCode {
    public int romanToInt(String s) {
        HashMap<Character, Integer> dataMap = new HashMap<>();
        dataMap.put('I', 1);
        dataMap.put('V', 5);
        dataMap.put('X', 10);
        dataMap.put('L', 50);
        dataMap.put('C', 100);
        dataMap.put('D', 500);
        dataMap.put('M', 1000);

        int m = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int mapInt = dataMap.get(c);
            if (i + 1 == s.length()) {
                m = m + mapInt;
            } else {
                char cNext = s.charAt(i + 1);
                int mapIntNext = dataMap.get(cNext);
                int difference = mapIntNext - mapInt;
                if (difference > 0 && (difference % 4 == 0 || difference % 9 == 0)) {
                    m = m + difference;
                    i = i + 1;
                } else {
                    m = m + mapInt;
                }
            }

        }

        return m;

    }
}

/*
 * 1. create dictionary, letters to numbers
 * 2. find special character: I/X/C and its next character
 * {'2': 'II';
 * '4': 'IV'}
 * MIVCM
 * .index(myDict['4'])
 * 
 * 
 * {'M': 1000;
 * }
 * 
 * 3. LOOP THROUGH
 * .contains(String[i])
 * find it remove it
 * n = n +
 * 
 * 1. find the special character, translate to digital numbers N
 * 2. remove the special character
 * 3. Translate other characters into digital numbers, and add to N
 */