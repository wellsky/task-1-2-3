fun main() {
    println(calculateSalePrice(1000.0))
    println(calculateSalePrice(1000.0, true))
    println(calculateSalePrice(1000.0, true, 2000))
    println(calculateSalePrice(1000.0, true, 12000))

    /*
    В примере тот случай, когда при последней покупке на 12 тыс. скидка в 5% оказалась меньше скидки в 100 руб. за покупку на 2 тыс. :)
    Можно добавить дополнительную проверку
    */
}

fun calculateSalePrice(currentPrice: Double, regularСustomer: Boolean = false, lastPrice: Int = 0): Double {
    var salePrice: Double = when {
        (lastPrice > 10000) -> currentPrice * 0.95
        (lastPrice > 1000) -> currentPrice - 100.0
        else -> currentPrice
    }

    if (regularСustomer) {
        salePrice = salePrice * 0.99
    }

    return salePrice
}