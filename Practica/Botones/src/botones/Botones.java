/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Botones;
/*Demo hecho por INFORUX*/
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.WindowConstants;

public class Botones{

    JFrame frame;
    JPanel panelSuperior, panelInferior;
    JButton bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt0, btRT, btCE, btCL, btMas, btMenos, btMul, btDiv, btIgual, btMN, btPunto;
    JTextField pantalla;

    public Botones(){
        construyePanelSuperior();
        construyePanelInferior();
        construyeVentana();}

    void construyePanelSuperior(){
        panelSuperior = new JPanel ();
        panelSuperior.setLayout(new FlowLayout());
        pantalla = new JTextField(20);
        panelSuperior.add(pantalla);}

    void construyePanelInferior(){
        panelInferior= new JPanel();
        panelInferior.setLayout(new GridLayout(5,4,8,8));
        bt1=new JButton("1");
        bt2=new JButton("2");
        bt3=new JButton("3");
        bt4=new JButton("4");
        bt5=new JButton("5");
        bt6=new JButton("6");
         bt7=new JButton("7");
        bt8=new JButton("8");
        bt9=new JButton("9");
        bt0=new JButton("0");
        btRT=new JButton("Rtc");
        btCE=new JButton("CE");
        btCL=new JButton("CL");
        btMas=new JButton("+");
        btMenos=new JButton("-");
        btMul=new JButton("x");
        btDiv=new JButton("/");
        btIgual=new JButton("=");
        btMN=new JButton("+/-");    
        btPunto=new JButton(".");
        panelInferior.add(btRT);
        panelInferior.add(btCE);
        panelInferior.add(btCL);
        panelInferior.add(btMN);
        panelInferior.add(bt7);
        panelInferior.add(bt8);
        panelInferior.add(bt9);
        panelInferior.add(btDiv);
        panelInferior.add(bt4);
        panelInferior.add(bt5);
        panelInferior.add(bt6);
        panelInferior.add(btMul);
        panelInferior.add(bt1);
        panelInferior.add(bt2);
        panelInferior.add(bt3);
        panelInferior.add(btMenos);
        panelInferior.add(bt0);
        panelInferior.add(btPunto);
        panelInferior.add(btIgual);
        panelInferior.add(btMas);}

    void construyeVentana(){
        frame =new JFrame("Calculadora ");
        frame.setLayout(new BoxLayout(frame.getContentPane(),BoxLayout.Y_AXIS));
        frame.add(panelSuperior);
        frame.add(panelInferior);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);}

    public static void main(String [] inforux){
        new Botones();}
}