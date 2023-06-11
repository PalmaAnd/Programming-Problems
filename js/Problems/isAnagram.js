/**
 * This was my first working attempt, but I got really bad results for runtime and memory
 * 
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isAnagram1 = function(s, t) {
    if (s.length != t.length)
        return false;
    return s.split('').sort().toString() == t.split('').sort().toString();
};

/**
 * After some time I started thinking, if I can use the Unicode value of the characters.
 * My first approach was wrong, because I only added together all values from s and subtracted the values from t, but
 * that approach will return true for "ac" and "bb", because they have the same value when added together.
 * 
 * But the I thought of using the value of the characters as the index for a counter array which has the length of 26 (because there are 26 letters in the alphabet).
 * With the help of using charCodeAt and then subtracting 97 (which is the value for a) I was able to fill in the array and then check if all entries are still 0 after going thru
 * both string.
 * 
 * By using this solution I got way better results (in the higher 90%)
 * 
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isAnagram = function(s, t) {
    const VALUE_OF_FIRST_LOWERCASE_LETTER = 97;
    if (s.length != t.length)
        return false;

    let counter = new Array(26).fill(0);
    for (let i = 0; i < s.length; i++) {
        counter[s.charCodeAt(i) - VALUE_OF_FIRST_LOWERCASE_LETTER]++;
        counter[t.charCodeAt(i) - VALUE_OF_FIRST_LOWERCASE_LETTER]--;
    }
    for (let i = 0; i < counter.length - 1; i++) {
        if (counter[i] != 0) return false;
    }

    return true;
}
