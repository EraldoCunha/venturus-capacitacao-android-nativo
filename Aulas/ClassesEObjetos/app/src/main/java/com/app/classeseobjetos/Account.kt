package com.app.classeseobjetos

import kotlin.random.Random
import kotlin.random.nextLong

//o open deixa a classe aberta para ser usada com herança
//open class Account{}

abstract class Account{
    val id = Random.nextLong(0 .. Long.MAX_VALUE)
    var balance = 0.0

    open fun deposit(value: Double){
        if (value > 0.0) balance += value
    }

    open fun withdraw(value: Double){
        if (value > 0.0 && balance >= value) balance -= value
    }

    override fun toString(): String {
        return "${this.javaClass.simpleName}(id=$id, balance=$balance)"
    }


}

class CheckingAccount : Account(){
    override fun withdraw(value: Double) {
        val withdrawSum = value + balance * 0.01
        if (value > 0.0 && balance >= withdrawSum) balance -= withdrawSum
    }
}

class SavingsAccount : Account(){
    override fun deposit(value: Double) {
        if (value > 0.0) balance += value * 1.01
    }
}

fun main() {
    val chekingsaccount: Account = CheckingAccount()
    val savingsaccount: Account = SavingsAccount()

    chekingsaccount.deposit(100.0)
    chekingsaccount.withdraw(100.0)
    chekingsaccount.withdraw(50.0)

    savingsaccount.deposit(100.0)
    savingsaccount.withdraw(100.0)

    println(chekingsaccount)
    println(savingsaccount)
}

