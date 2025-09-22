package com.app.agendainteligente

class Contato(
    val nome: String,
    val favorito: Boolean,
    val telefone: String = "Sem número"
) {
    private val mensagens = mutableListOf<String>()

    fun enviarMensagem(mensagem: String, remetente: String = "Sistema") {
        val conteudo = "De: $remetente -> Para: $nome\nMensagem: $mensagem"
        mensagens.add(conteudo)
    }

    fun listarMensagens(): List<String> = mensagens.toList()

    override fun toString(): String {
        return "Nome: $nome," +
                " Favorito: $favorito," +
                " Telefone:'$telefone')"
    }
}

val agenda = mutableListOf<Contato>()

fun adicionarContato(nome: String, favorito: Boolean, telefone: String = "Sem número") {
    agenda.add(Contato(nome, favorito, telefone))
}

fun listarFavoritosOrdenados() =
    agenda.filter { it.favorito }
        .map { it.nome }
        .sorted()

fun buscarContatos(termo: String): List<Contato> =
    agenda.filter { it.nome.contains(termo, ignoreCase = true) }

fun listarTodasMensagens() {
    agenda.forEach { contato ->
        println("\nMensagens de ${contato.nome}:")
        val mensagens = contato.listarMensagens()
        if (mensagens.isEmpty()) {
            println("Nenhuma mensagem.")
        } else {
            mensagens.forEach { println(it) }
        }
    }
}


fun main() {

    adicionarContato("Maria", false, "0000-0000")
    adicionarContato("Ana", true)
    adicionarContato("Carlos", false, "1111-1111")
    adicionarContato("Fernando", false, "2222-2222")
    adicionarContato("Ricardo", false,)
    adicionarContato("Juliana", true, "3333-3333")
    adicionarContato("Beatriz", true, "4444-4444")
    adicionarContato("Gabriela", false)
    adicionarContato("João", true, "5555-5555")
    adicionarContato("Paulo", false, "6666-6666")


    println("\n--- Favoritos ordenados ---")
    listarFavoritosOrdenados().forEach(::println)


    println("\n--- Busca por termo 'na' ---")
    buscarContatos("na").forEach(::println)


    agenda[0].enviarMensagem("Oi Maria, bem-vinda!") // Sistema
    agenda[0].enviarMensagem("Lembrete da reunião de amanhã.", "Ana")

    agenda[1].enviarMensagem("Bom dia Ana!", "Sistema")
    agenda[1].enviarMensagem("Não se esqueça das suas tarefas.", "Juliana")

    agenda[3].enviarMensagem("Fernando, parabéns pelo relatório!")

    agenda[4].enviarMensagem("Ricardo, reunião às 15h", "João")
    agenda[4].enviarMensagem("Levar documentos importantes.", "Sistema")

    agenda[5].enviarMensagem("Juliana, feliz aniversário!", "Sistema")
    agenda[5].enviarMensagem("Não esqueça de enviar o relatório.", "Beatriz")

    agenda[6].enviarMensagem("Beatriz, parabéns pelo projeto!", "Fernando")

    agenda[8].enviarMensagem("João, reunião hoje às 14h.", "Sistema")


    println("\n--- Mensagens de todos os contatos ---")
    listarTodasMensagens()

}
