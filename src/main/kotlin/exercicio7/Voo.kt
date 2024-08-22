package exercicio7

class Ex07 {

    class Voo(val numeroDoVoo: Int, val capacidade: Int) {
        private val assentos = BooleanArray(capacidade) { true } // Inicializa todos os assentos como disponíveis

        fun reservarAssento(assento: Int): Boolean {
            if (assento in 1..capacidade && assentos[assento - 1]) {
                assentos[assento - 1] = false
                return true
            }
            return false
        }

        fun verificarDisponibilidade(assento: Int): Boolean {
            return assento in 1..capacidade && assentos[assento - 1]
        }

        fun getQuantidadeAssentosDisponiveis(): Int {
            return assentos.count { it }
        }

        fun getQuantidadeAssentosIndisponiveis(): Int {
            return assentos.count { !it }
        }
    }

}