const palindrome_number = require('../Problems/palindrome_number');

test("TestPalindrom", () => {
    expect(palindrome_number.isPalindrome(12244221)).toBe(true);
});