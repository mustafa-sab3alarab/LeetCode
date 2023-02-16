// Link problem : https://leetcode.com/problems/subrectangle-queries/

class SubrectangleQueries(val rectangle: Array<Array<Int>>) {

    fun updateSubrectangle(row1: Int, col1: Int, row2: Int, col2: Int, newValue: Int) {
        for (i in row1..row2) {
            for (j in col1..col2) {
                rectangle[i][j] = newValue
            }
        }
    }

    fun getValue(row: Int, col: Int) = rectangle[row][col]
}

fun main() {
    val matrix = arrayOf(
        arrayOf(1, 2, 1),
        arrayOf(4, 3, 4),
        arrayOf(3, 2, 1),
        arrayOf(1, 1, 1)
    )
    val obj = SubrectangleQueries(matrix)
    println(obj.getValue(1, 1))
    obj.updateSubrectangle(0, 0, 3, 2, 5)
    obj.updateSubrectangle(3, 0, 3, 2, 10)
    obj.rectangle.forEach {
        it.forEach {
            print("$it ")
        }
        println()
    }

}

/**
 * Your SubrectangleQueries object will be instantiated and called as such:
 * var obj = SubrectangleQueries(rectangle)
 * obj.updateSubrectangle(row1,col1,row2,col2,newValue)
 * var param_2 = obj.getValue(row,col)
 */
