const insertion_sort = require('../Problems/insertion_sort.js');

test("Insertion Sort: ", () => {
    expect(insertion_sort.insertionSortList([4,2,1,3])).toEqual([1,2,3,4]);
});