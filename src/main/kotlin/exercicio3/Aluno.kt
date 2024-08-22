package exercicio3

class Aluno(var nome : String, var notas : DoubleArray) {
    open fun aprovado(){
        if(notas.average() >= 7){
            println("O aluno $nome está aprovado! Nota: ${notas.average()}")
        }else{
            println("O aluno $nome está reprovado! Nota: ${notas.average()}")
        }
    }
}