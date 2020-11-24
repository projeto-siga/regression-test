package prodesp.dados.pesquisa;

public class PesquisarDoctosDados {

	public enum Situacao {
		Devolver("A devolver"),
		DevolverForaPrazo("A devolver (Fora do prazo)"),
		ReceberFisico("A Receber (F�sico)"),
		AguardandoAndamento("Aguardando Andamento"),
		AguardandoDevolucao("Aguardando devolu��o"),
		AguardandoDevolucaoForaPrazo("Aguardando devolu��o (Fora do prazo)"),
		AnexoPendenteAssinatura("Anexo Pendente Assinatura/Confer�ncia"),
		Apensado("Apensado"),
		ArquivoCorrente("Arquivo Corrente"),
		CaixaDeEntradaDigital("Caixa de Entrada (Digital)"),
		Cancelado("Cancelado"),
		ComoGestor("Como Gestor");
/*		"Como Interessado"
		"Como Subscritor"
		"Despacho Pendente de Assinatura"
		"Disponibilizado"
		"Documento Assinado com Senha"
		"Elaborar Parte de Documento Colaborativo"
		"Em Elabora��o"
		"Finalizar Documento Colaborativo"
		"Juntado"
		"Juntado a Documento Externo"
		"Movimenta��o Assinada com Senha"
		"Movimenta��o Conferida com Senha"
		"Pendente de Anexa��o"
		"Pendente de Assinatura"
		"Publica��o solicitada"
		"Publicado"
		"Remetido para Publica��o"
		"Revisar"
		"Sem Efeito"
		"Sobrestado"
		"Transferido"
		"Transferido (Digital)"
		"Transferido para �rg�o Externo"*/
		private String value;

	    Situacao(final String value) {
	        this.value = value;
	    }

	    public String getValue() {
	        return value;
	    }

	    @Override
	    public String toString() {
	        return this.getValue();
	    }

	}
}
