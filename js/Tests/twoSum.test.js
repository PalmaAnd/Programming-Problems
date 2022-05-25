const twoSum = require("../../Problems/twoSum");

test("Two Sum Testing: Returns 9", () => {
    expect(twoSum([2, 7, 11, 15], 9)).toBe([0, 1]);
});

test("Two Sum Testing: Returns 6", () => {
    expect(twoSum([3, 2, 4], 6)).toBe([1, 2]);
});

test("Two Sum Testing: Returns 6", () => {
    expect(twoSum([3, 3], 6)).toBe([0, 1]);
});
