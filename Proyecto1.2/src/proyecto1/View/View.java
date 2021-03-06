/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1.View;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import proyecto1.Control.Control;
import proyecto1.Model.Estado;
import proyecto1.Model.Model;
import proyecto1.Model.Transicion;

/**
 *
 * @author marcovinicio
 */
public class View extends javax.swing.JFrame implements Observer {

    /**
     * Creates new form View
     */
    public View() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EstadoView = new javax.swing.JFrame();
        Aceptar = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        ID = new javax.swing.JLabel();
        CampoTexto1 = new javax.swing.JTextField();
        VerificarPanel = new javax.swing.JDialog();
        VerficarField = new javax.swing.JTextField();
        AceptarVerif = new javax.swing.JButton();
        CancelarVerif = new javax.swing.JButton();
        Hilera = new javax.swing.JLabel();
        SimboloView = new javax.swing.JDialog();
        SimbolosLabel = new javax.swing.JLabel();
        SimbolosField = new javax.swing.JTextField();
        AceptarSimb = new javax.swing.JButton();
        CancelarSimb = new javax.swing.JButton();
        image = new javax.swing.JLabel();
        ArchivoFrame = new javax.swing.JDialog();
        jFileChooser1 = new javax.swing.JFileChooser();
        MenuPrincipal = new javax.swing.JMenuBar();
        Archivo = new javax.swing.JMenu();
        Guardar = new javax.swing.JMenuItem();
        Recuperar = new javax.swing.JMenuItem();
        Limpiar = new javax.swing.JMenuItem();
        Estado = new javax.swing.JMenu();
        Inicial = new javax.swing.JMenuItem();
        Intermedio = new javax.swing.JMenuItem();
        Final = new javax.swing.JMenuItem();
        Verificar = new javax.swing.JMenu();

        Aceptar.setText("Aceptar");

        Cancelar.setText("Cancelar");

        ID.setText("ID");

