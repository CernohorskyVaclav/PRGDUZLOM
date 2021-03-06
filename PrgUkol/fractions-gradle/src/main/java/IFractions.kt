interface IFraction {
    /**
     * @return the upper part of the fraction
     */
    val numerator: Integer?

    /**
     * @return the bottom part of the fraction
     */
    val denominator: Integer?

    /**
     * @param other fraction
     * @return new instance of IFraction representing the result
     */
    operator fun plus(other: IFraction?): IFraction?

    /**
     * @param other fraction
     * @return new instance of IFraction representing the result
     */
    operator fun minus(other: IFraction?): IFraction?

    /**
     * @param other fraction
     * @return new instance of IFraction representing the result
     */
    operator fun times(other: IFraction?): IFraction?

    /**
     * @param other fraction
     * @return new instance of IFraction representing the result
     */
    fun dividedBy(other: IFraction?): IFraction?
}