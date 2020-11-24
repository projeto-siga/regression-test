package prodesp.utils;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataHora {


	public String formataDataAtual(String formato) {
		Timestamp dataAtual = new Timestamp(System.currentTimeMillis());
		return new SimpleDateFormat(formato).format(dataAtual);
	}

	public String getAnoMesDiaHoraMinSegAtual() {
		return formataDataAtual("yyyyMMddHHmmss");
	}

	public String getAnoMesDiaHoraMinAtual() {
		return formataDataAtual("yyyyMMddHHmm");
	}

	public String getAnoMesDiaAtual() {
		return formataDataAtual("yyyyMMdd");
	}

	public String getDataHoraMinSegAtualFormatoPadrao() {
		return formataDataAtual("dd/MM/yyyy HH:mm:ss");
	}

	public String getDataHoraMinSegAtualSeparadoUnderline() {
		return formataDataAtual("dd_MM_yyyy_HH_mm_ss");
	}
	
	public String getDataAtualSeparadoBarra() {
		return formataDataAtual("dd/MM/yyyy");
	}

	// Converte String em data
	public Date convertStringEmData(String sData) throws ParseException {
		return new SimpleDateFormat("dd/MM/yyyy").parse(sData);
	}

	// Converte data em String
	public String convertDataEmString(Date sData) throws ParseException {
		return new SimpleDateFormat("dd/MM/yyyy").format(sData);
	}

	// Retorna a data enviada por parâmetro com a diferença de dias enviados por parâmetro
	public String adicionarOuSubtrairDiasAPartirDeUmaData(String sData, int iQtdeDias) throws ParseException {
		Date dData = convertStringEmData(sData);
		Calendar calendario = Calendar.getInstance();
		calendario.setTime(dData);
		calendario.add(Calendar.DAY_OF_MONTH, iQtdeDias);
		return convertDataEmString(calendario.getTime());
	}

	// Retorna a data atual com a diferença de dias enviados por parâmetro
	public String adicionarOuSubtrairDiasAPartirDeHoje(int qtdeDias) throws ParseException {
		return adicionarOuSubtrairDiasAPartirDeUmaData(getDataAtualSeparadoBarra(), qtdeDias);
	}
}
