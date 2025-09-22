package com.app.listbook.mycontacts

import java.util.Locale.filter
import java.util.concurrent.locks.Condition

//fun main(){
//
//    val contacts = listOf("Mariazinha", "Joãozinho", "Lucão")
//
//    val status = if(contacts.isEmpty()){
//        println("Agenda vazia $contacts")
//    } else {
//        "Você tem ${contacts.size} contatos"
//    }
//
//    println(status)
//
//}

//fun main() {
//
//    val isUnit = println("Isto é uma expresão")
//
//    println(isUnit)
//}

//fun main() {
//
//    val title = "Lista de contatos"
//    val contacts = listOf("Mariazinha", "Joãozinho", "Lucão")
//
//    showContacts(contacts, title)
//
//}
//
//fun showContacts(contacts: List<String>, title: String){
//
//    println("Título da Agenda: $title")
//
//    if(contacts.isEmpty())
//        println("Agenda vazia $contacts")
//    else{
//        println("Você tem ${contacts.size}")
//        for (contact in contacts){
//            println("- $contact")
//        }
//    }
//}

//fun main() {
//
//    defaultReturn(2)
//
//}
//
////Função simplicada quando é algo simples
//fun defaultReturn(x: Int) = println(x* 2)


//fun showFilteredContacts(
//    contacts: List<String>,
//    filter: Char? = null
//){
//
//    val filteredContacts = filter?.let{ word ->
//        contacts.filter { it.startsWith(word, ignoreCase = true) }
//    } ?: contacts
//
//    if (filteredContacts.isEmpty())
//        println("Nenhum contato encontrado")
//    else
//        "Contatos encontrados: \n ${filteredContacts.forEach { println("- $it") }}!"
//}

//fun main() {
//
//    val contacts = listOf("mariazinha", "joãozinho", "lucão")
//
////    val toUpperCase = {name: String -> name.uppercase()}
//
//    val toCamelCase = {name: String -> name.replaceFirstChar { it.uppercase() }}
//
//    println(processContact(contacts[1], toCamelCase))
//}
//
//fun processContact(name: String, callback: (String) -> String) : String {
//    return callback(name)
//}

//fun main() {
//
//    val contacts = listOf("mariazinha", "joãozinho", "lucão")
//
//    println(processContact(contacts, ::toCamelCase))
//}
//
//fun toCamelCase (name: String): String = name.replaceFirstChar { it.uppercase() }
//
//fun processContact(list: List<String>, callback: (String) -> String) : List<String>{
//    return list.map { mappedList -> callback(mappedList) }
//},,main

//fun main() {
//
//    val contacts = listOf("mariazinha", "joãozinho", "lucão", "Steff")
//
//    println("Contatos que começam com a letra S")
//    println(filteredContacts(list = contacts, condition = {it.startsWith("S")}))
//    println(filteredContacts(list = contacts, condition = {it.length> 5}))
//    println(filteredContacts(list = contacts, condition = {it.endsWith("o")}))
//}
//
//fun filteredContacts(list: List<String>, condition: (String) -> Boolean) : List<String> {
//    return list.filter(condition)
//}

//fun main() {
//
//    val contacts = listOf("chiquinha", "chaves", "mariazinha", "joãozinho", "lucão", "Steff")
//
//    val lazyFiltered = contacts.asSequence().filter { it.startsWith("c") }
//
//    println("Resultado: ${lazyFiltered.toList()}")
//}

//fun main() {
//
//    val contacts = listOf("chiquinha", "chaves", "mariazinha", "joãozinho", "lucão", "steff")
//
//    val upperCaseContacts = contacts.map{it.uppercase()}
//
//    println("Lista transformada agora é: $upperCaseContacts")
//
//}

fun main() {

    val contactGroups = listOf(listOf("Ana", "João"), listOf("Carlos", "Diana"), listOf("Eduardo"))

    val allContacts = contactGroups.flatten()

    println("Todos os contatos: $allContacts")
}
