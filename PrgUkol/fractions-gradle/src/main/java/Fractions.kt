class Fraction(numerator: Integer, denominator: Integer) : IFraction {
    private val numerator: Integer
    private val denominator: Integer
    @Override
    fun getNumerator(): Integer {
        return numerator
    }

    @Override
    fun getDenominator(): Integer {
        return denominator
    }

    @Override
    operator fun plus(other: IFraction?): IFraction {
        throw UnsupportedOperationException()
    }

    @Override
    operator fun minus(other: IFraction?): IFraction {
        throw UnsupportedOperationException()
    }

    @Override
    operator fun times(other: IFraction?): IFraction {
        throw UnsupportedOperationException()
    }

    @Override
    fun dividedBy(other: IFraction?): IFraction {
        throw UnsupportedOperationException()
    }

    @Override
    override fun toString(): String {
        return "Fraction $numerator|$denominator"
    }

    companion object {
        fun createNormalised(numerator: Integer?, denominator: Integer?): Fraction {
            throw UnsupportedOperationException()
        }
    }

    init {
        this.numerator = numerator
        this.denominator = denominator
        if (denominator == 0) throw ArithmeticException("Cannot Divide by 0")
    }
}