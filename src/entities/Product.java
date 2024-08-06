package entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    //calculo do Total no Estoque
    public double TotalValueInStock(){
        return this.quantity * this.price;
    }
    public void AddProducts(int quantity){
        this.quantity += quantity;
    };
    public void RemoveProdutc(int quantity){
        this.quantity -= quantity;
    };
    //usei o toString e o String.format para imprimir com duas casas decimais
    @Override
    public String toString() {
        return name + ", $" + String.format("%.2f" , price) + ", " + quantity + " units," + " Total: $"
                + String.format("%.2f" ,TotalValueInStock());
    }

}
