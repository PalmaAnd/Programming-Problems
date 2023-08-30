const validParentheses = require('../Problems/validParentheses.js');

test("Valid Parentheses : ()", () => {
    expect(validParentheses("()")).toEqual(true);
});

test("Valid Parentheses: ()[]{}", () => {
    expect(validParentheses("()[]{}")).toEqual(true);
});

test("Valid Parentheses: Should return (]", () => {
    expect(validParentheses("(]")).toEqual(false);
});

test("Valid Parentheses: Should return ([)]", () => {
    expect(validParentheses("([)]")).toEqual(false);
});
