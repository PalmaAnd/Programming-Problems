/**
 * Problem:
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 *
 * Related topics: Array, Hash Table
 *
 */

/**
 * By using a map, we make sure to only iterate the array once.
 * This results in a time complexity of O(n).
 * Runtime: 78 ms
 * Memory Usage: 43.1 MB
 *
 * @param {[int]} numbers Array of integers
 * @param {int} target The wished return value
 * @returns Indices of the two numbers such that they add up to target
 */
var twoSum = function (numbers, target) {
    const map = new Map();
    for (var i = 0; i < numbers.length; i++) {
        // Calculate what value would be needed to get the target by also using the current value
        const result = target - numbers[i];
        // If the result is already set inside the map, we can return the index of the two values as it will result in the target
        if (map.has(result)) {
            return [map.get(result), i];
        }
        // if the result isn't already in the map we save it
        map.set(numbers[i], i);
    }
};

/**
 *
 * This function will take longer then twoSum, but only has a Memory Usage of 41.8 MB.
 * Runtime: 169 ms
 *
 * @param {[int]} numbers Array of integers
 * @param {int} target The wished return value
 * @returns Indices of the two numbers such that they add up to target
 */
var twoSumLowMemory = function (nums, target) {
    for (var i = 0; i < nums.length - 1; i++) {
        var temp = nums[i];
        for (var j = i + 1; j < nums.length; j++) {
            if (target - temp == nums[j]) {
                return [i, j];
            }
        }
    }
};

module.exports = { twoSum, twoSumLowMemory };
