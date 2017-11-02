/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package llamarmetodos;

/**
 *
 * @author Diego
 */
public class LlamarMetodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        printOne();
	printOne();
	printTwo();
    }
    
    public static void printOne() {
		System.out.println("Hello World");
	}

	public static void printTwo() {
		printOne();
		printOne();
	}
    
}
