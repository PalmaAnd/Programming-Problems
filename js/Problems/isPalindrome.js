/**
 * Check if a string is a palindrome after removing non-alphanumeric characters and ignoring case.
 * @param {string} s - The input string to check.
 * @return {boolean} - True if the input string is a palindrome, false otherwise.
 */
var isPalindrome = function(s) {
    // Remove non-alphanumeric characters and convert the string to lowercase
    s = s.replace(/[^a-zA-Z0-9]/g, '').toLowerCase();
    
    for (let index = 0; index < s.length; index++) {
        // Compare chars at the start and the end of the string
        if (s.charAt(index) !== s.charAt(s.length - index - 1)){
            return false;
        }
    }
    return true;
};

module.exports = isPalindrome;
