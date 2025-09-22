package com.app.classeseobjetos

class House(
    val numberOfWindows: Int = 0,
    var color: String = "White",
    var forSale: Boolean = false,
    var salePrice: Double = 0.0,
) {

    constructor(hasGutter: Boolean) : this(){
        println("secondary constructor")
        gutter = hasGutter
    }

    var gutter = false

    init {
        if (forSale) salePrice = 1000000.0
    }

    fun updateColor(newColor: String) {
        if (newColor.lowercase() != color.lowercase())
            color = newColor
        else
            println("cor já é $color. Nova cor $newColor não aplicada!")
    }

    override fun toString(): String {
        return "House(numberOfWindows=$numberOfWindows," +
                " color='$color'," +
                " forSale=$forSale," +
                " salePrice=$salePrice, " +
                (if(gutter) "has gutter" else "without gutter") +
                ")"
    }

}

fun main() {

//    val house = House()
//    house.updateColor("white")
//    println(house)
//    house.updateColor("red")
//    println(house)

//    val house2 = House(forSale = true)
//    println(house2)

    val house3 = House(hasGutter = true)
    println(house3)

}
