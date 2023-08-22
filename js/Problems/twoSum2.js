/**
 * @param {number[]} numbers
 * @param {number} target
 * @return {number[]}
 */
var twoSum2 = function (numbers, target) {
    const map = new Map();
    for (let i = 0; i < numbers.length; i++) {
        // Calculate what value would be needed to get the target by also using the current value
        const result = target - numbers[i];
        // If the result is already set inside the map, we can return the index of the two values as it will result in the target
        if (map.has(result)) {
            return [map.get(result) + 1, i + 1];
        }
        // if the result isn't already in the map we save it
        map.set(numbers[i], i);
    }
};

module.exports = twoSum2;
