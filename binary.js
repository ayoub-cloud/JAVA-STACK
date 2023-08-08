function binarySearchRecursive(sortedArray, key, start = 0, end = sortedArray.length - 1) {
    if (start <= end) {
        let middle = Math.floor((start + end) / 2);

        if (sortedArray[middle] === key) {
            // found the key
            return middle;
        } else if (sortedArray[middle] < key) {
            // continue searching to the right
            return binarySearchRecursive(sortedArray, key, middle + 1, end);
        } else {
            // search searching to the left
            return binarySearchRecursive(sortedArray, key, start, middle - 1);
        }
    }

    // key wasn't found
    return -1;
}

// Test the function
const sortedNums = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
const searchNum = 5;
const result = binarySearchRecursive(sortedNums, searchNum);
console.log(`Index of ${searchNum}: ${result}`);
