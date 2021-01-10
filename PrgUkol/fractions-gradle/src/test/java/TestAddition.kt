import org.junit.Assert
import org.junit.Test

class TestAddition {
    @Test
    fun testSimple() {
        val fraction: Unit = TestUtils.createFraction(3, 5)
        val result: Unit = fraction.plus(NotImplementedFraction(3, 5))
        Assert.assertEquals(6 as Integer, result.getNumerator())
        Assert.assertEquals(5 as Integer, result.getDenominator())
    }

    @Test
    fun testNormalisation() {
        val fraction: Unit = TestUtils.createFraction(1, 2)
        val result: Unit = fraction.plus(NotImplementedFraction(1, 2))
        Assert.assertEquals(1 as Integer, result.getNumerator())
        Assert.assertEquals(1 as Integer, result.getDenominator())
    }
}