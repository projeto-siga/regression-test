package prodesp.dados.pesquisa;

public class PesquisarDoctosDados {

	public enum Situacao {
		Devolver("A devolver"),
		DevolverForaPrazo("A devolver (Fora do prazo)"),
		ReceberFisico("A Receber (Físico)"),
		AguardandoAndamento("Aguardando Andamento"),
		AguardandoDevolucao("Aguardando devolução"),
		AguardandoDevolucaoForaPrazo("Aguardando devolução (Fora do prazo)"),
		AnexoPendenteAssinatura("Anexo Pendente Assinatura/Conferência"),
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
		"Em Elaboração"
		"Finalizar Documento Colaborativo"
		"Juntado"
		"Juntado a Documento Externo"
		"Movimentação Assinada com Senha"
		"Movimentação Conferida com Senha"
		"Pendente de Anexação"
		"Pendente de Assinatura"
		"Publicação solicitada"
		"Publicado"
		"Remetido para Publicação"
		"Revisar"
		"Sem Efeito"
		"Sobrestado"
		"Transferido"
		"Transferido (Digital)"
		"Transferido para Órgão Externo"*/
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
