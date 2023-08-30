/**
 * @param {string} s
 * @return {boolean}
 */
var validParentheses = function (s) {
    if (s.length % 2 != 0) return false;
    var opening = [];
    for (let i = 0; i < s.length; i++) {
        const element = s[i];
        if (element == "(" || element == "[" || element == "{") {
            opening.push(element);
        } else {
            if (element == ")") {
                if (opening[opening.length - 1] == "(") {
                    opening.pop();
                } else {
                    return false;
                }
            } else if (element == "]") {
                if (opening[opening.length - 1] == "[") {
                    opening.pop();
                } else {
                    return false;
                }
            } else if (element == "}") {
                if (opening[opening.length - 1] == "{") {
                    opening.pop();
                } else {
                    return false;
                }
            }
        }
    }
    return opening.length == 0;
};

module.exports = validParentheses;
