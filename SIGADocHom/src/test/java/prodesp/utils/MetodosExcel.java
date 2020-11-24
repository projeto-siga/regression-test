package prodesp.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MetodosExcel {
	
	private static XSSFSheet ExcelWSheet;

	private static XSSFWorkbook ExcelWBook;

	private static XSSFCell ExcelCelula;

	public static Object[][] getTabelaArray(String caminhoENomeArquivo, String nomeSheet)
			throws Exception {

		String[][] tabArray = null;

		try {

			FileInputStream arquivoExcel = new FileInputStream(caminhoENomeArquivo);

			// Acesso a pasta do arquivo

			ExcelWBook = new XSSFWorkbook(arquivoExcel);

			ExcelWSheet = ExcelWBook.getSheet(nomeSheet);

			int primeiraLinha = 1;

			int primeiraColuna = 0;

			int lt, ct;

			int totalRows = ExcelWSheet.getLastRowNum();

			int totalCols = ExcelWSheet.getRow(0).getLastCellNum(); 

			tabArray = new String[totalRows][totalCols];

			System.out.println("Total linhas: " + totalRows + " e total colunas: " + totalCols);
			
			lt = 0;

			for (int l = primeiraLinha; l <= totalRows; l++, lt++) {

				ct = 0;

				for (int c = primeiraColuna; c <= totalCols-1; c++, ct++) {
					tabArray[lt][ct] = getDadoCelula(l, c);

					System.out.println("linha "+lt+" coluna "+ct+" "+tabArray[lt][ct]);
				}
			}
		}

		catch (FileNotFoundException e) {

			System.out.println("Arquivo Excel não encontrado: " + e.getMessage());

			e.printStackTrace();

		}

		catch (IOException e) {

			System.out.println("Não pode ler arquivo Excel: " + e.getMessage());

			e.printStackTrace();

		}

		return (tabArray);

	}

	public static String getDadoCelula(int RowNum, int ColNum) throws Exception {

		try {
			ExcelCelula = ExcelWSheet.getRow(RowNum).getCell(ColNum);		
			
			CellType tipoDaCelula = ExcelCelula.getCellType();

			switch (tipoDaCelula) {
			case NUMERIC:
				double valorNum = ExcelCelula.getNumericCellValue();
				int valorNumerico = (int) valorNum;
				return Integer.toString(valorNumerico);
			case STRING:
				String valorString = ExcelCelula.getStringCellValue();
				return valorString;
			case FORMULA:
				String valorFormula = ExcelCelula.getStringCellValue(); 
				return valorFormula;	
			default:
				return "";
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());

			throw (e);
		}

	}
}
