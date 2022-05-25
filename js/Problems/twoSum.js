/**
 * Problem:
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 *
 */
/**
 *
 * @param {[int]} numbers Array of integers
 * @param {int} target The wished return value
 * @returns Indices of the two numbers such that they add up to target
 */
var twoSum = (numbers, target) => {
    for (var i = 0; i < numbers.length - 1; i++) {
        for (var j = i + 1; j < numbers.length; j++) {
            if (numbers[i] + numbers[j] == target) {
                return [i, j];
            }
        }
    }
};

module.exports = { twoSum };
