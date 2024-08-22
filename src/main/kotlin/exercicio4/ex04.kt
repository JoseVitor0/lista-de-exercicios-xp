package exercicio4

class ex04() {
    fun receberNomes(){
        println("Entre com os nomes dos 10 alunos:")
        var alunos = Array(10){" "}
        for (i in alunos.indices){
            print("Nome do ${i+1} aluno: ")
            alunos[i] = readln()
        }
        alunos.sort()
        println("Lista de alunos ordenada: ")
        println(alunos.joinToString())
    }
}