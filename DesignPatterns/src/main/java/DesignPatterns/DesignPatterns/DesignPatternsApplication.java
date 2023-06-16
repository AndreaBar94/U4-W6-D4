package DesignPatterns.DesignPatterns;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import DesignPatterns.DesignPatterns.adapter.Adapter;
import DesignPatterns.DesignPatterns.adapter.Info;
import DesignPatterns.DesignPatterns.adapter.UserData;
import DesignPatterns.DesignPatterns.chainOfResponsibility.Officer;
import DesignPatterns.DesignPatterns.chainOfResponsibility.Role;
import DesignPatterns.DesignPatterns.composite.Book;
import DesignPatterns.DesignPatterns.composite.Page;
import DesignPatterns.DesignPatterns.composite.Section;

@SpringBootApplication
public class DesignPatternsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternsApplication.class, args);
		
		System.out.println("--------------------------ADAPTER--------------------------");
        Info info = new Info();
        info.setNome("Andrea");
        info.setCognome("Barocchi");
        info.setDataDiNascita(LocalDate.of(1994, 6, 12));

        Adapter adapter = new Adapter(info);

        UserData userData = new UserData();
        userData.getData(adapter);

        System.out.println("Nome completo: " + userData.getNomeCompleto());
        System.out.println("Età: " + userData.getEta());
        
        System.out.println("--------------------------COMPOSITE--------------------------");
        	
        List<String> authors = Arrays.asList("J.K. Rowling", "Kafka");
        double price = 29.99;
        Book book = new Book(authors, price);

        // Creazione di pagine
        Page page1 = new Page(10);
        Page page2 = new Page(8);

        // Creazione di sezioni
        Section section1 = new Section();
        Section section2 = new Section();

        // Aggiunta di pagine alle sezioni
        section1.addPages(page1);
        section2.addPages(page2);

        // Aggiunta di sezioni al libro
        book.addSection(section1);
        book.addSection(section2);

        // Stampa del libro
        book.print();
        
        // Ottenimento del numero totale di pagine del libro
        int totalPages = book.getPages();
        System.out.println("Total number of pages: " + totalPages);
        
        System.out.println("--------------------------CHAIN OF RESPONSIBILITY--------------------------");
        
        Officer captain = new Officer(1000, Role.CAPITANO);
        Officer major = new Officer(2000, Role.MAGGIORE);
        Officer liutenant = new Officer(3000, Role.TENENTE);
        Officer colonel = new Officer(4000, Role.COLONNELLO);
        Officer general = new Officer(5000, Role.GENERALE);
        
        captain.setSuperiorOfficer(major);
        major.setSuperiorOfficer(liutenant);
        liutenant.setSuperiorOfficer(colonel);
        colonel.setSuperiorOfficer(general);
        
        int amountChecker = 2000;
        
        
	}

}
