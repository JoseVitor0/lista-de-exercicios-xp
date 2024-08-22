package exercicio2

class ex02 {
    fun contarPalavras(texto: String){
        val palavras = texto.trim().split("\\s+".toRegex())
        println("O texto inserido contém ${palavras.size} palavras")
    }
}