package com.app.testinginstallation

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        printHello()
    }

    fun printHello(){
        println("Hello World!")

        println("..........................")
        println("${1+1}")
        println("${1498429848 - 18378371}")
        println("${400 / 20}")
        println("${9%3}")

        println("..........................")
        println("${1.0 / 2.0}")
        println("${2.0 * 3.5}")

        println("..........................")
        println("${2.plus(3)}")
        println("${3.minus(2)}")
        println("${3.5.times(4)}")
        println("${2.4.div(2)}")
        println("${1.fazAlgo()}")

        println("..........................")
        println("${6.times(50)}")
        println("${6.0.times(50)}")
        println("${6.0.times(50.0)}")
        println("${1.div(2)}")
        println("${1.0.div(2)}")

        println("..........................")

        val i: Int = 6
        val b: Byte = i.toByte()
        println(b)

        val text = """
            val t = 50
            """
        println(text)

        val text2 = "Hello world \nText"
        println(text2)

        val numberOfDogs= 3
        val numberOfCats = 2
        println("I have $numberOfDogs dogs" + " and $numberOfCats cats")

        println(".....Condicionais.....")
        var x = 1
        if ( x < 2 ){
            println("x menor que 2")
        } else {
            println("x maior ou igual a 2")
        }

        when(x){
            0 -> println("x = 0")
            1 -> println("x = 1")
            2 -> println("x = 2")
            else -> println("x maior que 2")
        }

        for (i in 1..5 step 2){ //step é opcional
            println("Laço for $i")
        }

        while (x<5){
            println("Laço while $x")
            x++
        }

        //dá pra sobreescrever mas não mudar os elementos
        //var list = listOf(1, 2, 3)
        //list = listOf(3,4,5)//da boa
        //list[0] = 50  não da boa

        //dá pra sobreescrever e também pra mudar os elementos
        //var list = listOf(1, 2, 3)
        //list = listOf(3,4,5)//da boa
        //list[0] = 50  não da boa
        //var list = mutableListOf(1, 2, 3)
        //list = listOf(3,4,5)//da boa
        //list[0] = 50  agora também da boa

        //é a forma certa de declarar não deixando alterações
        //val list = listOf(1, 2, 3)

        var a: String? =  "Test"
        a = null
        println("${a?: 0}") // operador elvis, é uma forma de tratar algum possível null usando um valor como padrão para ser atribuido caso seja null

        //usar duas !! afirma que o valor não é null, mas caso seja vai ser lançado um NullPointerException, o que é ruim

    }

    fun Int.fazAlgo(): Int {
        return this.plus(1)
    }

}