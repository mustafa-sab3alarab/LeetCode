
// Link problem : https://leetcode.com/problems/build-array-from-permutation/description/

class BuildArrayFromPermutation {
    fun buildArray(nums: IntArray): IntArray {
        val array = IntArray(nums.size)
        for (i in nums.indices) {
            array[i] = nums[nums[i]]
        }
        return array
    }
}

fun main(){
    val buildArrayFromPermutation = BuildArrayFromPermutation()
    val arrayOfNumbers = IntArray(6)
    arrayOfNumbers[0] = 0
    arrayOfNumbers[1] = 2
    arrayOfNumbers[2] = 1
    arrayOfNumbers[3] = 5
    arrayOfNumbers[4] = 3
    arrayOfNumbers[5] = 4
    buildArrayFromPermutation.buildArray(arrayOfNumbers).forEach { print("$it ") }
    // Output: [0,1,2,4,5,3]
}