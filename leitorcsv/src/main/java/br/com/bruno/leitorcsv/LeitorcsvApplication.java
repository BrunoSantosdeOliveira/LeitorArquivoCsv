package br.com.bruno.leitorcsv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.opencsv.CSVReader;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class LeitorcsvApplication {
private static final String CSV_endreco = "C:/Users/bruno/Downloads/temperaturas.csv";

	public static void main(String[] args) {

		//SpringApplication.run(LeitorcsvApplication.class, args);
		try {
			CSVReader csvReader = new CSVReader(new FileReader(new File(CSV_endreco)));
			List<List<String>> linhas = new ArrayList<List<String>>();
			String[] colunas = null;
			while ( (colunas = csvReader.readNext()) != null){
              linhas.add(Arrays.asList(colunas));
			}
			linhas.forEach(cols -> {
				System.out.println(cols);
			});
		}catch (Exception e){
           e.printStackTrace();
		}
	}

}
