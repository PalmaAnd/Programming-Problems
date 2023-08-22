const palindrome_number = require('../Problems/palindrome_number.js');

test("TestPalindrom", () => {
    expect(palindrome_number.isPalindrome(12244221)).toBe(true);
});