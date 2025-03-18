fun main() {
    val amount = 20
    val minCommission = 35
    val commissionPercent = 0.075
    val commissionRuble = amount * commissionPercent
    if (commissionRuble < minCommission) {
        println("Для перевода $amount рублей, комиссия составит $minCommission рублей")
    } else {
        println("Для перевода $amount рублей, комиссия составит $commissionRuble рублей")
    }
}