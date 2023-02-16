// Link problem : https://leetcode.com/problems/final-value-of-variable-after-performing-operations/


fun main() {
    val operations1 = arrayOf("--X", "X++", "X++")
    val operations2 = arrayOf("++X", "++X", "X++")
    val operations3 = arrayOf("X++", "++X", "--X", "X--")
    println(FinalValueOfVariableAfterPerformingOperations().finalValueAfterOperations3(operations2))
}


class FinalValueOfVariableAfterPerformingOperations {
    companion object {
        const val INCREMENT_1 = "++X"
        const val INCREMENT_2 = "X++"
    }

    fun finalValueAfterOperations(operations: Array<String>): Int {
        var x = 0
        operations.forEachIndexed { index, s ->
            if (operations[index] == INCREMENT_1 || operations[index] == INCREMENT_2) ++x
            else --x
        }
        return x
    }

    fun finalValueAfterOperations1(operations: Array<String>): Int {
        return operations.map { if (it[1] == '+') 1 else -1 }.sum()
    }

    fun finalValueAfterOperations3(operations: Array<String>): Int {
        val result: Int = operations.run {
            count { it[1] == '+' } - count { it[1] == '-' } // it[1] because the second letter is only - or +
        }
        return result
    }
}