        javax.swing.GroupLayout EstadoViewLayout = new javax.swing.GroupLayout(EstadoView.getContentPane());
        EstadoView.getContentPane().setLayout(EstadoViewLayout);
        EstadoViewLayout.setHorizontalGroup(
            EstadoViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EstadoViewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EstadoViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ID)
                    .addGroup(EstadoViewLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(CampoTexto1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(EstadoViewLayout.createSequentialGroup()
                        .addComponent(Aceptar)
                        .addGap(18, 18, 18)
                        .addComponent(Cancelar)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        EstadoViewLayout.setVerticalGroup(
            EstadoViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EstadoViewLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(ID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CampoTexto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(EstadoViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Aceptar)
                    .addComponent(Cancelar))
                .addContainerGap(184, Short.MAX_VALUE))
        );

        VerificarPanel.setTitle("Entrada");
        VerificarPanel.setBackground(new java.awt.Color(153, 153, 255));

        AceptarVerif.setText("Aceptar");
        AceptarVerif.setActionCommand("AceptarV");

        CancelarVerif.setText("Cancelar");
        CancelarVerif.setActionCommand("CancelarV");

        Hilera.setText("Hilera");

        javax.swing.GroupLayout VerificarPanelLayout = new javax.swing.GroupLayout(VerificarPanel.getContentPane());
        VerificarPanel.getContentPane().setLayout(VerificarPanelLayout);
        VerificarPanelLayout.setHorizontalGroup(
            VerificarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VerificarPanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(VerificarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Hilera)
                    .addComponent(VerficarField, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(VerificarPanelLayout.createSequentialGroup()
                        .addComponent(AceptarVerif)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CancelarVerif)))
                .addContainerGap(371, Short.MAX_VALUE))
        );
        VerificarPanelLayout.setVerticalGroup(
            VerificarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VerificarPanelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(Hilera)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VerficarField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(VerificarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AceptarVerif)
                    .addComponent(CancelarVerif))
                .addContainerGap(175, Short.MAX_VALUE))
        );

        SimboloView.setTitle("Entrada");
        SimboloView.setBackground(new java.awt.Color(102, 102, 255));

        SimbolosLabel.setText("Simbolos");

        AceptarSimb.setText("Aceptar");
        AceptarSimb.setActionCommand("AceptarS");

        CancelarSimb.setText("Cancelar");
        CancelarSimb.setActionCommand("CancelarS");

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto1/View/3.png"))); // NOI18N

        javax.swing.GroupLayout SimboloViewLayout = new javax.swing.GroupLayout(SimboloView.getContentPane());
        SimboloView.getContentPane().setLayout(SimboloViewLayout);
        SimboloViewLayout.setHorizontalGroup(
            SimboloViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SimboloViewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(SimboloViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SimbolosLabel)
                    .addComponent(SimbolosField, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(SimboloViewLayout.createSequentialGroup()
                        .addComponent(AceptarSimb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CancelarSimb)))
                .addContainerGap(193, Short.MAX_VALUE))
        );
        SimboloViewLayout.setVerticalGroup(
            SimboloViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SimboloViewLayout.createSequentialGroup()
                .addGroup(SimboloViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SimboloViewLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(SimbolosLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SimbolosField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(SimboloViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AceptarSimb)
                            .addComponent(CancelarSimb)))
                    .addGroup(SimboloViewLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(image)))
                .addContainerGap(185, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ArchivoFrameLayout = new javax.swing.GroupLayout(ArchivoFrame.getContentPane());
        ArchivoFrame.getContentPane().setLayout(ArchivoFrameLayout);
        ArchivoFrameLayout.setHorizontalGroup(
            ArchivoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ArchivoFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jFileChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        ArchivoFrameLayout.setVerticalGroup(
            ArchivoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ArchivoFrameLayout.createSequentialGroup()
                .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MEF");

        Archivo.setText("Archivo");

        Guardar.setText("Guardar");
        Archivo.add(Guardar);

        Recuperar.setText("Recuperar");
        Archivo.add(Recuperar);

        Limpiar.setText("Limpiar");
        Archivo.add(Limpiar);

        MenuPrincipal.add(Archivo);

        Estado.setText("Estados");

        Inicial.setText("Inicial");
        Estado.add(Inicial);

        Intermedio.setText("Intermedio");
        Estado.add(Intermedio);

        Final.setText("Final");
        Estado.add(Final);

        MenuPrincipal.add(Estado);

        Verificar.setText("Verificar");
        MenuPrincipal.add(Verificar);

        setJMenuBar(MenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 643, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 419, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JButton AceptarSimb;
    private javax.swing.JButton AceptarVerif;
    private javax.swing.JMenu Archivo;
    private javax.swing.JDialog ArchivoFrame;
    private javax.swing.JTextField CampoTexto1;
    private javax.swing.JButton Cancelar;
    private javax.swing.JButton CancelarSimb;
    private javax.swing.JButton CancelarVerif;
    private javax.swing.JMenu Estado;
    private javax.swing.JFrame EstadoView;
    private javax.swing.JMenuItem Final;
    private javax.swing.JMenuItem Guardar;
    private javax.swing.JLabel Hilera;
    private javax.swing.JLabel ID;
    private javax.swing.JMenuItem Inicial;
    private javax.swing.JMenuItem Intermedio;
    private javax.swing.JMenuItem Limpiar;
    private javax.swing.JMenuBar MenuPrincipal;
    private javax.swing.JMenuItem Recuperar;
    private javax.swing.JDialog SimboloView;
    private javax.swing.JTextField SimbolosField;
    private javax.swing.JLabel SimbolosLabel;
    private javax.swing.JTextField VerficarField;
    private javax.swing.JMenu Verificar;
    private javax.swing.JDialog VerificarPanel;
    private javax.swing.JLabel image;
    private javax.swing.JFileChooser jFileChooser1;
    // End of variables declaration//GEN-END:variables
Model model;
Control control;



//------------METODOS-----------------------------------------------
    public void setModel(Model model) {
        this.model = model;
             
    }

//-----------------------------------------------------------
    public void setControl(Control control) {
        this.control = control;
        Inicial.addActionListener(control);
        Final.addActionListener(control);
        Intermedio.addActionListener(control);
        Limpiar.addActionListener(control);
        Guardar.addActionListener(control);
        Recuperar.addActionListener(control);
        Aceptar.addActionListener(control);
        Cancelar.addActionListener(control);
        Verificar.addMouseListener(control);
        AceptarVerif.addActionListener(control);
        CancelarVerif.addActionListener(control);
        AceptarSimb.addActionListener(control);
        CancelarSimb.addActionListener(control);
        jFileChooser1.addActionListener(control);
        this.addMouseMotionListener(control);
        this.addMouseListener(control);
    }

//-----------------------------------------------------------
    @Override
    public void update(Observable o, Object arg) {
       this.repaint();
    }
//-----------------------------------------------------------

    public JFrame getEstadoView() {
        return EstadoView;
    }
 //----------------VERIFICAR------------------------------------------

    public JMenu getVerificar() {
        return Verificar;
    }
    
//-----------------------------------------------------------

    public JDialog getVerificarPanel() {
        return VerificarPanel;
    }
//-----------------------------------------------------------

    public JTextField getVerficarField() {
        return VerficarField;
    }
    
//-------------------SIMBOLOS----------------------------------------

    public JTextField getSimbolosField() {
        return SimbolosField;
    }
//-----------------------------------------------------------

    public JDialog getSimboloView() {
        return SimboloView;
    }
    
//-----------------------------------------------------------
    public JMenuItem getInicial() {
        return Inicial;
    }

//-----------------------------------------------------------
    public String getValorEstado(){
        return CampoTexto1.getText();
    }

//-----------------------------------------------------------
    public JDialog getArchivoFrame() {    
        return ArchivoFrame;    
}
//----------------------------------------------------------

    public JFileChooser getjFileChooser1() {
        return jFileChooser1;
    }
    

//----------METODO GRAPHY------------------------------------
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Estado e;
        Transicion t;
        for(int i=0; i<model.getEstados().size();i++){
            e=model.getEstado(i);
            switch(model.getEstado(i).getEstado()){
                case 0: g.setColor(Color.blue);
                break;
                case 1: g.setColor(Color.green);
                break;
                case 2: g.setColor(Color.red);
                break;
            }
            g.fillOval(e.getX(),e.getY(),50,50);
            g.setColor(Color.white);
            g.drawString(e.getNombre(), e.getX()+20,e.getY()+20); 
        }
        for(int i=0; i<model.getTransiciones().size();i++){
            t=model.getTransicion(i);
            e=model.getEstado(i);
            g.setColor(Color.black);
            g.drawLine(t.getOrigen().getX()+25, t.getOrigen().getY(), t.getDestino().getX()+25, t.getDestino().getY());
            g.drawString(t.getCadenaSim(),t.getOrigen().getX(),t.getOrigen().getY());
            
        }
    }

}
//----------------------------------------------------------- 





