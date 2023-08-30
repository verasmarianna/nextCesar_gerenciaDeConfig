programa {
  funcao inicio() {
    cadeia cor

    escreva("Digite a cor da camisa: ")
    leia(cor)

    enquanto ((cor != "preta") e (cor != "branca")){
      escreva("Digite novamente a cor: ")
      leia(cor)
    }
    escreva("Cor correta!")
  }
}

