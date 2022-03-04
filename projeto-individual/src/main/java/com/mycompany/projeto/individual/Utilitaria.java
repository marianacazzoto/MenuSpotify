package com.mycompany.projeto.individual;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Utilitaria {
    Scanner leitorString = new Scanner(System.in);
    Scanner leitor = new Scanner(System.in);
    String nomeDigitado;
    
    void exibirLinha(){
       System.out.println("-".repeat(72));
    }
    
    void exibirNome(){
        System.out.println("Digite seu nome: ");
        nomeDigitado = leitorString.nextLine();
        System.out.println(String.format("Olá %s, Bem Vinda(o) ao nosso "
                + "MenuSpotify",nomeDigitado));
     }
      
    Double retornarMutiplicação(){
        System.out.println("Quantas musicas ouve por dia: ");
        Integer musicasInformados = leitor.nextInt();
        System.out.println("Quantos minutos geralmente cada musica tem: ");
        Double minutosInformados = leitor.nextDouble();
        Double totalMinutos = musicasInformados * minutosInformados;
        
        exibirLinha();
        
        System.out.println(String.format("Você costuma passar "
                + "aproximadamente %.0f minutos no Spotify por dia ", totalMinutos));
                
                if(totalMinutos >= 200){
                    System.out.println("--------------Você é um ouvinte fora do normal--------------");
                }
                else{
                    System.out.println("--------------Você é um ouvinte comum no Spotify--------------");
                }
        exibirLinha();
        return totalMinutos;
    }   
    
    String retornarEstiloMusical() {
        System.out.println("Aqui vai uma playlist então: ");
        System.out.println("Qual seu estilo:\n"
                                 + "funk\n"
                                 + "rap\n"
                                 + "pagode\n"
                                 + "gospel");
        System.out.println("--------Digite da mesma forma que está nas opções--------");
        exibirLinha();
        String estiloDigitado = leitorString.nextLine();
        exibirLinha();
        
        if ("funk".equals(estiloDigitado)) {
            System.out.println("Playlist Funk: \n"
                    + "Cavalo De Troia MC Kevin.\n"
                    + "Vida louca Mc Poze do rodo.\n"
                    + "Tipo gin MC Kevin o Chris.\n"
                    + "Bum Bum Tam Tam MC Fioti.\n"
                    + "Toma toma vapo vapo Zé Felipe,MC Danny.\n"
                    + "Atenção Pedro Sampaio, Luísa Sonza.\n"
                    + "Maçã verde Mc Hariel.\n"
                    + "Ilusão (Cracolandia)");
        } else if ("rap".equals(estiloDigitado)) {
            System.out.println("Playlist Rap: \n"
                    + "L7nnon - Motivos \n"
                    + "L7nnon - Algumas Frases \n"
                    + "L7nnon - Gratidão \n"
                    + "Coruja bc1 - OZ \n");
        } else if ("pagode".equals(estiloDigitado)) {
            System.out.println("Playlist Pagode: \n"
                    + "É dor que não passa Ferrugem.\n"
                    + "Porre Dilsinho.\n"
                    + "Quanto tempo faz Thiaguinho.\n"
                    + "Vou ver e te aviso Grupo Pixote.\n"
                    + "Nosso flow Sorriso Maroto.\n"
                    + "Amor falsificado Grupo Menos é Mais.\n"
                    + "Pódio Dilsinho, Jorge e Mateus!");
        }else if ("gospel".equals(estiloDigitado)) {
            System.out.println("Playlist Gospel: \n"
                    + "Oceanos.\n"
                    + "O maior vilão.\n"
                    + "Flores em vida.\n"
                    + "Pai de multidões.\n"
                    + "Retrovisor.\n"
                    + "Raridade.\n"
                    + "Só o começo");
        }
        exibirLinha();
        System.out.println("Aproveite sua nova playlist");
        return estiloDigitado;
    }
    
    String exibirPlaylistInformada(){
        
         System.out.println("Compartilhe as músicas que "
                        + "já tem: (Maximo 10 músicas)");
        String todasMusicas = " ";
        for (int i = 1; i <= 10; i++) {
            System.out.println((i) + "ª Música: ");
            String playlistCompartilhada = leitorString.nextLine();
            todasMusicas += playlistCompartilhada + "\n"; 
        }
        exibirLinha();
        System.out.println(String.format("Essa é a sua: %s",todasMusicas)); 
        exibirNovaPlaylist();
        
        return todasMusicas;
    }
    
    Integer exibirNovaPlaylist() { 
        exibirLinha();
        System.out.println("Digite um número para"
                            + " receber uma Playlist aleatória");
                
        System.out.println("Opções: 1,2,3");
        Integer numeroInformado = leitor.nextInt();
        Integer musicasAleatorias = ThreadLocalRandom.current().nextInt(1,3);
        
        exibirLinha();
        System.out.println("Essa é a nossa: "); 
        
        switch (numeroInformado){
            case 1:
                System.out.println("Playlist NumaNIce: \n"
                                 + "Saudades do tempo\n"
                                 + "Céu azul\n"
                                 + "Pôr do sol na praia\n"
                                 + "Era Uma Vez\n"
                                 + "Intenção\n"
                                 + "Meu talismã");
                break;
            case 2:
                System.out.println("Playlist de Verão: \n"
                                 + "Pé na areia\n"
                                 + "Cerveja De Garrafa\n"
                                 + "Atrasadinha\n"
                                 + "Batom De Cereja\n"
                                 + "Que Sorte A Nossa\n"
                                 + "Nessas Horas\n");
                break;
            case 3:
                System.out.println("Playlist Festeja: \n"
                                 + "Decide Aí\n"
                                 + "Malvadão 3\n"
                                 + "Camisa 10\n"
                                 + "Nem de graça\n"
                                 + "Litrão\n"
                                 + "Cê ta preparada");
                break;
            default:
                break;
        }
        exibirLinha();
        return musicasAleatorias;
    }
    
    void exibirRegrasJogo(){
        System.out.println(String.format("Bem vinda(o) ao nosso "
                        + "caseMusical %s",nomeDigitado));
        
        exibirLinha();
        
        System.out.println("Manual: \n"
                    + "O jogo contém 10 perguntas \n"
                    + "Serão exibidas as 10 perguntas respectivamente\n"
                    + "As perguntas devem ser respondidas na ordem correta\n"
                    + "1 ACERTO = 1 PONTO\n"
                    + "Escreva todas as letras em caixa baixa\n"
                    + "Após responder todas perguntas,será exibida sua pontuação");
         
    }
    
    void iniciarJogo(){
        exibirLinha();
        
        System.out.println("Deseja iniciar o jogo?\n"
                                 + "1 - Sim\n"
                                 + "2 - Não\n");
        exibirLinha();
        Integer escolhaDigitada = leitor.nextInt();
        
        switch(escolhaDigitada){
            case 1:
                exibirLinha();
                System.out.println("Quiz iniciado");
                exibirPerguntas();
                retonarPontuacao();
                break;
            default:
                break;
        }
    }
    
    void exibirPerguntas(){

        exibirLinha();
        
        System.out.println("Pergunta1 - Nome do artista que canta Luz na Caminhada:");
        System.out.println("Pergunta2 - Primeiro sucesso do mc hariel :");
        System.out.println("Pergunta3 - Dono do single: Heartbreak Anniversary");
        System.out.println("Pergunta4 - Maior sucesso da Bruna Karla");
        System.out.println("Pergunta5 - Dono do single: Malvadão 3");
        System.out.println("Pergunta6 - Música famosa do Now United");
        System.out.println("Pergunta7 - Complete a frase: Meu único inimigo mora na ");
        System.out.println("Pergunta8 - Música famosa de Velozes e Furiosos: ");
        System.out.println("Pergunta9 - Nome do grupo que canta: Tudo o que vivi: ");
        System.out.println("Pergunta10 - Qual grupo teve o nome inspirado em um dos discos do Tim Maia: ");
    }
    
    void retonarPontuacao(){
        exibirLinha();
        
        Integer pontos = 10;
        
                System.out.println("Pergunta1 - Resposta: ");
                String pergunta1 = leitorString.nextLine();
                System.out.println("Pergunta2 - Resposta: ");
                String pergunta2 = leitorString.nextLine();
                System.out.println("Pergunta3 - Resposta: ");
                String pergunta3 = leitorString.nextLine();
                System.out.println("Pergunta4 - Resposta: ");
                String pergunta4 = leitorString.nextLine();
                System.out.println("Pergunta5 - Resposta: ");
                String pergunta5 = leitorString.nextLine();
                System.out.println("Pergunta6 - Resposta: ");
                String pergunta6 = leitorString.nextLine();
                System.out.println("Pergunta7 - Resposta: ");
                String pergunta7 = leitorString.nextLine();
                System.out.println("Pergunta8 - Resposta: ");
                String pergunta8 = leitorString.nextLine();
                System.out.println("Pergunta9 - Resposta: ");
                String pergunta9 = leitorString.nextLine();
                System.out.println("Pergunta10 - Resposta: ");
                String pergunta10 = leitorString.nextLine();
                
        System.out.println("-".repeat(72));        
        
        if(!"l7nnon".equals(pergunta1)){
                System.out.println("Pergunta 1: errada");
                pontos--;
            }
        if(!"passei sorrindo".equals(pergunta2)){
                System.out.println("Pergunta 2: errada");
                pontos--;
            }
        if(!"giveon".equals(pergunta3)){
                System.out.println("Pergunta 3: errada");
                pontos--;
            } 
        if(!"sou humano".equals(pergunta4)){
                System.out.println("Pergunta 4: errada");
                pontos--;
            }
        if(!"xamã".equals(pergunta5)){
                System.out.println("Pergunta 5: errada");
                pontos--;
            } 
        if(!"all day".equals(pergunta6)){
                System.out.println("Pergunta 6: errada");
                pontos--;
            } 
        if(!"mente".equals(pergunta7)){
                System.out.println("Pergunta 7: errada");
                pontos--;
            } 
        if(!"see you again".equals(pergunta8)){
                System.out.println("Pergunta 8: errada");
                pontos--;
            } 
        if(!"vocal livre".equals(pergunta9)){
                System.out.println("Pergunta 9: errada");
                pontos--;
            } 
        if(!"racionais".equals(pergunta10)){
                System.out.println("Pergunta 10: errada");
                pontos--;
            } 
        
        exibirLinha();
        
        System.out.println(String.format("-------------------Acumulou %d pontos-------------------",pontos));
            
        if (pontos < 5) {
            System.out.println("-------------------Tente outra vez!!!-------------------");
        }
        else if(pontos < 8){
            System.out.println("-------------------Na proxima você pode se sair melhor-------------------");
        }
        else{
            System.out.println("-------------------Caraca você é um gênio-------------------");
        } 
        exibirLinha();
    }
    
    void encerramentoPrograma(){
        System.out.println(String.format("Agradecemos sua visita"
                + " ao nosso MenuSpotify %s!",nomeDigitado));
    }
}
