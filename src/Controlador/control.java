
package Controlador;

import Modelo.Modelo;
import Vista.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class control implements ActionListener{
    
    private Vista view;
    private Modelo model;
    
    public control(Vista view,Modelo model)
    {
        this.view = view;
        this.model =model;
        this.view.btnmultiplicar.addActionListener(this);
    }
    
    public void iniciar()
    {
        view.setTitle("MVC Multiplicr");
        view.setLocationRelativeTo(null);
    }

    public void actionPerformed(ActionEvent e)
    {
        model.setNumeroUno(Integer.parseInt(view.txtnum1.getText()));
        model.setNumeroDos(Integer.parseInt(view.txtnum2.getText()));
        model.multiplicar();
        view.txtresultado.setText(String.valueOf(model.getResultado()));
    }
    
}
