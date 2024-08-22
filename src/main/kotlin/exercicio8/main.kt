package exercicio8

import exercicio8.ex08.Produto

fun main(){
    val produtos = mutableListOf<Produto>()

    repeat(5) {
        print("Nome do produto: ")
        val nome = readLine()!!
        print("Quantidade inicial: ")
        val quantidade = readLine()!!.toInt()
        print("Nível mínimo: ")
        val nivelMinimo = readLine()!!.toInt()
        print("Nível máximo: ")
        val nivelMaximo = readLine()!!.toInt()

        val produto = Produto(nome, quantidade, nivelMinimo, nivelMaximo)
        produtos.add(produto)
        produto.reporEstoque()
        }
}