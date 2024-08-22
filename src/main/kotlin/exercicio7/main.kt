package exercicio7

fun main() {
    val voo = Ex07.Voo(123, 100)

    var assento = 0
    while (assento != -1) {
        print("Digite o número do assento que deseja reservar (Digite -1 para encerrar o programa): ")
        assento = readLine()?.toIntOrNull() ?: 0

        if (voo.verificarDisponibilidade(assento)) {
            if (voo.reservarAssento(assento)) {
                println("Assento $assento reservado com sucesso!")
            } else {
                println("Erro ao reservar assento.")
            }
        } else {
            println("Assento $assento indisponível.")
        }

        // Exibindo a quantidade de assentos
        println("Assentos disponíveis: ${voo.getQuantidadeAssentosDisponiveis()}")
        println("Assentos indisponíveis: ${voo.getQuantidadeAssentosIndisponiveis()}")
    }
}