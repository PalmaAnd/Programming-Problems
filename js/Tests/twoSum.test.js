const twoSum = require('../Problems/twoSum.js');

test("Two Sum: Should return 9", () => {
    expect(twoSum.twoSum([2, 7, 11, 15], 9)).toEqual([0, 1]);
});

test("Two Sum: Should return 6", () => {
    expect(twoSum.twoSum([3, 2, 4], 6)).toEqual([1, 2]);
});

test("Two Sum: Should return 6", () => {
    expect(twoSum.twoSum([3, 3], 6)).toEqual([0, 1]);
});

test("Two Sum but with lower Memory Usage: Should return 9", () => {
    expect(twoSum.twoSumLowMemory([2, 7, 11, 15], 9)).toEqual([0, 1]);
});

test("Two Sum but with lower Memory Usage: Should return 6", () => {
    expect(twoSum.twoSumLowMemory([3, 2, 4], 6)).toEqual([1, 2]);
});

test("Two Sum but with lower Memory Usage: Should return 6", () => {
    expect(twoSum.twoSumLowMemory([3, 3], 6)).toEqual([0, 1]);
});