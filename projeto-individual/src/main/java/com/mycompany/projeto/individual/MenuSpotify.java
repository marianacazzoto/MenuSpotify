package com.mycompany.projeto.individual;

import java.util.Scanner;

public class MenuSpotify {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Utilitaria util = new Utilitaria();
        util.exibirNome();
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
                util.retornarMutiplicação();
                break;
            case 2:
                util.retornarEstiloMusical();
                break;
            case 3:
                util.exibirPlaylistInformada();
                break;
            case 4:
                util.exibirRegrasJogo();
                util.iniciarJogo();
                break;
            default:
                util.encerramentoPrograma();
                break;       
        }
        }while(resposta != 5);
    }
}

