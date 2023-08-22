/**
 * @param {string} s
 * @return {boolean}
 */
var validParentheses = function(s) {
    var amountParentheses = 0;
    var amountBrackets = 0;
    var amountBraces = 0;
    for (let index = 0; index < s.length; index++) {
        const element = s.charAt(index);
        if (element == '(') amountParentheses++;
        if (element == ')') amountParentheses--;
        if (element == '[') amountBrackets++;
        if (element == ']') amountBrackets--;
        if (element == '{') amountBraces++;
        if (element == '}') amountBraces--;
    }
    return amountParentheses == 0 && amountBrackets == 0 && amountBraces == 0;
};

module.exports = validParentheses;