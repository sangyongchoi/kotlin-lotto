package calculator.domain

import calculator.usecase.Parser

class StringAddCalculator(
    private val parser: Parser,
) : Calculator {

    override fun calculate(input: String): Int {
        val numbers = parser.parse(input)
        return numbers.sum()
    }
}
