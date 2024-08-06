package application;

import entities.Product;

import java.util.Scanner;

public class ProgramaProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter Product Data:");
        System.out.println("Name: ");
        String name = scanner.next();
        System.out.println("Price: ");
        double price = scanner.nextDouble();
        System.out.println("Quantity in Stock: ");
        int quantity = scanner.nextInt();
        Product product = new Product(name,price,quantity);

        //System.out.println("Product data: " + product.name + " ," +
        //    "R$: " + product.price + " ," + product.quantity + " Units"

        System.out.println();
        System.out.println("Enter the number of products to be added in stock: ");
        quantity = scanner.nextInt();
        product.AddProducts(quantity);

        System.out.println();
        System.out.println("Update data: " + product);
        System.out.println();
        System.out.println("Enter the number of products to be removed from stock: ");
        quantity = scanner.nextInt();
        product.RemoveProdutc(quantity);
        System.out.println();
        System.out.println("Update data: " + product);
        scanner.close();
        }
}
