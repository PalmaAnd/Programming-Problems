/**
 * @param {string} s
 * @return {boolean}
 */
var isPalindrome = function(s) {
    s = s.trim();
    for (let index = 0; index < s.length; index++) {
        const element = s[index];
        if (s.charAt(index).toLocaleLowerCase() != s.charAt(s.length - index).toLocaleLowerCase()){
            return false;
        }
    }
    return true;
};

module.exports = isPalindrome;
