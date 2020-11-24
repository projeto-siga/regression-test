package prodesp.utils;

public class Propriedades {

	/******** Local de Execucao ************/
	public static LocalExecucao TIPO_EXECUCAO = LocalExecucao.LOCAL;

	public enum LocalExecucao {
		LOCAL, GRID, NUVEM
	}

	/******** Ambiente de execucao ************/
	public static AmbienteExecucao AMBIENTE_EXECUCAO = AmbienteExecucao.HOMOLOGACAO;
	public enum AmbienteExecucao {
		DESENVOLVIMENTO, HOMOLOGACAO, PRODUCAO, CONFIG, DEMO
	}

	/******** Tempo ************/

	public static int TEMPO_ESPERA_SLEEP = 400;
	public static int TEMPO_ESPERA_MS = 3000;
	public static int TEMPO_ESPERA_MS_MAIOR = 5000;
	public static int TEMPO_ESPERA_SEG = 2;
	public static int TEMPO_ESPERA_SEG_MEDIO = 5;
	public static int TEMPO_ESPERA_SEG_ALTO = 8;

	/******** Navegador ************/

	public TipoNavegadores TIPO_NAVEGADOR;

	// Informar navegador se a execução for sem Suite, apenas execução de uma classe.
	public void atribuirTipoNavegador(TipoNavegadores tpNavegador) {
		if (EXECUTAR_SUITE) {
			TIPO_NAVEGADOR = tpNavegador;
		}
	}

	public TipoNavegadores obterTipoNavegador() {
		if (!EXECUTAR_SUITE) {
			return TIPO_NAVEGADOR = TipoNavegadores.CHROME;
		}
		return TIPO_NAVEGADOR;
	}
	
	// Tipo de Navegadores
	public enum TipoNavegadores {
		CHROME, FIREFOX, EDGE, IE
	}

	/******** Variáveis ************/

	// Executar por suite ou apenas um teste
	public static boolean EXECUTAR_SUITE = false;

	// Fechar navegador ou não
	public static boolean FECHAR_NAVEGADOR = false;

	// Gerar relatório de Evidência de Teste
	public static boolean GERAR_RELAT_EVIDENCIA_TESTE = true;
	
}
