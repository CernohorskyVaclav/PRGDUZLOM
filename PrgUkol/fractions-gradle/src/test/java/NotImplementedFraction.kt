class NotImplementedFraction(private val numerator: Int, private val denominator: Int) : IFraction {
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
}