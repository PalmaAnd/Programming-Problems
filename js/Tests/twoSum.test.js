const twoSum = require('../Problems/twoSum');

test("Two Sum Testing: Returns 9", () => {
    expect(twoSum.twoSum([2, 7, 11, 15], 9)).toEqual([0, 1]);
});

test("Two Sum Testing: Returns 6", () => {
    expect(twoSum.twoSum([3, 2, 4], 6)).toEqual([1, 2]);
});

test("Two Sum Testing: Returns 6", () => {
    expect(twoSum.twoSum([3, 3], 6)).toEqual([0, 1]);
});
