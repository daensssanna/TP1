/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

/**
 *
 * @author Alumno
 */
public class cuatriciclos {
    private String marca;
    private short cilindradaCM3;
    private short peso;
    
    public cuatriciclos(String marca, short cilindrada, short peso){
            this.marca = marca;
            this.cilindradaCM3 = cilindrada;
            this.peso = peso;
    }
    
    public void saludar() {
       System.out.println("Bienvenido");
    }
    
    public void mostrarInformacion() {
          System.out.println("Marca: " + marca);
          System.out.println("Cilindrada: " + cilindradaCM3 + " cc");
          System.out.println("Peso: " + peso + " kg");

    }
    
    public String getMarca() {
        return marca;
    }
  
  public void setMarca(String marca) {
   this.marca = marca;
  }
  
  public short getCilindrada() {
    return cilindradaCM3;
  }
  
  public void setCilindrada(short cilindradaCM3) {
   this.cilindradaCM3 = cilindradaCM3;
  }
 public short getPeso() {
    return peso;
  }
  
  public void setPeso(short peso) {
   this.peso = peso;
  }

}