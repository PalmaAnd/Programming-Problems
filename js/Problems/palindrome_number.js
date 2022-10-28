/**
 * @param {number} x
 * @return {boolean}
 */
 let isPalindrome = function(x) {
    let type = x < 0 ? "-" : "";
    let x_reversed = x.toString();
    x_reversed = x_reversed.split('').reverse().join('');

    return x == (x_reversed + type);
};