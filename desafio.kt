// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Usuario(var nome: String){
    override fun toString(): String{
        return nome
    }
}

data class ConteudoEducacional(val nome: String, var periodo: String)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario, conteudo: ConteudoEducacional) {
    inscritos.add(usuario)
    println("$usuario matriculado na formação $nome no conteúdo $conteudo." )
    }
}

fun main() {
    val usuario1 = Usuario ("Thiago")
    val usuario2 = Usuario ("Carlos")

    val conteudo1 = ConteudoEducacional("Introdução ao kotlin", "Matutino")
    val conteudo2 = ConteudoEducacional("Programação Orientada a objetos", "Noturno")
    
    val formacao = Formacao("Desenvolvimento de Software", listOf(conteudo1, conteudo2))

    formacao.matricular(usuario1, conteudo1)
    formacao.matricular(usuario2,conteudo2)

println("Inscritos na formação ${formacao.nome}: ${formacao.inscritos.map { "${it.nome} - ${formacao.nome} - ${formacao.conteudos.firstOrNull()?.periodo}" }}")

}