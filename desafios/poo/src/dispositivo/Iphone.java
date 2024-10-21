package desafio_poo.dispositivo;

import desafio_poo.musica.ReprodutorMusical;
import desafio_poo.telefone.AparelhoTelefonico;
import desafio_poo.internet.NavegadorInternet;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
	public void tocar() {
		System.out.println("Tocando música.");
	}
	
	public void pausar() {
		System.out.println("Música pausada.");
	}
	
	public void selecionarMusica(String musica) {
		System.out.printf("Selecionando a música %s.", musica);
	}
	
	
	public void ligar(String numero) {
		System.out.printf("Ligando para o número %s.", numero);
	}
	
	public void atender() {
		System.out.println("Atendendo a ligação.");
	}
	
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando o correio de voz.");
	}
	
	
	public void exibirPagina(String url) {
		System.out.printf("Exibindo a página %s.", url);
	}
	
	public void adicionarNovaAba() {
		System.out.println("Criando uma nova aba.");
	}
	
	public void atualizarPagina() {
		System.out.println("Atualizando a página.");
	}
}
