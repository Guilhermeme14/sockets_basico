package socket_basico;

import java.net.*;
import java.io.*;
import javax.swing.*;

public class Client {

    public static void main(String args[]) {
        try {
            Socket servidor = new Socket("ip", 4444);//endereco e porta
            PrintWriter out = new PrintWriter(
                    servidor.getOutputStream(), true);
            String mensagem = "";
            while (!mensagem.equals("fim")) {
                mensagem = JOptionPane.
                        showInputDialog("Digite a Mensagem ou fim para sair");
                out.println(mensagem); //escreve a mensagem
            }
        } catch (IOException io) {
            System.err.println("Problemas de IO");
        }
    }
}
