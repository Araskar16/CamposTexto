/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campostexto;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
import javax.swing.JButton;




/**
 *
 * @author soporte
 */
public class MiFrame extends JFrame {
    
    private JTextField field_usuario;
    private JPasswordField field_contrasena;
    private JButton button_login;
    private String usuarios[][] = {
            //email, contraseña
             {"usuario1@email.com", "123"},
             {"usuario2@email.com", "456"},
             {"usuario3@email.com", "789"}};
            
     
    public boolean validPass(String Pass){
        try{
            Integer.parseInt(Pass);
            return true;
        }catch(Exception e){
            return false;
        }
    }
    public String getCorre(){
        return JOptionPane.showInputDialog( "Ingresa el correo");
    }
    public String getPass(){
        return JOptionPane.showInputDialog( "Ingresa el Pass");
    }
    //Constructor
    public MiFrame(){
        super("Prueba de campos de texto");
        setLayout(new FlowLayout());
        
        //Crea un campo de texto con 20 columna
        field_usuario = new JTextField (20);
        add(field_usuario);
        
        //Crea un campo con el texto oculto 
        field_contrasena = new JPasswordField(20);
        add(field_contrasena);
        
        //crea un boton con texto
        button_login = new JButton("Login");
        
        button_login.addActionListener((ActionEvent e) -> {
            System.out.println("Usuario: " +
                    field_usuario.getText());
            System.out.println("contraseña: " +
                    field_contrasena.getText());
            validacion(field_usuario.getText(), field_contrasena.getText());
        });
                
        add(button_login);
    
    //mio
    
    
        String email = getCorre(); //JOptionPane.showInputDialog( "Ingresa el correo");
        while(email.equals("")){
            email = getCorre();
        }
        String pass=getPass();//JOptionPane.showInputDialog( "Ingresa la contraseña");
        int password=0;
        while(pass.equals("")){
            pass=getPass();
            if (validPass(pass)){
                password = Integer.parseInt(pass);   
            }else{
                pass="";
            }
        }
        /*if(email.equals("")){
            email = JOptionPane.showInputDialog( "Ingresa el correo");
        }
        if(password==Integer.parseInt("")){
            password = Integer.parseInt(JOptionPane.showInputDialog( "Ingresa la contraseña"));
        }*/
        boolean flag=false;
        
        for (int i=0;i<usuarios.length;i++){
            if(email.equals(usuarios[i][0])){
                if(password==Integer.parseInt(usuarios[i][1])){
                    flag=true;
                    System.out.println("Credenciales correctas");
                    break;
                }else{
                    flag=true;
                    System.out.println("usuario existente, Contraseña incorrecta");
                    break;




                }
            }
        }
    }
    private void validacion(String email, String contrasena){ 
        
      }
       
}

    

        
    

