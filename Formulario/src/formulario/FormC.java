/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Alumno
 */
public class FormC extends JFrame implements ActionListener {
    public Image _imagenFondo;
    public URL _fondo;
    private JFrame _ventana;
    private JTextField _nombre1 ,_apat2 ,num3, _resul1 , _resul2 , _resul3 , _resul4,_esc , _amat2;
    private JButton _salir,_guardar;
    private Container _cont;
    private JLabel _titulo,_nombre , _ins , _re , _apat , _sig1 , _sig2 , _sig3, _escuela, _amat;
    Panel p;
    
    public FormC(){
        _ventana= new JFrame("Binomio al Cuadrado");
        _ventana.setBounds(400, 100, 600, 450);
        _ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        _ventana.setLocationRelativeTo(null);
        _ventana.setResizable(false);
        _ventana.setLayout(null);
        _ventana.setContentPane(new JLabel(new ImageIcon("3.jpg")));
        _cont= _ventana.getContentPane();
 
    }
    private void componentes(){
        _titulo= new JLabel("Formulario");
        _titulo.setBounds(200, 40, 300, 30);
        _titulo.setForeground(Color.white);
        _titulo.setFont( new Font("Cambria Math", Font.BOLD, 20));
        _cont.add(_titulo);
        
        _ins= new JLabel("Ingrese sus datos");
        _ins.setBounds(150, 90, 600, 30);
        _ins.setForeground(Color.white);
        _ins.setFont( new Font("Cambria Math", Font.BOLD, 18));
        _cont.add(_ins);
        
        _nombre= new JLabel("Nombre");
        _nombre.setBounds(110, 150, 300, 30);
        _nombre.setForeground(Color.white);
        _nombre.setFont( new Font("Cambria Math", Font.BOLD, 18));
        _cont.add(_nombre);
        
        _nombre1= new JTextField(1);
        _nombre1.setBounds(330, 150, 200, 30);
        _cont.add(_nombre1);
        _nombre1.addActionListener(this);
       
        _apat= new JLabel("Ap P.");
        _apat.setBounds(110, 200, 300, 30);
        _apat.setForeground(Color.white);
        _apat.setFont( new Font("Cambria Math", Font.BOLD, 18));
        _cont.add(_apat);
        
        _apat2= new JTextField(1);
        _apat2.setBounds(330, 200, 200, 30);
        _cont.add(_apat2);
        _apat2.addActionListener(this);
        
        _amat= new JLabel("Ap m.");
        _amat.setBounds(110, 250, 300, 30);
        _amat.setForeground(Color.white);
        _amat.setFont( new Font("Cambria Math", Font.BOLD, 18));
        _cont.add(_amat);
        
        _amat2= new JTextField(1);
        _amat2.setBounds(330, 250, 200, 30);
        _cont.add(_amat2);
        _amat2.addActionListener(this);
        
        _escuela= new JLabel("Escuela");
        _escuela.setBounds(110, 300, 300, 30);
        _escuela.setForeground(Color.white);
        _escuela.setFont( new Font("Cambria Math", Font.BOLD, 18));
        _cont.add(_escuela);
        
        _esc= new JTextField(1);
        _esc.setBounds(330, 300, 200, 30);
        _cont.add(_esc);
        _esc.addActionListener(this);
        
        _guardar= new JButton();
        _guardar.setBounds(250, 350, 100, 40);
        _guardar.setText("<html><font face=Cambria Math> Guardar </font></html>");
        _guardar.addActionListener(this);
        _cont.add(_guardar);
        
        _salir= new JButton();
        _salir.setBounds(400, 350, 100, 40);
        _salir.setText("<html><font face=Cambria Math>Salir</font></html>");
        _salir.addActionListener(this);
        _cont.add(_salir);
    }
    
    public void prendeApaga(Boolean prendeApaga){
        componentes();
        _ventana.setVisible(true);
    } 

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== _salir){
            JOptionPane.showMessageDialog(this, "Gracias Por Usarme :)");
            System.exit(0);
        }
        else
        {
            if(e.getSource()== _guardar)
            {
                
                
            }    
        }
    }
    
}
