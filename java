(script.js) // Variável para guardar a pontuação da fazenda
let pontuacaoSustentavel = 0;

function adicionarPontos(valor) {
    // Adiciona os pontos da ação clicada
    pontuacaoSustentavel += valor;

    // Impede que passe de 100%
    if (pontuacaoSustentavel > 100) {
        pontuacaoSustentavel = 100;
    }

    // Atualiza o número na tela do usuário
    document.getElementById("pontos").innerText = pontuacaoSustentavel;

    // Altera a mensagem baseada no progresso
    let mensagemHTML = document.getElementById("mensagem-status");

    if (pontuacaoSustentavel >= 15 && pontuacaoSustentavel < 45) {
        mensagemHTML.innerText = "Bom começo! A fazenda está reduzindo impactos.";
        mensagemHTML.style.color = "#f57c00"; // Cor laranja
    } else if (pontuacaoSustentavel >= 45 && pontuacaoSustentavel < 80) {
        mensagemHTML.innerText = "Ótimo progresso! Produção inteligente e muito verde.";
        mensagemHTML.style.color = "#388e3c"; // Cor verde
    } else if (pontuacaoSustentavel >= 80) {
        mensagemHTML.innerText = "Parabéns! Equilíbrio perfeito entre produção e preservação!";
        mensagemHTML.style.color = "#1b5e20"; // Verde forte / Negrito
        mensagemHTML.style.fontWeight = "bold";
    }
}
