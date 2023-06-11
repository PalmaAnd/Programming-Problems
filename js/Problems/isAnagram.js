/**
 * This was my first working attempt, but I got really bad results for runtime and memory
 * 
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isAnagram = function(s, t) {
    if (s.length != t.length)
        return false;
    console.log(s.split('').sort().toString());
    console.log(t.split('').sort().toString());
    return s.split('').sort().toString() == t.split('').sort().toString();
};

console.log(isAnagram("rat", "tar"));
console.log(isAnagram("rat", "car"));
console.log(isAnagram("aacc", "ccac"));