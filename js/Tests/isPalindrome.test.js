const isPalindrome = require("../Problems/isPalindrome");

test("TestPalindrom: true", () => {
    expect(isPalindrome("A man, a plan, a canal: Panama")).toBe(true);
});

test("TestPalindrom: false", () => {
    expect(isPalindrome("race a car")).toBe(false);
});

test("TestPalindrom: empty string", () => {
    expect(isPalindrome(" ")).toBe(true);
});
