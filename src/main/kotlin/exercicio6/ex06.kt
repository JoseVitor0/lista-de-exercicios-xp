package exercicio6

class ex06 {
    fun medirTemperaturas(){
        println("Informe a temperatura dos 30 dias: ")
        var temperaturasMensal = DoubleArray(30)
        var tempMin = 0.0
        var tempMax = 0.0
        var diaMin = 0
        var diaMax = 0
        for(i in temperaturasMensal.indices){
            print("Temperatura do ${i+1} dia: ")
            temperaturasMensal[i] = readln().toDouble()
            if(i == 0){
                tempMin = temperaturasMensal[i]
                tempMax = temperaturasMensal[i]
            }

            when{
                temperaturasMensal[i] < tempMin -> {tempMin = temperaturasMensal[i] ; diaMin = i+1};
                temperaturasMensal[i] > tempMax ->  {tempMax = temperaturasMensal[i] ; diaMax = i+1};
            }
        }
        var media = temperaturasMensal.average()
        println("Com base nas temperaturas informadas, os resultados são os seguintes: ")
        println("A maior temperatura foi de $tempMax, registrada no dia $diaMax")
        println("A menor temperatura foi de $tempMin, registrada no dia $diaMin")
        println("A temperatura média registrada foi de $media")
    }
}