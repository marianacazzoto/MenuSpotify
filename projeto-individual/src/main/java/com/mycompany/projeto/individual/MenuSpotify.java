package com.mycompany.projeto.individual;

import java.util.Scanner;

public class MenuSpotify {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner leitorString = new Scanner(System.in);
        Utilitaria util = new Utilitaria();
        
        System.out.println("Digite seu nome: ");
        String nomeDigitado = leitorString.nextLine();
        
        util.exibirLinha();
        util.exibirNome(nomeDigitado);
        util.exibirLinha();
        Integer resposta;
        do{    
        System.out.println("Já tem uma Playlist no Spotify?\n"
                + "Digite: \n"
                + "1 - Sim \n"
                + "2 - Não \n"
                + "3 - Trocar Playlist \n"
                + "4 - Jogar\n"
                + "5 - Sair do programa");
        util.exibirLinha();
        
        resposta = leitor.nextInt();
        util.exibirLinha();

        switch (resposta) {
            case 1:
                System.out.println("Quantas musicas ouve por dia: ");
                Integer musicasInformados = leitor.nextInt();
                System.out.println("Quantos minutos geralmente cada musica tem: ");
                Double minutosInformados = leitor.nextDouble();
                
                util.exibirLinha();
                
                util.retornarMutiplicação(musicasInformados, minutosInformados);
                break;
            case 2:
                util.exibirLinha();
                util.retornarEstiloMusical();

                break;
            case 3:
                util.exibirPlaylistInformada();
                util.exibirNovaPlaylist();
                break;
                
            case 4:
                util.exibirRegrasJogo(nomeDigitado);
                util.exibirLinha();
                util.iniciarJogo();
                util.exibirLinha();
                util.exibirPerguntas();
                util.exibirLinha();
                util.retonarPontuacao();
        
        break;
            default:
                util.exibirLinha();
                util.encerramentoPrograma(nomeDigitado);
                break;       
        }
        }while(resposta != 5);
    }
}

