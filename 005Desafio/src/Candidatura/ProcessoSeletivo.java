package Candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

    public static void main(String[] args) {
        System.out.println("--- Início do Processo Seletivo ---");

        selecaoCandidatos();
    }

    static void selecaoCandidatos(){
        String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica", "Fabricio", "Mirela", "Daniela", "Jorge"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        String[] selecionados = new String[5];

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.printf("O candidato %s solicitou o salário de: R$ %.2f%n", candidato, salarioPretendido);

            if (salarioBase >= salarioPretendido){
                System.out.println("-> O candidato " + candidato + " foi selecionado!");
                selecionados[candidatosSelecionados] = candidato;
                candidatosSelecionados++;
            } else {
                System.out.println("-> Aguardando demais candidatos.");
            }
            candidatoAtual++;
            System.out.println("----------------------------------------");
        }

        System.out.println("\n--- Iniciando Fase de Contato com os Selecionados ---");
        imprimirSelecionado(selecionados, candidatosSelecionados);
    }

    static void imprimirSelecionado(String[] candidatos, int totalSelecionados){
        for (int i = 0; i < totalSelecionados; i++) {
            entrandoEmContato(candidatos[i]);
        }
    }

    static void entrandoEmContato(String candidato){
        int tentativas = 1;
        boolean tentarNovamente = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            tentarNovamente = !atendeu;
            if (tentarNovamente){
                tentativas++;
            }
        } while (tentarNovamente && tentativas <= 3);

        if (atendeu){
            System.out.println("Sucesso: O contato com " + candidato + " foi realizado na tentativa número " + tentativas);
        } else {
            System.out.println("Falha: O contato com " + candidato + " NÃO foi realizado (Máximo de tentativas excedido).");
        }
        System.out.println();
    }

    static boolean atender(){
        return new Random().nextInt(3) == 1;
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);
    }
}
