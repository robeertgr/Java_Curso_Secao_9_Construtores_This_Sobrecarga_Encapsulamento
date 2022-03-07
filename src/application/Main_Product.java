package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main_Product {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira os dados do produto: ");
        System.out.print("Nome: ");
        String name = sc.nextLine();
        System.out.print("Preço: ");
        double price = sc.nextDouble();
        System.out.print("Quantidade em estoque: ");
        int quantity = sc.nextInt();
        Product product = new Product(name, price, quantity);

        System.out.println("\nDados do produto: " + product);
        System.out.print("\nInsira a quantidade de produtos a serem adicionados em estoque: ");
        quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println("\nDados atualizados: " + product);

        System.out.print("\nInsira a quantidade de produtos a serem removidos do estoque: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println("\nDados atualizados: " + product);

        sc.close();
    }
}
