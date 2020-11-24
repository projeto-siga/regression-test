package prodesp.utils;

import java.io.File;

public class Enderecos {

	   /**********  URL  **********/

		public static String URL_GRID = "http://10.200.142.201:4444/wd/hub";
		
	    public static String URLInicial()
	    {
	        switch (Propriedades.AMBIENTE_EXECUCAO)
	        {
	            case DESENVOLVIMENTO:
	                return "http://10.2.100.210:8080/sigaex/";
	            case HOMOLOGACAO:
	                return "https://www.documentos.homologacao.spsempapel.sp.gov.br/siga";
	            case PRODUCAO:
	                return "https://www.documentos.spsempapel.sp.gov.br/siga/";
	            case CONFIG:
	            	return "http://www.documentos.config.spsempapel.sp.gov.br/";
	            case DEMO:
	            	return "http://www2.documentos.demo.spsempapel.sp.gov.br/";
	            default:
	                return "http://documentos.homologacao.spsempapel.sp.gov.br/";
	        }

	    }

	    /**********  Diretórios  **********/


	    public static String diretorioRelatorioEvidenciaTeste()
	    {
	        switch (Propriedades.AMBIENTE_EXECUCAO)
	        {
	            case DESENVOLVIMENTO:
	                return "src" + File.separator + "test" + File.separator + "resources" + File.separator + "relatorios" + File.separator;  
	            case HOMOLOGACAO:
	            	return "src" + File.separator + "test" + File.separator + "resources" + File.separator + "relatorios" + File.separator;
	            case PRODUCAO:
	            	return "src" + File.separator + "test" + File.separator + "resources" + File.separator + "relatorios" + File.separator;
	            default:
	                return "src" + File.separator + "test" + File.separator + "resources" + File.separator + "relatorios" + File.separator;
	        }
	    }
	    
	    public static String diretorioScreenshot()
	    {
	        switch (Propriedades.AMBIENTE_EXECUCAO) 
	        {
	            case DESENVOLVIMENTO:
	                return "src" + File.separator + "test" + File.separator + "resources" + File.separator + "screenshot" + File.separator;
	            case HOMOLOGACAO:
	            	return "src" + File.separator + "test" + File.separator + "resources" + File.separator + "screenshot" + File.separator;
	            case PRODUCAO:
	            	return "src" + File.separator + "test" + File.separator + "resources" + File.separator + "screenshot" + File.separator;
	            default:
	                return "src" + File.separator + "test" + File.separator + "resources" + File.separator + "screenshot" + File.separator;
	        }
	    }
	  
	    
	    public static final String getCaminhoDadosTeste()
	    {
	        switch (Propriedades.AMBIENTE_EXECUCAO)  
	        {
	            case DESENVOLVIMENTO:
	            	return "src" + File.separator + "test" + File.separator + "resources" + File.separator + "dados" + File.separator; 
	            case HOMOLOGACAO:
	            	return "src" + File.separator + "test" + File.separator + "resources" + File.separator + "dados" + File.separator;
	            case PRODUCAO:
	            	return "src" + File.separator + "test" + File.separator + "resources" + File.separator + "dados" + File.separator;
	            default:
	            	return "src" + File.separator + "test" + File.separator + "resources" + File.separator + "dados" + File.separator;
	        }
	    }
	    
	    // Imagens
	    public static String logoProdesp = "src" + File.separator + "test" + File.separator + "resources" + File.separator +
	    		"imagens" + File.separator + "LogoProdesp.jpg";
}
