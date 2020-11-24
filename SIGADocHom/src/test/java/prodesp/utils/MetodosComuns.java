package prodesp.utils;

public class MetodosComuns {

	public String retornaApenasNros(String sValor) {
		String sValorSomenteNros = null;
		for (int i = 0; i < sValor.length(); i++) {
			if (Character.isDigit(sValor.charAt(i))){
				sValorSomenteNros += Character.toString(sValor.charAt(i)); 		
			}			
		}
		return sValorSomenteNros;
	}
	
	public String completaCaracterAEsquerda(String sTexto, String sCaracter, int QtdeTotalCaracter) {
	  int tamanhoTexto = sTexto.length();
      while(tamanhoTexto < QtdeTotalCaracter){
    	  sTexto=sCaracter+sTexto;
    	  tamanhoTexto++;
      }
      return sTexto;
	}	
}
