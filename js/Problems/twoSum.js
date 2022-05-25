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
 *  By using a map, we make sure to only iterate the array once. This results in a time complexity of O(n)
 * 
 * @param {[int]} numbers Array of integers
 * @param {int} target The wished return value
 * @returns Indices of the two numbers such that they add up to target
 */
 var twoSum = function(numbers, target) {
    const map = new Map();
    for(var i = 0; i < numbers.length; i++){
        // Calculate what value would be needed to get the target by also using the current value
        const result = target - numbers[i];
        // If the result is already set inside the map, we can return the index of the two values as it will result in the target
        if(map.has(result)) {
           return [map.get(result), i];
         }
        // if the result isn't already in the map we save it
        map.set(numbers[i], i);
    }
};

module.exports = { twoSum };
