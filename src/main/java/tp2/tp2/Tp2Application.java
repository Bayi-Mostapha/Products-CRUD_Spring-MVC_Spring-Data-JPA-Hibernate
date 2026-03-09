package tp2.tp2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import tp2.tp2.entities.Product;
import tp2.tp2.repository.ProductRepository;

@SpringBootApplication
public class Tp2Application {

	public static void main(String[] args) {
		SpringApplication.run(Tp2Application.class, args);
	}

	@Bean
	public CommandLineRunner start(ProductRepository productRepository) {
		return args -> {
			productRepository.save(Product.builder()
					.name("Computer")
					.price(6500)
					.quantity(11)
					.build());

			productRepository.save(Product.builder()
					.name("Printer")
					.price(2000)
					.quantity(7)
					.build());
			productRepository.save(Product.builder()
					.name("Smartphone")
					.price(3500)
					.quantity(5)
					.build());
			productRepository.findAll().forEach(p -> {
				System.out.println(p.toString());
			});
		};
	}
}
